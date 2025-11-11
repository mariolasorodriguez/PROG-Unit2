package boletinfor;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		// Pedir diez números por teclado y mostrar la media.

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int suma = 0;
		int contador;
		double media;
		int numero;
		
		// Bucle para pedir diez numeros
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Introduce el numero " + contador + ": ");
			numero = reader.nextInt();
			suma += numero;
		}
		
		// Calculamos la media
		media = suma / 10.0;
		
		// Mostramos el resultado
		System.out.println("La media de los numeros introducidos es: " + media);
		
		// Cerramos el scanner
		reader.close();
	}
}
