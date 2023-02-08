package proyectoByteBank;

public class CrearCuenta {
	
	public static void main(String[] args) {
		//    Variable           =   Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		// primeraCuenta.pais = argentina; no compila porque pais no esta definido
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 50;
		System.out.println(segundaCuenta.agencia);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}
}
