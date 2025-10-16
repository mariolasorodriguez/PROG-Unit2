package diagrams;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		
				// Create the scanner
				Scanner reader = new Scanner(System.in);

				// Declare variable for number of hours worked
				int numHours;

				// Declare variable for the hours rate
				double hoursRate;

				// Declare variable for the gross salary
				double salGross;

				// Declare variable for the net salary
				double salNet;

				// Declare variable for the Taxes or rates 
				double rates = 0;

				// Declare variable for the name of the employee
				String name;

				
				// Ask the user for the name
				System.out.println("Introduce su nombre: ");
				// Read the input
				name = reader.nextLine();

				// Ask the user for the hours worked
				System.out.println("Introduce el número de horas que trabaja: ");
				// Read the input
				numHours = reader.nextInt();

				// Ask the user for the rate
				System.out.println("Introduce el valor de la tarifa por hora: ");
				// Read the input
				hoursRate = reader.nextDouble();

				
				// Calcule the gross salary
				if (numHours <= 35) {
					// If you work 35 hours or less, it is multiplied directly.
					salGross = numHours * hoursRate;
				} else {
					// If you work more than 35 hours, overtime is paid at 1.5 times the rate.
					salGross = 35 * hoursRate + (numHours - 35) * hoursRate * 1.5;
				}

				// Calculate net salary by applying taxes based on gross salary
				if (salGross <= 500) {
					// If the gross salary is less than or equal to 500, no taxes are applied.
					salNet = salGross;
				} else if (salGross <= 900) {
					// If it is between 501 and 900, a 25% tax is applied.
					rates = salGross * 0.25;
					salNet = salGross - rates;
				} else {
					// If it is greater than 900, a 45% tax is applied.
					rates = salGross * 0.45;
					salNet = salGross - rates;
				}

				// Show the results
				System.out.println("Nombre: " + name);
				System.out.println("Salario Neto: " + salNet);
				System.out.println("Salario Bruto: " + salGross);
				System.out.println("Tasas: " + rates);

				// Close the scanner
				reader.close();
	}
}
