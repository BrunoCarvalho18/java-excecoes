package br.com.unchecked;

import java.io.FileReader;

//Exce��o n�o esperada pelo computador
public class UncheckedExceptions {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader file  = new FileReader("pom.xml");
			
			file = null;
			
			file.read();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
