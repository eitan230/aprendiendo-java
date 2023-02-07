
public class EjemploMatriz {
	public static void main(String[] args) {
		
		for(int fila=0; fila<=14; fila++) {
			for(int columna=0; columna < fila; columna++) {
				if(columna >  fila){
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
