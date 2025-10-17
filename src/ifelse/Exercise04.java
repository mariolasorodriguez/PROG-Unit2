package ifelse;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos variable para guardar el numero introducido
		int numero;
		
		// Preguntamos el numero al usuario
		System.out.println("Introduce un numero: ");
		// Leer el input
		numero = reader.nextInt();
		
		// Comprobar el numero y ver las cifras que tiene
		if (numero < 0 || numero > 99999) {
			System.out.println("El numero introducido debe estar entre 0 y 99999");
		} else if (numero < 10) {
			System.out.println("El numero tiene 1 cifra");
		} else if (numero < 100) {
			System.out.println("El numero tiene 2 cifras");
		} else if (numero < 1000) {
			System.out.println("El numero tiene 3 cifras");
		} else if (numero < 10000) {
			System.out.println("El numero tiene 4 cifras");
		} else if (numero < 100000) { 
			System.out.println("El numero tiene 5 cifras");
		} 
		
		// Cerramos el scanner
		reader.close();
	}
}
