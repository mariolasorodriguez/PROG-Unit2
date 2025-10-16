package diagrams;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		
		// Creation of scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables
		int hours;
		int minutes;
		int seconds;
		
		// Ask the user for the hours
		System.out.println("Introduce las horas: ");
		// Read the input
		hours = reader.nextInt();
		
		// Ask the user for the minutes
		System.out.println("Introduce los minutos: ");
		// Read the input
		minutes = reader.nextInt();
		
		// Ask the user for the seconds
		System.out.println("Introduce los segundos: ");
		// Read the input
		seconds = reader.nextInt();
		
		// Spend a second at the appointed time
		if (seconds < 59) {
			seconds++;
		}	else {
				seconds = 0;
				if (minutes < 59) {
					minutes++;
				}	else {
					minutes = 0;
					if (hours < 23) {
						hours++;
					}	else {
						hours = 0;
					}
				}
		}
		
		// Print the time
		System.out.println("Hora actualizada: " + hours + ":" + minutes + ":" + seconds);
	}
}