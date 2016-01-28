/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.wordprocessor.langproc.typos;

import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.nlang.tools.CloudBasedChecker.dataprocessor.DefaultTypoDataProcessor;
import org.nlang.tools.CloudBasedChecker.datasource.CommunityLinguisticDataSource;
import org.nlang.tools.CloudBasedChecker.fixer.NoTypoFoundException;
import org.nlang.tools.CloudBasedChecker.fixer.TypoFixer;

/**
 *
 * @author hcadavid
 */
public class EnglishTyposDataSource {

	final static LinkedHashMap<String,String> equivalencesMap;
        
        static{		
		equivalencesMap=new LinkedHashMap<>();		
		
		equivalencesMap.put("helo", "hello");
		equivalencesMap.put("ello", "hello");
		equivalencesMap.put("abd", "and");
		equivalencesMap.put("abcess", "abscess");
                
				
	}
    
	/**
	 * Obj: Verificar que la palabra ingresada esté sujeta a correcciones, por ejemplo
	 * por un error típico de digitación identificado.	
	 * @param word
	 * @return la palabra correcta equivalente. Null si no hay ocurrencias.
	 */
	public String check(String word){
            
            TypoFixer tf=new TypoFixer(new DefaultTypoDataProcessor(new CommunityLinguisticDataSource()));
            
            try {
                String res=tf.checkAndFixTypo(word);
                return res;
            } catch (NoTypoFoundException ex) {
                return null;
            }
	}
	
	
}
