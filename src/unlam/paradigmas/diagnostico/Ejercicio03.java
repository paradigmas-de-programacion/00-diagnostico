package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	// Escribir un método en Java que de una matriz numérica dada, devuelva una matriz con la misma
	// cantidad de elementos, pero donde cada valor es la suma de sus adyacentes originales
	// (arriba, abajo, izquierda, y derecha; si existen)
	public static int[][] resolver(int[][] m) {
		int[][] n = new int[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i][j] = m[i][j];
				if (i > 0) {
					n[i][j] += m[i - 1][j];
				}
				if (i < m.length - 1) {
					n[i][j] += m[i + 1][j];
				}
				if (j > 0) {
					n[i][j] += m[i][j - 1];
				}
				if (j < m[i].length - 1) {
					n[i][j] += m[i][j + 1];
				}
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int[][] m = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] n = resolver(m);
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
		//  7 11 11 
		// 17 25 23 
		// 19 29 23
	}
}
