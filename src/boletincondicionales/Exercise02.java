package boletincondicionales;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		/*
		 * Para hacer las comprobaciones minimo debemos introducir un valor en positivo y otro en negativo
		 * al introducir un numero positivo nos dará "El valor absoluto es X" y cuando sea negativo el numero
		 * se pasará a positivo y se mostrará de la misma manera
		 */
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos variables para guardar el numero introducido
		int numero;
		
		// Declaramos una variable booleana para guardar el valor absoluto 
		int valorAbsoluto;
		
		// Solicitamos al usuario el numero
		System.out.println("Introduce un numero: ");
		
		// Leemos la entrada y la guardamos en una variable
		numero = reader.nextInt();
		
		// Calculamos el valor absoluto, si el numero es positivo es igual, si es negativo, hay que pasarlo a positivo
		valorAbsoluto = (numero >= 0) ? numero : -(numero);
		
		// Mostramos el resultado
		System.out.println("El valor absoluto es: " + valorAbsoluto);

		// Cierre del scanner
		reader.close();
		
	}
}
