package proyectoByteBank;

public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Eitan");
		cliente.setDocumento("dasfdsdf");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cuenta.getTitular().getDocumento());
	}
}
