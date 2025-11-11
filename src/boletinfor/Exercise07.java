package boletinfor;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		// Realiza un programa en java que pida un número entero positivo y nos diga si
		// es primo o no.

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int numero;
		boolean esPrimo = true;

		// Pedimos el número
		System.out.print("Introduce un número entero positivo: ");
		// Leemos el número
		numero = reader.nextInt();

		// Comprobamos si el número es primo
		if (numero <= 1) {
			esPrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
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
