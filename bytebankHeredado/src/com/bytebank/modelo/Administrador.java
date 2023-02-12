package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {

    private AutenticacionUtil util;
    
    public Administrador() {
    	this.util = new AutenticacionUtil();
    }
    
    @Override
    public void setContraseña(int contraseña) {
        this.util.setClave(contraseña);
    }

    @Override
    public boolean iniciarSesion(int contraseña) {
    	return this.util.iniciarSesion(contraseña);
    }

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
