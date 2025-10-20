package ifelse;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		
		// Declaramos variables para los tres numeros
		int num1;
		int num2;
		int num3;
		
		
		// Pedimos al usuario que introduzca un primer numero
		System.out.print("Introduce el primer número entero: ");
		// Leemos la entrada por consola y la guardamos en la variable
		num1 = reader.nextInt();

		
		// Pedimos al usuario que introduzca un segundo numero
		System.out.print("Introduce el segundo número entero: ");
		// Leemos la entrada por consola y la guardamos en la variable
		num2 = reader.nextInt();
		

		// Pedimos al usuario que introduzca un tercer numero
		System.out.print("Introduce el tercer número entero: ");
		// Leemos la entrada por consola y la guardamos en la variable
		num3 = reader.nextInt();
		

		// Comprobamos si la suma da como resultado el otro numero
		if (num1 + num2 == num3) { 
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);

		} else if (num1 + num3 == num2) { 
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);

		} else if (num2 + num3 == num1) { 
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);

		} else { // En caso de no cumplirse, mostramos un fallo
			System.out.println("Ninguna de las sumas da como resultado el otro numero");

		}

		// Cerramos el Scanner
		reader.close();

	}

}