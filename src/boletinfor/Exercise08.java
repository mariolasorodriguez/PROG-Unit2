package boletinfor;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int numeroA;
		int numeroB;
		
		// Declaramos variables para ver qué número es mayor y cuál es menor
		int menor;
		int mayor;

		// Pedimos los números

		System.out.println("Introduce el número A: ");
		// Leemos el número A
		numeroA = reader.nextInt();

		System.out.println("Introduce el número B: ");
		// Leemos el número B
		numeroB = reader.nextInt();

		// Mostramos los números entre A y B si es A < B o entre B y A si es B < A
		
		// Utilizamos la función Math.min y Math.max para asignar los valores a menor y mayor
		menor = Math.min(numeroA, numeroB);
		mayor = Math.max(numeroA, numeroB);
		
		/* if(numeroA < numeroB) {
			menor = numeroA;
			mayor = numeroB;
		} else {
			menor = numeroB;
			mayor = numeroA;
		} 
		*/ 
		
		for (int cont = menor; cont <= mayor; cont++) {
			System.out.println(cont);
		}
		
		// Cerramos el scanner
		reader.close();

	}

}
