
public class EjemploCondicionales {

	public static void main(String[] args) {

		System.out.println("Hola Rey como estas");

		int edad = 2;
		int cantidad = 2;
		if (edad >= 18) {
			System.out.println("Sos mayor de 18 y puede pasar");
		} else if (cantidad >= 2) {
			System.out.println("Usted es menor de edad pero puede pasar");
		} else {
			System.out.println("Usted no puede ingresar");
		}
	}
}
