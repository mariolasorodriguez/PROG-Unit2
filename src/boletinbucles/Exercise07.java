package boletinbucles;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		// Inicializamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos un número al usuario
		System.out.print("Introduce el número de filas: ");

		// Leemos el número introducido
		int filas = reader.nextInt();

		// Bucle para las filas
		for (int i = 1; i <= filas; i++) {
			// Parte ascendente
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// Parte descendente
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			// Salto de línea después de cada fila
			System.out.println();
		}

		// Cerramos el scanner
		reader.close();
	}
}
