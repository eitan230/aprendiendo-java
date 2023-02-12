package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario eitan = new Contador();
		 eitan.setNombre("Eitan");
		 eitan.setDocumento("44613041");
		 eitan.setSalario(7000);
		 
		 System.out.println(eitan.getSalario());
		 System.out.println(eitan.getBonificacion());
	}
}
