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
package org.nlang.tools.CloudBasedChecker.datasource;

import java.util.LinkedHashSet;
import java.util.Set;
import org.nlang.tools.CloudBasedChecker.fixer.TypoTouple;

/**
 *
 * @author hcadavid
 */
public class CommunityLinguisticDataSource implements LinguisticDataSource {

    private final static Set<TypoTouple> data;

    static {
        data = new LinkedHashSet<>();
        data.add(new TypoTouple("abandonned", "abandoned"));
        data.add(new TypoTouple("aberation", "aberration"));
        data.add(new TypoTouple("abilties", "abilities"));
        data.add(new TypoTouple("abilty", "ability"));
        data.add(new TypoTouple("abondon", "abandon"));
        data.add(new TypoTouple("abbout", "about"));
        data.add(new TypoTouple("wupport", "support"));
        data.add(new TypoTouple("xenophoby", "xenophobia"));
        data.add(new TypoTouple("yaching", "yachting"));
        data.add(new TypoTouple("yaer", "year"));
        data.add(new TypoTouple("yaerly", "yearly"));
        data.add(new TypoTouple("yaers", "years"));
        data.add(new TypoTouple("yatch", "yacht"));
        data.add(new TypoTouple("yearm", "year"));
        data.add(new TypoTouple("yeasr", "years"));
        data.add(new TypoTouple("yeild", "yield"));
        data.add(new TypoTouple("yeilding", "yielding"));
        data.add(new TypoTouple("Yementite", "Yemenite"));
        data.add(new TypoTouple("yera", "year"));
        data.add(new TypoTouple("yrea", "year"));
        data.add(new TypoTouple("yeras", "years"));
        data.add(new TypoTouple("yersa", "years"));
        data.add(new TypoTouple("yotube", "youtube"));
        
        for (int i=0;i<4000;i++){
            data.add(new TypoTouple("x1"+i, "xxx"+i));
        }

    }

    @Override
    public Set<TypoTouple> getData() {
        return data;
    }

}
