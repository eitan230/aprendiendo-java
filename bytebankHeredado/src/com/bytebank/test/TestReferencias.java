package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario =  new Contador();
		funcionario.setNombre("Juan");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jorge");
		
		funcionario.setSalario(6500);
		gerente.setSalario(6500);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(funcionario.getBonificacion());
		
	
	
	}
}
