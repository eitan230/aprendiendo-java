package com.bytebank.test;

import com.bytebank.modelo.*; // importa todo lo que esta adentro de modelo
/*import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;*/

public class TestControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(5000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(8000);
		
		ControlBonificacion control = new ControlBonificacion();
		
		control.registrarSalario(diego);
		control.registrarSalario(jimena);
		control.registrarSalario(alexis);
		
	}
}
