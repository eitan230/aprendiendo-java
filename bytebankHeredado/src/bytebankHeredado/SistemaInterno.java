package bytebankHeredado;

public class SistemaInterno {
	
	public boolean autentica(Autenticable funcionarioAutenticable, int clave){
		boolean puedeIniciarSesion = funcionarioAutenticable.iniciarSesion(clave);
		if(puedeIniciarSesion){
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
