/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.wordprocessor.langproc.typos;

import org.nlang.tools.CloudBasedChecker.dataprocessor.DefaultTypoDataProcessor;
import org.nlang.tools.CloudBasedChecker.datasource.CommunityLinguisticDataSource;
import org.nlang.tools.CloudBasedChecker.fixer.NoTypoFoundException;
import org.nlang.tools.CloudBasedChecker.fixer.TypoFixer;

/**
 *
 * @author hcadavid
 */
public class EnglishTyposDataSource {

    
	/**
	 * Obj: Verificar que la palabra ingresada esté sujeta a correcciones, por ejemplo
	 * por un error tipico de digitacion identificado.	
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
