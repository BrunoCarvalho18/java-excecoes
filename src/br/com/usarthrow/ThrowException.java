package br.com.usarthrow;

import java.io.IOException;

//ele manda a execução a mandar a exceção
public class ThrowException {
	
	public static void usarThrow() throws IOException {
		throw new IOException();
	}
	
	public static void main(String[] args) throws IOException {
		usarThrow();
	}

}
