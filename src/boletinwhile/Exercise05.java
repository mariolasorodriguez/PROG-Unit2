package boletinwhile;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int edad = 0;
		int sumaEdades = 0;
		int contadorAlumnos = 0;
		int contadorMayores = 0;
		double mediaEdades;

		// Pedimos edades hasta que se introduzca una negativa
		while (edad >= 0) {
			System.out.print("Introduce la edad del alumno (negativa para terminar): ");
			edad = reader.nextInt();

			if (edad >= 0) {
				sumaEdades += edad;
				contadorAlumnos++;
				if (edad >= 18) {
					contadorMayores++;
				}
			}
		}

		// Calculamos la media si se han introducido alumnos
		if (contadorAlumnos > 0) {
			mediaEdades = (double) sumaEdades / contadorAlumnos;

			// Mostramos los resultados
			System.out.println("Suma de todas las edades: " + sumaEdades);
			System.out.println("Media de las edades: " + mediaEdades);
			System.out.println("Número de alumnos: " + contadorAlumnos);
			System.out.println("Número de mayores de edad: " + contadorMayores);
		} else {
			System.out.println("No se introdujeron edades válidas.");
		}

		// Cerramos el scanner
		reader.close();
	}
}
