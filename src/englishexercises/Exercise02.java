package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// Creation of the scanner
		Scanner reader = new Scanner(System.in);

		// Declare constants with the interest rates
		final double RATE_A = 1.5;
		final double RATE_B = 2.0;
		final double RATE_C = 1.5;
		final double RATE_X = 5.0;

		// Declare variables for the user input
		double amount;
		char accountType;

		// Declare a variable for the calculated interest
		double interestEarned = 0.0;

		// Ask the user for the amount of money
		System.out.print("Enter the amount of money: ");

		// Read the input
		amount = reader.nextDouble();

		// Ask the user for the account type
		System.out.println("Enter the type of account ('A', 'B', 'C', or 'X'): ");

		// Read the input (taking the first character of the input string)
		accountType = reader.next().charAt(0);

		// Calculate interest based on account type using switch
		// We convert the input to uppercase to handle both cases
		switch (Character.toUpperCase(accountType)) {
		case 'A', 'a' ->
			// If the user introduces 'A' or 'a', calculate with RATE_A
			interestEarned = amount * (RATE_A / 100);
		case 'B', 'b' ->
			// If the user introduces 'B' or 'b', calculate with RATE_B
			interestEarned = amount * (RATE_B / 100);
		case 'C', 'c' ->
			// If the user introduces 'C' or 'c', calculate with RATE_C
			interestEarned = amount * (RATE_C / 100);
		case 'X', 'x' ->
			// If the user introduces 'X' or 'x', calculate with RATE_X
			interestEarned = amount * (RATE_X / 100);
		default ->
			// If the user introduces an invalid option
			System.out.println("Invalid account type entered.");
		}

		// Show the final interest earned, only if a valid type was entered
		if (interestEarned > 0) {
			System.out.printf("The interest earned in one year is: " +  interestEarned + " percentage");
		}

		// Close the scanner
		reader.close();

	}

}
