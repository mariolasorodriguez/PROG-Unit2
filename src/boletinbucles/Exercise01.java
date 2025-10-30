package boletinbucles;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		
	// Creamos el scanner
	Scanner reader = new Scanner(System.in);
	
	// Declaramos la variable para el numero
	int numero;
	
	// Declaramos las variables
	int suma = 0;
	
	// Preguntamos el numero al usuario
	System.out.println("Introduce el numero: ");
	// Leemos el numero
	numero = reader.nextInt();
	
	// Abrimos el bucle
	while (numero >= 0) {
		suma += numero;
		System.out.println("Introduce el siguiente numero a sumar: ");
		numero = reader.nextInt();
	}
	
	// Mostramos el numero final
	System.out.println("Suma final: " + suma);
	
	// Cerramos el scanner
	reader.close();
		
	}
}
