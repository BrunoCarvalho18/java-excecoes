package br.com.usarthrow;

import java.io.IOException;

//ele manda a execu��o a mandar a exce��o
public class ThrowException {
	
	public static void usarThrow() throws IOException {
		throw new IOException();
	}
	
	public static void main(String[] args) throws IOException {
		usarThrow();
	}

}
