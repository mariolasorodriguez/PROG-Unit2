package diagrams;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables to store the numbers
		int num1;
		int num2;
		
		// Ask the user for the first number
		System.out.println("Introduce el primer numero: ");
		// Read the console
		num1 = reader.nextInt();
		
		// Ask the user for the second number
		System.out.println("Introduce el segundo numero: ");
		// Read the console
		num2 = reader.nextInt();
		
		// Show the numbers organized
		System.out.println("Numeros ordenados: ");

		// Check if num1 is lower than num2
		if (num1 < num2) {
			System.out.println(num1 + ", " + num2);
		} else {
			System.out.println(num2 + ", " + num1);
		}
		
		// Close the scanner
		reader.close();
	}
}
