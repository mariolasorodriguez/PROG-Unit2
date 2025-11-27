package exceptions;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
	
		// Creamos el scanner para leer datos
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la edad al usuario
		System.out.println("Introduzca su edad: ");
		try {
			int edad;
			edad = reader.nextInt();
			
			// Comprobamos que la edad es válida
			assert edad >= 0 && edad <= 130 : "La edad no es válida";
			
			// Devolvemos un mensaje de confirmación
			System.out.println("La edad introducida es válida: " + edad);
			}  catch (InputMismatchException e) {
				System.out.println("Error: Debe introducir un número entero para la edad.");
			} finally {
				// Cerramos el scanner
				reader.close();
			}
	}
}
