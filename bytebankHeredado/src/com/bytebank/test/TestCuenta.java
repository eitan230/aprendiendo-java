package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = null;
		int num = 0;
		int resultado = 30/0;
		System.out.println(resultado);
		
		CuentaAhorro ca = new CuentaAhorro(2, 5);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
