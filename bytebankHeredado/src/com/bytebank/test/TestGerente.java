package com.bytebank.test;

import com.bytebank.modelo.Gerente;

public class TestGerente {
	
	public static void main(String[] args) {
		Gerente eitan = new Gerente();
		 eitan.setNombre("Eitan");
		 eitan.setDocumento("44613041");
		 eitan.setContraseña(4455);
		 eitan.setSalario(8000);

		 
		 System.out.println(eitan.getBonificacion());
	}
}
