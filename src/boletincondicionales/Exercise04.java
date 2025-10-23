package boletincondicionales;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		/*
		 * Para probar este programa tendremos que sumar los numeros que indique
		 * el random, si la suma nuestra coincide con la que hara el programa, nos lanzará
		 * un mensaje de éxito, si la suma no coincide, nos mostrará que hemos fallado
		 */
		
		// Creamos una random para generar numeros aleatorios
		Random numAleatorio = new Random();

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos dos variables para guardar los numeros aleatorios generados
		int numero1 = numAleatorio.nextInt(1,100);
		int numero2 = numAleatorio.nextInt(1,100);

		// Declaramos una variable para el resultado
		int resultado;
		
		// Mostramos la pregunta al usuario
		System.out.println("Introduce el resultado de la suma " + numero1 + "+" + numero2);
		
		// Leemos el resultado utilizando el scanner
		resultado = reader.nextInt();
		
		// Comprobamos si es correcto
		if (resultado == (numero1 + numero2)) {
			System.out.println("¡NUMERO CORRECTO!");
		} else {
			System.out.println("¡HAS FALLADO!");
		}
		
		// Cerramos el scanner
		reader.close();
	}

}
