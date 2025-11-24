package pruebas;

import java.util.Scanner;

public class cuadrado {
	public static void main(String[] args) {
		
		// Variable donde guardar el tamaño del lado
		int lado;
		
		// Scanner para leer el tamaño del lado
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el tamaño del lado al usuario
		System.out.println("Introduce el tamaño del lado del cuadrado: ");
		lado = reader.nextInt();
		
		// Bucle para dibujar el cuadrado solo los bordes
		for (int fila = 0; fila < lado; fila++) {
			for (int col = 0; col < lado; col++) {
				// Si estamos en la primera o última fila, o en la primera o última columna
				if (fila == 0 || fila == lado - 1 || col == 0 || col == lado - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();
	}
}
