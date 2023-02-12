package com.bytebank.modelo;

/**
 * Cuenta 
 * 
 * @version 1.0
 * @author Admin
 *
 *
 *
 */

public abstract class Cuenta {

	// MODIFICADORES DE ACCESO:
	// public: accesible desde cualquier parte
	// default: accesible solo desde las clases del mismo paquete
	// protected: accesible por paquete y herencia
	// private: solo accesible dentro de la clase

	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	/**
	 * Constructor por defecto
	 */

	public Cuenta() {

	}

	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + this.numero);

		Cuenta.total++;
	}

	public abstract void deposita(double valor);

	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error este devuelve	
	 * una exception
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;
	}

	public boolean transfiere(double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

}
