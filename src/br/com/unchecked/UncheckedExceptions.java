package br.com.unchecked;

import java.io.FileReader;

//Exceção não esperada pelo computador
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
