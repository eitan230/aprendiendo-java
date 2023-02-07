
public class EjemploCiclos2 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador < 11) {
			System.out.println("El numero es: " + contador);
			
			total += contador;
			contador ++ ;
			System.out.println(total);
		}
		
	}
}

