package diagrams;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables to store the number
		int num;
		
		// Ask the number to the user
		System.out.println("Introduce un numero: ");
		// Read the console
		num = reader.nextInt();
		
		// Check if the number is positive or negative
		if (num >= 0) {
			System.out.println("Numero positivo");
		} else {
			System.out.println("Numero negativo");
		}
		
		// Close the scanner
		reader.close();
	}
}
