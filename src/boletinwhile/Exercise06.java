package boletinwhile;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {

		// Creamos e inicializamos el Scanner para leer datos desde teclado
		Scanner reader = new Scanner(System.in);

		// Variable para almacenar la altura que introduce el usuario
		int altura;
		// Variable que mantiene la mayor altura registrada hasta ahora
		int arbolMasAlto = 0;

		// Pedimos al usuario que introduzca alturas en centímetros; introducir -1 para terminar
		System.out.println("Introduce la altura de los árboles en centímetros (-1 para terminar):");
		System.out.print("Altura: ");
		altura = reader.nextInt();

		// Continuamos solicitando alturas mientras no se reciba -1
		while (altura != -1) {
			// Si la altura actual es mayor que la máxima conocida, la actualizamos
			if (altura > arbolMasAlto) {
				arbolMasAlto = altura;
			}

			// Solicitamos la siguiente altura
			System.out.print("Altura: ");
			altura = reader.nextInt();
		}

		// Imprimimos el resultado final
		if (arbolMasAlto > 0) {
			// Si se introdujo al menos una altura válida (>0), mostramos la mayor
			System.out.println("La altura del árbol más alto es: " + arbolMasAlto + " cm.");
		} else {
			// Si no hubo entradas válidas, notificamos al usuario
			System.out.println("No se introdujeron alturas válidas.");
		}

		// Cerramos el Scanner para liberar recursos
		reader.close();

	}

}