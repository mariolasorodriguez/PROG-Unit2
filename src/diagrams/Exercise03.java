package diagrams;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables to store the numbers
		int num1;
		int num2;
		
		// Declare variables to make the operations
		int add;
		int sub;
		int prod;
		double div = 0;
		
		// Ask the first number
		System.out.println("Introduce el primer numero: ");
		// Read the console
		num1 = reader.nextInt();
		
		// Ask the second number
		System.out.println("Introduce el segundo numero: ");
		// Read the console
		num2 = reader.nextInt();
		
		// Make the operations
		add = num1 + num2;
		sub = num1 - num2;
		prod = num1 * num2;
		
		// Write the results
		System.out.println("Resultado de la suma: " + add);
		System.out.println("Resultado de la resta: " + sub);
		System.out.println("Resultado de la multiplicacion: " + prod);
		
		// Check if the num2 is <= 0 to write a error
		if (num2 <= 0) {
			System.out.println("ERROR: No puedes dividir entre 0");
		} else {
			div = num1 / num2; // Make the division
			System.out.println("Resultado de la división: " + div); // Show the results of the division
		}
				
		// Close the scanner
		reader.close();
	}
}
