
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio de main");
		try { // Puede haber un solo try, tiene que ir acompañado de un catch o finally, puede
				// haber varios catch, pero un solo finally
			metodo1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin de main");
	}

	public static void metodo1() throws MiException {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}

	public static void metodo2() throws MiException {
		System.out.println("Inicio metodo2");
		int a = 50 / 0;
		Cuenta c = null;
		c.deposita();
		throw new MiException("Surgio un error");
	}
}
