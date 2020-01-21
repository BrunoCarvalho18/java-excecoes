package br.com.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Exceção esperada pelo compilador
public class CheckedExceptions {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader file  = new FileReader("algumarquivo.txt");
			
		} catch (FileNotFoundException e) {
			//Printar a stack por favor
			e.printStackTrace();
		}
	}

}
