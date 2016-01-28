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

import java.util.Set;

/**
 *
 * @author hcadavid
 */
public interface TypoDataProcessor {
     
    /**
     * Retorna los errores registrados en la fuente de datos asociada al
     * procesador de errores tipograficos.
     * @return conjunto de errores registrados por el procesdaor de datos
     * de errores tipograficos.
     */
    Set<String> getRegisteredTypos();
    
     /**
     * Retorna la palabra correcta que normalmente corresponde al error
     * tipografico dado como parametro.
     * @param typo
     * @return 
     */
    String getEquivalentWord(String typo);
       
}
