package com.bytebank.modelo;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
	
}
