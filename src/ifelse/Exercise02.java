package ifelse;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		// Creation of the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaration of variables
		double number;
		
		// Ask the user for the number
		System.out.println("Introduce un numero: ");
		// Read the input
		number = reader.nextDouble();
		
		// Check if the number is close to 0
		if (number > -1 && number < 0 || (number > 0 && number < 1)) {
			System.out.println("Tu numero es casi 0");
		} else {
			System.out.println("Tu numero no es casi 0");
		}
		
		// Close the scanner
		reader.close();
	}

}
