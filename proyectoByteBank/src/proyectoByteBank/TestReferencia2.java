package proyectoByteBank;

public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente eitan = new Cliente();
		eitan.nombre = "Eitan";
		eitan.documento = "44613041";
		eitan.telefono = "1158877507";
		
		Cuenta cuentaEitan = new Cuenta();
		
		cuentaEitan.titular = eitan;
		
		System.out.println(cuentaEitan.titular.documento);
		System.out.println(cuentaEitan);
		System.out.println(eitan);
	}
	
}
