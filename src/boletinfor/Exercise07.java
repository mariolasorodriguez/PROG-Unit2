package boletinfor;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int numero;
		boolean esPrimo = true;

		// Pedimos el número
		System.out.print("Introduce un número entero positivo: ");
		// Leemos el número
		numero = reader.nextInt();

		// Comprobamos que el número es positivo
		if (numero < 0) {
			System.out.println("El número debe ser positivo.");
		} else {

			// Comprobamos si el número es primo
			if (numero <= 1) {
				esPrimo = false;
			} else {
				for (int contador = 2; contador * contador <= numero; contador++) {
					if (numero % contador == 0) {
						esPrimo = false;
					}
				}
			}

		}

		// Mostramos el resultado
		if (esPrimo) {
			System.out.println("El número " + numero + " es primo.");
		} else {
			System.out.println("El número " + numero + " no es primo.");
		}

		// Cerramos el scanner
		reader.close();

	}
}
