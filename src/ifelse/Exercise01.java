package ifelse;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Creation of the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variable to store the number
		int number;
		
		// Declare variable to calculate the module of the number
		int evenorodd;
		
		// Ask the user for the number
		System.out.println("Introduce un numero: ");
		
		// Read the input
		number = reader.nextInt();
		
		// Calculate if divided by two
		evenorodd = number % 2;
		
		// Check if is even or odd
		if (evenorodd == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
		// Close the scanner
		reader.close();
	}

}
