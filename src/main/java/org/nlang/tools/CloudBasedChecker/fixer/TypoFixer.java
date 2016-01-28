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
package org.nlang.tools.CloudBasedChecker.fixer;

import org.nlang.tools.CloudBasedChecker.dataprocessor.TypoDataProcessor;

/**
 *
 * @author hcadavid
 */
public class TypoFixer {
    
    private final TypoDataProcessor dp;

    public TypoFixer(TypoDataProcessor dp) {
        this.dp = dp;
    }
    
    /**
     * Identifica el equivalente de un error tipográfico
     * @param typo el posible error
     * @return el equivalente correcto
     * @throws NoTypoFoundException si no esta registrado el error.
     */
    public String checkAndFixTypo(String typo) throws NoTypoFoundException{
        String equiv=dp.getEquivalentWord(typo);
        if (equiv==null){
            throw new NoTypoFoundException("Typo not registered:"+typo);
        }
        return equiv;
    }
    
}
