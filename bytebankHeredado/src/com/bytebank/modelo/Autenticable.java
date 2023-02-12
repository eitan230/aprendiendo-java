package com.bytebank.modelo;

public interface  Autenticable {
	   
	
    public void setContraseña(int contraseña);
    
    public boolean iniciarSesion(int contraseña);

	
}
