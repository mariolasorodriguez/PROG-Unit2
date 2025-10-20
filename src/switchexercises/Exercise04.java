package switchexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Creamos un scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Declaramos una variable para guardar la primera y segunda tirada
		String primeraTirada;
		String segundaTirada;
		
		
		// Declaramos variables para almacenar los numeros transformados de cadenas
		int numPrimera;
		int numSegunda;
		
		
		// Preguntamos al usuario cuanto ha sacado en la primera tirada
		System.out.println("Introduce en texto lo que has sacado en la primera tirada: ");
		// Leemos la entrada
		primeraTirada = reader.next();
		
		
		// Preguntamos al usuario cuanto ha sacado en la segunda tirada
		System.out.println("Introduce en texto lo que has sacado en la segunda tirada: ");
		// Leemos la entrada
		segundaTirada = reader.next();
		
		
		// Comprobamos que ha sacado en la primera tirada y lo pasamos a numero para guardarlo en la misma variable
		numPrimera = switch (primeraTirada) {
		case "UNO", "uno" -> { 
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO", "cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {System.out.println("La primera tirada no contiene un numero valido, empieza de nuevo");
			yield 0;
		}
		};
		
		// Comprobamos que ha sacado en la segunda tirada y lo pasamos a numero para guardarlo en la misma variable
		numSegunda = switch (segundaTirada) {
		case "UNO", "uno" -> { 
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO", "cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {System.out.println("La segunda tirada no contiene un numero valido, empieza de nuevo");
			yield 0;
		}
		};
				
		// Sumamos las dos jugadas
		System.out.println("Resultado de la suma de las dos tiradas: " + (numPrimera + numSegunda));
		
		// Cerramos el scanner
		reader.close();
	}

}
