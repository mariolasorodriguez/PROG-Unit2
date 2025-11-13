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
		
		
	}
}
