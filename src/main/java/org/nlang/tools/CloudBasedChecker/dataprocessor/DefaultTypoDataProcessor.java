/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.nlang.tools.CloudBasedChecker.dataprocessor;

import java.util.LinkedHashSet;
import java.util.Set;
import org.nlang.tools.CloudBasedChecker.fixer.TypoTouple;
import org.nlang.tools.CloudBasedChecker.datasource.LinguisticDataSource;

/**
 *
 * @author hcadavid
 */
public class DefaultTypoDataProcessor implements TypoDataProcessor{

    LinguisticDataSource ds=null;

    public DefaultTypoDataProcessor(LinguisticDataSource ds) {
        this.ds = ds;
    }
    
    
    @Override
    public Set<String> getRegisteredTypos() {
        Set<TypoTouple> tts=ds.getData();
        Set<String> res=new LinkedHashSet<>();
        for (TypoTouple tt:tts){
            res.add(tt.getTypo());
        }
        return res;
    }


    @Override
    public String getEquivalentWord(String typo) {
        Set<TypoTouple> tts=ds.getData();
        for (TypoTouple tt:tts){
            if (tt.getTypo().compareToIgnoreCase(typo)==0){
                return tt.getEquivalent();
            }            
        }        
        return null;
    }
    
}
