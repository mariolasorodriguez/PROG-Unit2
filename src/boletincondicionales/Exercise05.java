package boletincondicionales;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		/*
		 * Para probar este programa tendremos que ingresar primero una distancia de menos de 800km y una estancia de menos de 7 dias
		 * de esta manera nos mostrará que no hay descuentos disponibles, por lo que el precio no tendrá ningún descuento aplicado,
		 * en cambio cuando introduzcamos una cantidad de km superior a 800 y una estancia superior a 7 dias, el programa mostrara
		 * que ha aplicado un descuento y mostrará el precio final con el descuento y el precio antes del descuento
		 */
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		
		// Declaramos una constante con el precio por kilometro
		final double PRECIO_POR_KM = 2.5;
		
		// Declaramos constante para el porcentaje de descuento
		final double DESCUENTO = 0.30;

		// Declaramos otra constante de los dias minimos para poder aplicar el descuento
		final int DIAS_DESCUENTO = 7;

		// Declaramos constante para la distancia minima para poder aplicar el descuento
		final int DISTANCIA_DESCUENTO = 800;

		// Declaramos una variable para la distancia
		double distancia;

		// Declaramos una variable para los dias de estancia
		int diasEstancia;

		// Declaramos una variable para el precio base
		double precioBase;

		// Declaramos una variable para el descuento
		double descuentoAplicado = 0;

		// Declaramos una variable para el precio final
		double precioFinal;
		

		// Preguntamos la distancia en KM
		System.out.print("Introduce la distancia en KM a recorrer: ");
		
		// Leemos la entrada
		distancia = reader.nextDouble();

		// Preguntamos los dias de estancia
		System.out.print("Ingrese el número de días de estancia: ");
		
		// Leemos la entrada
		diasEstancia = reader.nextInt();

		// Calculamos el precio base sin descuento
		precioBase = distancia * PRECIO_POR_KM;

		// Comprobamos si se cumplen las condiciones de descuento
		if ((diasEstancia > DIAS_DESCUENTO) && (distancia > DISTANCIA_DESCUENTO)) {
			// Aplicamos descuento si coincide
			descuentoAplicado = precioBase * DESCUENTO;
			precioFinal = precioBase - descuentoAplicado;

			System.out.println("Ha obtenido un descuento por cumplir los minimos de estancia y distancia");
			System.out.println("Se ha aplicado un descuento del 30% al billete.");
			System.out.println("Precio sin descuento: " + precioBase + " €");
			
		} else {
			// Si no hay descuento directamente pondrá el precio final de billete
			precioFinal = precioBase;

			System.out.println("No tiene descuentos disponibles.");
		}

		// Mostramos los resultados
		System.out.println("PRECIO FINAL DEL BILLETE: " + precioFinal + " €");

		// Cerrar el objeto Scanner
		reader.close();
	}
}