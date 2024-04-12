package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	// Escribir un método en Java que de una matriz cuadrada dada de dimensión
	// `nxn`,
	// devuelva una matriz con `2n-1` filas, donde cada una tendrá los datos de una
	// de las diagonales (de abajo a la izquierda hacia arriba a la derecha)

	/*
	 * Ejemplo: Para la matriz
	 * 
	 * 1 2 3 4
	 * 5 6 7 8
	 * 9 10 11 12
	 * 13 14 15 16
	 * 
	 * La salida debe ser
	 * 
	 * 13
	 * 9 14
	 * 5 10 15
	 * 1 6 11 16
	 * 2 7 12
	 * 3 8
	 * 4
	 */

	public static int[][] resolver(int[][] m) {
		int[][] n = new int[2 * m.length - 1][];
		for (int i = 0; i < n.length; i++) {
			int x = i < m.length ? 0 : i - m.length + 1;
			int y = i < m.length ? m.length - i - 1 : 0;
			int len = i < m.length ? i + 1 : 2 * m.length - i - 1;
			n[n.length - 1 - i] = new int[len];
			for (int j = 0; j < len; j++) {
				n[n.length - 1 - i][j] = m[x + j][y + j];
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int[][] m = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		int[][] n = resolver(m);
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}
