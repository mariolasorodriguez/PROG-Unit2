package boletinbucles;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la variable para los numeros introducidos
		int numeroA;
		int numeroB;
		
		// Pedimos el primer numero al usuario
		System.out.println("Introduce el numero A: ");
		// Leemos el primer numero
		numeroA = reader.nextInt();
		
		// Pedimos el segundo numero al usuario
		System.out.println("Introduce el numero B: ");
		// Leemos el segundo numero
		numeroB = reader.nextInt();
		
		// Creamos el bucle para el máximo común divisor
		while (numeroB != 0) {
			int temp = numeroB;
			numeroB = numeroA % numeroB;
			numeroA = temp;
		}
		
		// Mostramos el máximo común divisor
		System.out.println("El máximo común divisor es: " + numeroA);
		
		// Cerramos el scanner
		reader.close();
		
	}
}
