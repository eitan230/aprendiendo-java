package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(100, 120);
		cuenta.deposita(1200);
		try {
			cuenta.saca(1300);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("caca");
	}
}
