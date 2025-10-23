package boletincondicionales;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		/*
		 * Para probar este programa primero debemos introducir un año bisiesto, por ejemplo 2024, y comprobar que al introducir el mes (2) nos dé 29 dias, en cambio si
		 * introducimos el mes (2) en 2025 nos dé 28, por que no es bisiesto, tambien comprobaremos un mes con 30 dias, como noviembre (11) y uno con 31 dias como octubre (10)
		 * en caso de que introduzcamos un mes que no es valido menor que 1 o mayor que 12 nos mostrará un error de que el mes no es válido
		 */
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		
		// Declaramos una variable para el mes
		int numeroMes;

		// Declaramos una variable para guardar el año
		int year = 0;

		// Declaramos una variable para guardar los dias
		int dias = 0;

		// Definimos una variable para saber si es bisiesto
		boolean bisiesto = year % 4 == 0;

		
		// Pedimos al usuario el año
		System.out.println("Ingrese el año: ");
		// Leemos la entrada
		year = reader.nextInt();
		
		// Pedimos al usuario el mes
		System.out.println("Ingrese el número del mes: ");
		// Leemos la entrada
		numeroMes = reader.nextInt();

		// Comprobamos el numero de mes, y según le damos un valor a la variable dias
		switch (numeroMes) {
		case 1 -> dias = 31;
		case 2 -> {
			if (bisiesto) {
				dias = 29;
			} else {
				dias = 28;
			}
		}
		case 3 -> dias = 31;
		case 5 -> dias = 31;
		case 7 -> dias = 31;
		case 8 -> dias = 31;
		case 10 -> dias = 31;
		case 12 -> dias = 31;
		case 4 -> dias = 30;
		case 6 -> dias = 30;
		case 9 -> dias = 30;
		case 11 -> dias = 30;
		
		default ->
			// Si el mes no es del 1 al 12, mostrará error
			System.out.println("Has introducido un mes incorrecto, recuerda que solo tenemos 12");
		}

		// Mostramos los resultados
		System.out.println("El mes tiene " + dias + " dias");

		// Cerramos el Scanner
		reader.close();

	}

}
