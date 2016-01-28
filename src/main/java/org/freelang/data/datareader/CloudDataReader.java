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
package org.freelang.data.datareader;

import java.net.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class CloudDataReader {

    public List<String> getData() throws CloudReadingException {
        List<String> out = new LinkedList<>();
        URL oracle;
        try {
            oracle = new URL("http://profesores.is.escuelaing.edu.co/hcadavid/typos_en/typos_eng.txt");
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.add(inputLine);
            }
            in.close();

            return out;

        } catch (MalformedURLException ex) {
            throw new CloudReadingException("Unable to read data from the cloud."+ex.getLocalizedMessage(),ex);
        } catch (IOException ex) {
            throw new CloudReadingException("Unable to read data from the cloud."+ex.getLocalizedMessage(),ex);
        }
    }

        
}
