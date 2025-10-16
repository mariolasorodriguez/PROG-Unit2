package diagrams;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		
		// Creation of the scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables
		int grade;
		
		// Ask the user for the first number
		System.out.println("Introduce la nota: ");
		// Read the input 
		grade = reader.nextInt();
		
		// Check the grades and print the results
		if (grade >= 0 && grade < 3) {
			System.out.println("Tu nota es: Muy deficiente");

		}	else if (grade >= 3 && grade < 5) {
			System.out.println("Tu nota es: Insuficiente");
			
		} 	else if (grade >= 5 && grade < 7) {
			System.out.println("Tu nota es: Bien");
			
		}	else if (grade >= 7 && grade < 9) {
			System.out.println("Tu nota es: Notable");
			
		}	else if (grade >= 9 && grade <= 10) {
			System.out.println("Tu nota es: Sobresaliente");
		
		}	else {
			System.out.println("La nota debe estar entre 0 y 10");
		}
			
	}
}
