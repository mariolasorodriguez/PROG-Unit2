package boletinbucles;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos la variable para la hora
		int hora;

		// Declaramos la variable para los minutos
		int minutos;

		// Declaramos la variable para los segundos
		int segundos;

		// Declaramos la variable para los segundos a incrementar
		int incremento;

		// Pedimos la hora al usuario
		System.out.println("Introduce la hora: ");
		hora = reader.nextInt();

		// Pedimos los minutos al usuario
		System.out.println("Introduce los minutos: ");
		minutos = reader.nextInt();

		// Pedimos los segundos al usuario
		System.out.println("Introduce los segundos: ");
		segundos = reader.nextInt();

		// Pedimos los segundos a incrementar al usuario
		System.out.println("Introduce los segundos a incrementar: ");
		incremento = reader.nextInt();

		// Creamos el bucle para incrementar los segundos
		for (int i = 0; i < incremento; i++) {
			segundos++;
			if (segundos == 60) {
				segundos = 0;
				minutos++;
				if (minutos == 60) {
					minutos = 0;
					hora++;
					if (hora == 24) {
						hora = 0;
					}
				}
			}
		}

		// Mostramos la hora resultante
		System.out.printf("La hora resultante es: " + hora + ":" + minutos + ":" + segundos);

		// Cerramos el scanner
		reader.close();
	}
}
