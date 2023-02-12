package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorro;

public class TestString {
	public static void main(String[] args) {
		
		// No se usa en el mundo real
		// String nombre2 = new String("Alura");
		String nombre = "Alura";
		
		System.out.println(nombre);
		nombre = nombre.toUpperCase();
		nombre = nombre.replace("A", "E");
		nombre = nombre.concat(" Culo");
		nombre = nombre.toLowerCase();
		nombre = nombre.replace("e", "a");
		char letra = 'a';
		
		printLine(nombre);
		printLine(1);
		printLine(letra);
		printLine(new CuentaAhorro(200, 200));
		
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor);
	}
	
}
