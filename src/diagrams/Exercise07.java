package diagrams;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables
		int num1;
		int num2;
		
		// Ask the user for the number
		System.out.println("Introduce el primer numero: ");
		// Read the input
		num1 = reader.nextInt();
		
		// Ask the user for the second number
		System.out.println("Introduce el segundo numero: ");
		// Read the input
		num2 = reader.nextInt();
		
		// Check if num1 is higher or lower, or if equal
		if (num1 > num2) {
			System.out.println(num1 + " es mayor.");
		} else if (num1 < num2) {
			System.out.println(num2 + " es mayor.");
		} else {
			System.out.println(num1 + " y " + num2 + " son iguales.");
		}
		
		// Close the scanner
		reader.close();
	}
}
