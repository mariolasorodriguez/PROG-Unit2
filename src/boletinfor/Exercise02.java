package boletinfor;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int contMult = 0;
		
		// Numero introducido por el usuario
		int numero;
		
		// Pedimos al usuario un numero
		System.out.println("Introduce un numero entero: ");
		// Leemos el numero
		numero = reader.nextInt();
		
		// Bucle para contar los multiplos de 3 entre 1 y el numero introducido
		for (int contador = 1; contador <= numero; contador++) {
			if (contador % 3 == 0) {
				contMult++;
			}
		}
		
		// Mostramos el resultado
		System.out.println("Cantidad de multiplos de 3 entre 1 y " + numero + ": " + contMult);
		
		// Cerramos el scanner
		reader.close();
	}
}
