package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	// Escribir un método en Java que permita comprobar si la diagonal principal de una matriz cuadrada
	// de enteros tiene en cada posición un valor igual a la suma de todos los valores de las posiciones
	// anteriores de dicha diagonal. 
	public static boolean resolver(int[][] m) {
		int suma = m[0][0];
		for (int i = 1; i < m.length; i++) {
			if (m[i][i] != suma) {
				return false;
			}
			suma += m[i][i];
		}
		return true;
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
			{4, 1, 6},
			{7, 8, 2}
		};
		System.out.println(resolver(n)); // true
	}
}
