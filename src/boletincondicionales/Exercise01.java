package boletincondicionales;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		/*
		 * Minimo debemos hacer pruebas de un numero negativo, menor que 0, otro que se pase de 9999
		 * también tendremos que comprobar numeros capicua de 1 sola cifra, de 2 cifras, de 3 cifras y de 4 cifras
		 * Cuando el numero sea capicua nos mostrara un mensaje de "Es capicua" de no serlo mostrara "No es capicua"
		 * en caso de que el numero introducido sea menor de 0 y mayor de 9999 nos mostrara un error antes de empezar
		 * a comparar nada
		 */
		
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos variable para guardar el numero
		int numero;
		
		// Declaramos variables para los digitos
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		
		// Preguntamos al usuario por el numero
		System.out.println("Introduce un numero del 0 al 9999: ");
		
		// Leemos la entrada y la guardamos en la variable
		numero = reader.nextInt();
		
		// Hacemos las comprobaciones de los numeros
		if (numero < 0 || numero > 9999) { // Comprobamos si el número esta el rango
			System.out.println("El número introducido debe estar entre 0 y 9999.");

		} else if (numero < 10) {
			// Si el numero es menor que 10, es decir con una cifra, siempre sera capicua
			System.out.println("El número " + numero + " es capicúa");

			
		} else if (numero < 100) { // Si el numero es menor que 100, se dividirá entre 10
			cifra1 = numero / 10;
			cifra2 = numero % 10;
			
			if (cifra1 == cifra2) {
				System.out.println("El número " + numero + " es capicúa");

			} else {
				System.out.println("El número " + numero + " no es capicúa");

			}
			
			
		} else if (numero < 1000) { // Si el numero es menor que 1000 se dividirá entre 100
			cifra1 = numero / 100;
			cifra3 = numero % 10;
			
			if (cifra1 == cifra3) {
				System.out.println("El número " + numero + " es capicúa");

			} else {
				System.out.println("El número " + numero + " no es capicúa");

			}
			
			
		} else { // Si el numero es de 4 cifras, se comprobaran de 2 en 2
			cifra1 = numero / 1000;
			cifra2 = (numero / 100) % 10;
			cifra3 = (numero / 10) % 10;
			cifra4 = numero % 10;

			if ((cifra1 == cifra4) && (cifra2 == cifra3)) {
				System.out.println("El número " + numero + " es capicúa");

			} else {
				System.out.println("El número " + numero + " no es capicúa");
			}
		}
		
		// Cerramos el scanner
		reader.close();
	}

}
