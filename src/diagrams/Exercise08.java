package diagrams;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {

		// Create a scanner
		Scanner reader = new Scanner(System.in);

		// Declare variable to store the numbers
		int num1;
		int num2;
		int num3;

		// Ask the user for the first number
		System.out.println("Introduce el primer numero: ");
		
		// Read the console
		num1 = reader.nextInt();

		// Ask the user for the second number
		System.out.println("Introduce el segundo numero: ");
		
		// Read the console
		num2 = reader.nextInt();

		// Ask the user for the third number
		System.out.println("Introduce el tercer numero: ");
		
		// Read the console
		num3 = reader.nextInt();
		
		// Compare them to see the largest and print the higher number
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " es mayor");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println(num2 + " es mayor");
		} else {
			System.out.println(num3 + " es mayor");
		}
	}
}
