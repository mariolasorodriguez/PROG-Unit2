package boletinfor;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		/*
		 * Realiza un programa que pida dos números enteros A y B.
		 * Luego visualiza los números que hay entre A y B. Si A es menor que B,
		 * entonces debe mostrar los números desde A hasta B.
		 * Si B es menor que A, entonces debe mostrar los números desde B hasta A.
		 */
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int numeroA;
		int numeroB;
		
		// Pedimos los números
		
		System.out.println("Introduce el número A: ");
		// Leemos el número A
		numeroA = reader.nextInt();
		
		System.out.println("Introduce el número B: ");
		// Leemos el número B
		numeroB = reader.nextInt();
		
		// Mostramos los números entre A y B si es A < B o entre B y A si es B < A
		if (numeroA < numeroB) {
			for (int i = numeroA; i <= numeroB; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = numeroB; i <= numeroA; i++) {
				System.out.println(i);
			}
		}
		
		// Cerramos el scanner
		reader.close();
		
	}

}
