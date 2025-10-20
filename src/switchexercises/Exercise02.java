package switchexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		// Creamos un scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos una variable para guardar el numero de dia
		int numdia;
		
		// Preguntamos al usuario el numero
		System.out.println("Introduce un numero entre el 1 y el 7: ");
		// Leemos la entrada y la guardamos en la variable
		numdia = reader.nextInt();
		
		// Comprobamos que dia corresponde a cada numero
		switch (numdia) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miercoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sabado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("El numero debe estar comprendido entre el 1 y el 7");
		}
		
		// Cerramos el scanner
		reader.close();
	}

}
