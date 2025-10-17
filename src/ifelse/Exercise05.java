package ifelse;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		
		// Creacion del scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos constantes para piedra papel o tijera
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		
		// Declaramos variables para las jugadas de cada jugador
		String jugada1;
		String jugada2;
		
		// Preguntamos las jugada del jugador 1, la leemos y guardamos en la variable
		System.out.println("JUGADOR 1 | Introduce PIEDRA, PAPEL O TIJERA: ");
		jugada1 = reader.next();
		
		// Preguntamos las jugada del jugador 2, la leemos y guardamos en la variable
		System.out.println("JUGADOR 2 | Introduce PIEDRA, PAPEL O TIJERA: ");
		jugada2 = reader.next();
		
		// Comprobamos las jugadas
		if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERAS)) {
			System.out.println("Jugada 1: INCORRECTA");
			
		} else if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERAS)) {
			System.out.println("Jugada 2: INCORRECTA");
			
		} else if (jugada1.equals(jugada2)) {
			System.out.println("¡EMPATE!"); // En caso de que las jugadas sean iguales, se dará por empate
			
		}
				
		// Cerrar el scanner
		reader.close(); 
	}
}
