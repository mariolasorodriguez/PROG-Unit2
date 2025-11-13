package boletindowhile;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int numeroN;
		int suma = 0;
		
		// Pedimos el valor del numero
		System.out.println("Introduce un numero entero: ");
		// Leemos la entrada
		numeroN = reader.nextInt();
		
		
		System.out.println("Sumando los numeros desde 1 hasta " + numeroN + ":");
		// Creamos el bucle para sumar los numeros desde 1 hasta N
		int numero = 1;
		do {
			suma += numero;
			numero++;
		} while (numero <= numeroN);
		System.out.println("La suma es: " + suma);
		
		// Cerramos el scanner
		reader.close();
		
	}
}
