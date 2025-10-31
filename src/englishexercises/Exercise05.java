package englishexercises;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {

		// Creation of the scanner
		Scanner reader = new Scanner(System.in);

		// Declare variables for the physics data
		double velocity = 0;
		double displacement = 0;
		double time = 0;

		// Declare variables to store the user input
		char type1;
		char type2;
		double value1;
		double value2;

		// Ask the user for the first type of data
		System.out.println("Introduce one type of data (V, D, or T):");
		// Read the input
		type1 = reader.next().toUpperCase().charAt(0);

		// Ask for the value for that data
		System.out.println("Introduce the value for that data:");
		// Read the input
		value1 = reader.nextDouble();

		// Ask the user for the second type of data
		System.out.println("Introduce another type of data (V, D, or T):");
		// Read the input
		type2 = reader.next().toUpperCase().charAt(0);

		// Ask for the value for that data
		System.out.println("Introduce the value for that data:");
		// Read the input
		value2 = reader.nextDouble();

		// Assign the first value to its corresponding variable
		switch (type1) {
		case 'V' -> velocity = value1;
		case 'D' -> displacement = value1;
		case 'T' -> time = value1;
		}

		// Assign the second value to its corresponding variable
		switch (type2) {
		case 'V' -> velocity = value2;
		case 'D' -> displacement = value2;
		case 'T' -> time = value2;
		}

		// Calculate and print the result

		// Check if user gave Displacement (D) and Time (T)
		if ((type1 == 'D' && type2 == 'T') || (type1 == 'T' && type2 == 'D')) {
			// Calculate Velocity (V)
			velocity = displacement / time;
			System.out.println("RESULT: V = " + velocity);
		}

		// Check if user gave Velocity (V) and Time (T)
		else if ((type1 == 'V' && type2 == 'T') || (type1 == 'T' && type2 == 'V')) {
			// Calculate Displacement (D)
			displacement = velocity * time;
			System.out.println("RESULT: D = " + displacement);
		}

		// Check if user gave Velocity (V) and Displacement (D)
		else if ((type1 == 'V' && type2 == 'D') || (type1 == 'D' && type2 == 'V')) {
			// Check if velocity is zero to avoid division by zero
			if (velocity == 0) {
				System.out.println("Error: Cannot calculate time when velocity is zero.");
			} else {
				// Calculate Time (T)
				time = displacement / velocity;
				System.out.println("RESULT: T = " + time);
			}
		}

		// Handle invalid input (like same type twice or invalid characters)
		else {
			System.out.println("Error: Invalid input combination. Please enter two different data types (V, D, or T).");
		}

		// Close the scanner
		reader.close();
	}
}
