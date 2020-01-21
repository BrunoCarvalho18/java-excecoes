package br.com.throwss;

import java.io.FileReader;
import java.io.IOException;

//Throws ela atua na assinatura do método retornado
public class ThrowsExceptions {
	
	public static void usarThrows() throws IOException{
		FileReader  f = new FileReader("notExist.txt");
		
	}
	
	public static void main(String[] args) throws IOException {
		usarThrows();
	}

}
