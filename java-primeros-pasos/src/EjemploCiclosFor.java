import java.util.Iterator;

public class EjemploCiclosFor {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int ma = 0; ma <= 10; ma++) {
				System.out.print(i * ma);
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}
