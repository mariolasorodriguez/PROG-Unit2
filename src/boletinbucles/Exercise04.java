package boletinbucles;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la variable para los numeros introducidos
		int numeroA;
		int numeroB;
		
		// Declaramos la variable para el minimo comun multiplo
		int mcm;
		
		// Pedimos el primer numero al usuario
		System.out.println("Introduce el numero A: ");
		// Leemos el primer numero
		numeroA = reader.nextInt();
		
		// Pedimos el segundo numero al usuario
		System.out.println("Introduce el numero B: ");
		// Leemos el segundo numero
		numeroB = reader.nextInt();
		
		// Creamos el bucle para el minimo común múltiplo
		while (numeroB != 0) {
			int temp = numeroB;
			numeroB = numeroA % numeroB;
			numeroA = temp;
		}
		
		mcm = (numeroA * numeroB) / numeroA;
		
		// Mostramos el mínimo común múltiplo
		System.out.println("El mínimo común múltiplo es: " + mcm);
		
		// Cerramos el scanner
		reader.close();
		
	}
}