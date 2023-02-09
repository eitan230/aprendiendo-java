package bytebankHeredado;
//                  extiende de          implementa
public class Gerente extends Funcionario implements Autenticable{

    private AutenticacionUtil util;
    
    public Gerente() {
    	this.util = new AutenticacionUtil();
    }
	
    // Sobre-escritura de metodo
    public double getBonificacion(){
    	return super.getSalario() + (super.getSalario() * 0.05);
    }

    @Override
    public void setContraseña(int contraseña) {
        this.util.setClave(contraseña);
    }

    @Override
    public boolean iniciarSesion(int contraseña) {
    	return this.util.iniciarSesion(contraseña);
    }

}

