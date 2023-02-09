package proyectoByteBank;

public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		
		cuenta.depositar(300);
		
		System.out.println(cuenta.getSaldo());
		
		cuenta.setAgencia(-20);
		System.out.println(cuenta.getAgencia());
	}
}
