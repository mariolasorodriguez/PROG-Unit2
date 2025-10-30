package boletinbucles;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int numero = 0;
		int contador = 0;
		
		// Preguntamos al usuario el numero
		System.out.println("Introduce un numero: ");
		// Leemos por consola
		numero = reader.nextInt();
		
		// Controlamos que mientras que el numero sea mayor que 0 siga sumando
		while (numero >= 0) {
			 contador++;
			 // Pedimos un numero nuevo
			System.out.println("Introduce otro numero");
			// Leemos por consola
			numero = reader.nextInt();
		}
		
		// Mostramos el resultado en caso de que se introduzca un numero menor
		System.out.println("Numeros positivos introducidos: " + contador);
		
		// Cerramos el scanner
		reader.close();
	}
}
