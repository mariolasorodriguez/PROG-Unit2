package switchexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos variables para los numeros
		int numero1;
		int numero2;
		
		// Declaramos una variable para la cadena introducida del menu
		String opcion;
		
		// Preguntamos al usuario el primer numero
		System.out.println("Introduce el primer numero: ");
		// Leemos el numero
		numero1 = reader.nextInt();
		
		// Preguntamos al usuario el segundo numero
		System.out.println("Introduce el segundo numero: ");
		// Leemos el numero
		numero2 = reader.nextInt();
		
		// Mostramos el menu de opciones y leemos la elegida
		System.out.println("A. SUMAR LOS NUMEROS");
		System.out.println("B. RESTAR LOS NUMEROS");
		System.out.println("C. MULTIPLICAR LOS NUMEROS");
		System.out.println("D. DIVIDIR LOS NUMEROS");
		
		opcion = reader.next();
		
		// Dependiendo de la opcion, asignamos una instruccion
		switch (opcion) {
		case "A" , "a" -> System.out.println("Resultado de la suma: " + (numero1 + numero2));
		case "B" , "b" -> System.out.println("Resultado de la resta: " + (numero1 - numero2));
		case "C" , "c" -> System.out.println("Resultado de la multiplicacion: " + numero1 * numero2);
		case "D" , "d" -> System.out.println("Resultado de la division: " + (double) numero1 / numero2);
		default -> System.out.println("Las opciones son A, B, C, D no las que te inventes, a ver si aprendemos a leer");
		}
		
		// Cerramos el scanner
		reader.close();
	}
	

}
