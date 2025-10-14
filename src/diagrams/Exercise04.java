package diagrams;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variable to store the numbers
		int num1;
		int num2;
		
		// Ask the user the first number
		System.out.println("Introduce el primer numero: ");
		// Read the console
		num1 = reader.nextInt();
		
		// Ask the second number
		System.out.println("Introduce el segundo numero: ");
		// Read the console
		num2 = reader.nextInt();
		
		// Check if num1 is higher than num2, if they are equal, or if num2 is higher
		if (num1 > num2) {
			System.out.println("El mayor es: " + num1);
		} else if (num1 == num2){
			System.out.println("Numeros iguales");
		} else {
			System.out.println("El mayor es: " + num2);
		}
		
		// Close the scanner
		reader.close();
	}
}
