package boletincondicionales;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Declaramos variable para guardar el numero de documento
		int numDocumento;
		
		
		// Declaramos una variable para contar las cifras del numero introducido
		int longitud;
		
		
		// Declaramos una variable para calcular el modulo
		int moduloDni;
		
		
		// Declaramos una variable tipo cadena para guardar la letra asignada
		String letraDni;
		
		
		// Preguntamos el numero de documento al usuario
		System.out.println("Introduce tu numero de documento (SIN LETRA): ");
		// Leemos la entrada y la guardamos en la variable
		numDocumento = reader.nextInt();
		
		
		// Convertimos el numero a una cadena para comprobar su longitud
		longitud = String.valueOf(numDocumento).length();
		
		
		// Comprobamos que sean 8 cifras las que contiene el numero
		if (longitud == 8) {
			moduloDni = (numDocumento % 23);
			
			letraDni = switch (moduloDni) {
			case 0 -> { 
				yield "T";
			}
			case 1 -> {
				yield "R";
			}
			case 2 -> {
				yield "W";
			}
			case 3 -> {
				yield "A";
			}
			case 4 -> {
				yield "G";
			}
			case 5 -> {
				yield "M";
			}
			case 6 -> {
				yield "Y";
			}
			case 7 -> {
				yield "F";
			}
			case 8 -> {
				yield "P";
			}
			case 9 -> {
				yield "D";
			}
			case 10 -> {
				yield "X";
			}
			case 11 -> {
				yield "B";
			}
			default -> {
				yield "E";
			}
			};
			
		} else {
			System.out.println("El numero de documento tiene que tener 8 cifras, introduzcalo de nuevo.");
		}
		
		
		
		
	}

}
