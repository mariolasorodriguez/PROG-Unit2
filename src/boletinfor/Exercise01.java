package boletinfor;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int numero;

		// Pedimos al usuario un numero
		System.out.println("Introduce un numero entero: ");
		// Leemos el numero
		numero = reader.nextInt();

		// Bucle para contar los numeros entre 1 y el numero introducido
		for (int contador = 1; contador <= numero; contador++) {
			System.out.println(contador);
		}

		// Cerramos el scanner
		reader.close();
	}
}
