package englishexercises;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {

		// Declare variables for the input
		int mirrorHour;
		int mirrorMinute;

		// Declare variables for the calculated real time
		int realHour;
		int realMinute;
		
		// Creation of the scanner
		Scanner reader = new Scanner(System.in);

		// Ask the user for the hour in the mirror
		System.out.println("Introduce the hour that you are seeing in the mirror:");
		
		// Read the hour input
		mirrorHour = reader.nextInt();
		
		// Ask the user for the minute in the mirror
		System.out.println("Introduce the minute that you are seeing in the mirror:");
		
		// Read the minute input
		mirrorMinute = reader.nextInt();


		// if hour==12 I change it to 0 to operate later
		mirrorHour = (mirrorHour == 12) ? 0 : mirrorHour;

		// Hour oclock
		if (mirrorMinute == 0) {
			realHour = 12 - mirrorHour;
			realMinute = 0;

		} else {
			// Not hour oclock
			realHour = 11 - mirrorHour;
			realMinute = 60 - mirrorMinute;
		}
		
		// Handle 0 hour case which should be 12
		if (realHour == 0) {
		    realHour = 12;
		}

		// Show the final real time
		System.out.print("The real time is: ");
		
		// If the hours are less than 10, add a leading zero
		if (realHour < 10) {
			System.out.print("0");
		}
		System.out.print(realHour + ":");

		// If the minutes are less than 10, add a leading zero
		if (realMinute < 10) {
			System.out.print("0");
		}
		System.out.println(realMinute);

		// Close the scanner
		reader.close();
	}
}
