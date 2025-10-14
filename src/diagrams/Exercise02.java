package diagrams;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {

		// Declare variable to store the age
		int age;

		// Create the scanner
		Scanner reader = new Scanner(System.in);

		// Ask the user for the age
		System.out.println("Introduce tu edad: ");
		// Read the console
		age = reader.nextInt();

		// Check the age
		if (age >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}
		
		// Close the scanner
		reader.close();
	}
}
