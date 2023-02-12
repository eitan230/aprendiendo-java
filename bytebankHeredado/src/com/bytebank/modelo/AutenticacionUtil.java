package com.bytebank.modelo;

public class AutenticacionUtil {
	
	private int clave;
	
	public boolean iniciarSesion(int clave) {
		return this.clave == clave;
	}
	
	public void setClave(int clave) {
		this.clave = clave;
	}
}
