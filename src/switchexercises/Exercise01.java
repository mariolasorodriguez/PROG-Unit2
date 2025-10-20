package switchexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos una variable para guardar la nota
		int nota;
		
		// Preguntamos al usuario por la nota entera
		System.out.println("Introduce tu nota: ");
		// Leemos la entrada y la guardamos en la variable
		nota = reader.nextInt();
		
		// Con un case vamos a decir a que pertenece esa nota numerica
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("La nota debe estar entre 0 y 10");
		}
		
		// Cerramos el scanner
		reader.close();
	}

}
