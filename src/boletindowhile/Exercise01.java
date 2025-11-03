package boletindowhile;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int numero = 1;
		
		System.out.println("Mostrando los numeros del 1 al 20:");
		
		// Creamos el bucle para mostrar los numeros del 1 al 20
		while (numero <= 20) {
			System.out.println(numero);
			numero++;
		}
	}
}
