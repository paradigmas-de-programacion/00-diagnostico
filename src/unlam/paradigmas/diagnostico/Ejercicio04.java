package unlam.paradigmas.diagnostico;

import java.util.HashMap;

public class Ejercicio04 {

	// Escribir un método en Java que de una matriz numérica dada, devuelva un
	// vector
	// con `n` elementos, donde cada elemento es la moda de una fila. Si hubiese más
	// de una moda, se deberá utilizar la de mayor valor

	public static int[] resolver(int[][] m) {
		int[] n = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			HashMap<Integer, Integer> frecuencias = new HashMap<>();
			for (int j = 0; j < m[i].length; j++) {
				if (frecuencias.containsKey(m[i][j])) {
					frecuencias.put(m[i][j], frecuencias.get(m[i][j]) + 1);
				} else {
					frecuencias.put(m[i][j], 1);
				}
			}

			int moda = frecuencias.keySet().iterator().next();

			// busco la moda en el mapa, y si son iguales, me quedo con el mayor
			for (int key : frecuencias.keySet()) {
				if (frecuencias.get(key) > frecuencias.get(moda) ||
						(frecuencias.get(key) == frecuencias.get(moda) && key > moda)) {
					moda = key;
				}
			}
			n[i] = moda;
		}
		return n;
	}

	public static void main(String[] args) {
		int[][] m = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 7 }
		};
		int[] n = resolver(m);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		// 3 6 7
	}
}
