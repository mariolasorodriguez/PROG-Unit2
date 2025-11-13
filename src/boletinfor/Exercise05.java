package boletinfor;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int numero;
		long factorial = 1;

		// Pedimos al usuario un numero
		System.out.println("Introduce un numero entero para factorizar: ");
		// Leemos el numero
		numero = reader.nextInt();

		// Bucle para calcular el factorial del numero introducido
		for (int contador = 1; contador <= numero; contador++) {
			factorial *= contador;
		}

		// Mostramos el resultado
		System.out.println("El factorial de " + numero + " es: " + factorial);

		// Cerramos el scanner
		reader.close();
	}
}
