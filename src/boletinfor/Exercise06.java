package boletinfor;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		int calificacion;
		boolean haySuspenso = false;

		// Bucle para pedir 5 calificaciones
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Introduce la calificacion del alumno " + contador + ": ");
			calificacion = reader.nextInt();
			if (calificacion < 5) {
				haySuspenso = true;
			}
		}

		// Mostramos el resultado
		if (haySuspenso) {
			System.out.println("Hay suspenso entre las calificaciones introducidas.");
		} else {
			System.out.println("Todos estan aprobados en las calificaciones introducidas.");
		}

		// Cerramos el scanner
		reader.close();

	}
}
