
public class EjemploCondicionales2 {

	public static void main(String[] args) {

		System.out.println("Hola Rey como estas");

		int edad = 18;
		int cantidadPersonas = 2;
		
		boolean estaAcompañado = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && estaAcompañado;
		
		System.out.println("El valor de la condiciendo es: " + estaAcompañado );
		
		if (puedeEntrar) {
			System.out.println("Usted puede ingresar");
		} else {
			System.out.println("Usted no puede ingresar");
		}
	}
}
