package englishexercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {

		// Creation of the scanner
		Scanner reader = new Scanner(System.in);
		
		// Create a variable with the cost of the PC, initializated with the default cost
		double costPc = 375.99;
		
		// Declare variables for the extras
		int antivirusChoice;
		int printerChoice;
		
		// Declare constants with the extra prices
		final double SCREEN_38CM_COST = 75.99;
		final double SCREEN_43CM_COST = 99.99;
		final double ANTIVIRUS_COST = 65.99;
		final double PRINTER_COST = 125.00;

		// Ask the user for the screen type
		System.out.println("Buy the new PC");
		System.out.println("Default PC cost: €" + costPc);
		System.out.println("Please choose a screen size:");
		System.out.println("1. 38 cm screen: € " + SCREEN_38CM_COST);
		System.out.println("2. 43 cm screen: € " + SCREEN_43CM_COST);
		System.out.print("Enter your choice (1 or 2): ");

		// Read the input
		int screenChoice = reader.nextInt();

		// If the user introduces 1, the price will increase to the 38 cm screen
		if (screenChoice == 1) {
			costPc += SCREEN_38CM_COST;
		} else if (screenChoice == 2) {
			// If the user introduces 2, the price will increase to the 43 cm screen
			costPc += SCREEN_43CM_COST;
		} else {
			// If the user introduces a invalid options, will default to the cheapest, 38cm
			System.out.println("Invalid screen choice. Defaulting to 38 cm screen.");
			costPc += SCREEN_38CM_COST;
		}

		// Show to the user the extras for the PC
		System.out.println("Optional Extras for the PC");
		
		// Ask the user if he want a antivirus
		System.out.print("Add Antivirus software for €" + ANTIVIRUS_COST + "? (1 for yes, 0 for no): ");
		antivirusChoice = reader.nextInt();

		// If the user introduces 1, the price will increase by the antivirus price constant.
		if (antivirusChoice == 1) {
			costPc += ANTIVIRUS_COST;
		}

		// Ask the user if he want a printer
		System.out.print("Add Printer for €" + PRINTER_COST + "? (1 for yes, 0 for no): ");
		printerChoice = reader.nextInt();
		
		// If the user introduces 1, the price will increase by the printer price constant.
		if (printerChoice == 1) {
			costPc += PRINTER_COST;
		}

		// Show the final cost of the PC
		System.out.printf("Your final cost is: " + costPc + " €");

		// Close the scanner
		reader.close();
	}
}
