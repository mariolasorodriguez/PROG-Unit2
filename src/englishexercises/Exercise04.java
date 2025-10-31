package englishexercises;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		// Creation of the scanner
		Scanner reader = new Scanner(System.in);
				
		// Declare variables for input
		int amountToPay;
		int amountGiven;

		// Declare variable for the change
		int change;

		// Declare variables for coin counts
		int coin200;
		int coin100;
		int coin50;
		int coin20;
		int coin10;
		int coin5;
		int coin2;
		int coin1;

		// Declare constants for coin values in cents
		final int C_200 = 200;
		final int C_100 = 100;
		final int C_50 = 50;
		final int C_20 = 20;
		final int C_10 = 10;
		final int C_5 = 5;
		final int C_2 = 2;

		// Ask the user for the total to pay
		System.out.println("Introduce the amount to pay (in cents):");
		amountToPay = reader.nextInt();

		// Ask the user for the amount given
		System.out.println("Introduce the amount given (in cents):");
		amountGiven = reader.nextInt();

		// Calculate the total change
		change = amountGiven - amountToPay;
		System.out.println("Calculating change for: " + change + " cents");


		// Calculate the coins for 2 euros (200 cents)
		coin200 = change / C_200;
		change = change % C_200; // Get the remainder

		// Calculate the coins for 1 euro (100 cents)
		coin100 = change / C_100;
		change = change % C_100;

		// Calculate the coins for 50 cents
		coin50 = change / C_50;
		change = change % C_50;

		// Calculate the coins for 20 cents
		coin20 = change / C_20;
		change = change % C_20;

		// Calculate the coins for 10 cents
		coin10 = change / C_10;
		change = change % C_10;

		// Calculate the coins for 5 cents
		coin5 = change / C_5;
		change = change % C_5;

		// Calculate the coins for 2 cents
		coin2 = change / C_2;
		change = change % C_2;

		// The remainder is the 1 cent coins
		coin1 = change;

		// Show the final list of coins
		System.out.println("The change is:");
		System.out.print(coin200 + " ");
		System.out.print(coin100 + " ");
		System.out.print(coin50 + " ");
		System.out.print(coin20 + " ");
		System.out.print(coin10 + " ");
		System.out.print(coin5 + " ");
		System.out.print(coin2 + " ");
		System.out.println(coin1);

		// Close the scanner
		reader.close();
	}
}
