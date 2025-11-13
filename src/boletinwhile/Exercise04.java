package boletinwhile;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos una variable para el numero introducido
		int numero;
		
		// Declaramos variables para la suma de los positivos y negativos
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		
		// Declaramos variables para contar negativos y ceros
		int contadorNegativos = 0;
		int contadorCeros = 0;
		
		// Declaramos variable para la media de negativos
		double mediaNegativos;
		
		// Pedimos 10 números al usuario
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un número entero: ");
			numero = reader.nextInt();
			
			if (numero > 0) {
				sumaPositivos += numero;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		
		// Mostramos los resultados
		System.out.println("Suma de los números positivos: " + sumaPositivos);
		if (contadorNegativos > 0) {
			mediaNegativos = (double) sumaNegativos / contadorNegativos;
			System.out.println("Media de los números negativos: " + mediaNegativos);
		} else {
			System.out.println("No se introdujeron números negativos.");
		}
		System.out.println("Número de ceros introducidos: " + contadorCeros);
		
		// Cerramos el scanner
		reader.close();
	}
}
