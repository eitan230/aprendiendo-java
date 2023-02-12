package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(020, 200);
		
		
		Object[] cuentas = new Object[5];
		cuentas[1] = cc;
		
		CuentaAhorro ca = new CuentaAhorro(55, 60);
		cuentas[2] = ca;
	
		Cliente cliente = new Cliente();
		cuentas[3] = cliente;    
		
		cuentas[0] = new CuentaCorriente(33, 22);
		
		for(int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}
}
