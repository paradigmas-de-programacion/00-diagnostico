package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	// Escribir un método en Java que permita comprobar si la multiplicación de todos los valores
	// de una matriz numérica, dará 0 o no.
	public static boolean resolver(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] m = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		System.out.println(resolver(m)); // false

		int[][] n = {
			{1, 2, 3},
			{4, 0, 6},
			{7, 8, 9}
		};
		System.out.println(resolver(n)); // true
	}
}
