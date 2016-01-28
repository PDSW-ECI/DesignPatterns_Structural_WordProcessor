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

/**
 *
 * @author hcadavid
 */
public class TypoTouple {
    
    String typo;
    String equivalent;

    public TypoTouple(String typo, String equivalent) {
        this.typo = typo;
        this.equivalent = equivalent;
    }

    public String getTypo() {
        return typo;
    }

    public void setTypo(String typo) {
        this.typo = typo;
    }

    public String getEquivalent() {
        return equivalent;
    }

    public void setEquivalent(String equivalent) {
        this.equivalent = equivalent;
    }
    
    
    
}
