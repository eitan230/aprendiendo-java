package bytebankHeredado;

public class TestAutenticar {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		SistemaInterno sistema = new SistemaInterno();
		
		gerente.setNombre("Eitan");
		System.out.println(gerente.getNombre());
		
		gerente.setContraseña(12345);
		
		sistema.autentica(gerente, 12345);
	}
}
