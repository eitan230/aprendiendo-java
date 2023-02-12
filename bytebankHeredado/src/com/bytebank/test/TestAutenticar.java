package com.bytebank.test;

import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.SistemaInterno;

public class TestAutenticar {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		SistemaInterno sistema = new SistemaInterno();
		
		gerente.setNombre("Eitan");
		System.out.println(gerente.getNombre());
		
		gerente.setContraseña(12345);
		
		sistema.autentica(gerente, 12345);
	}
}
