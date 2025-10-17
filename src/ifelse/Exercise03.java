package ifelse;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		// Creacion del scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos variables para las coeficientes
		int a;
		int b;
		int c;
		
		// Declaramos variable para guardar las soluciones
		double x1;
		double x2;
		
		// Declaramos variable para guardar el discriminante
		double discriminante;
		
		// Preguntamos al usuario por el coeficiente C
		System.out.println("Introduce el coeficiente A: ");
		// Leemos la entrada
		a = reader.nextInt();
		
		// Preguntamos al usuario por el coeficiente B
		System.out.println("Introduce el coeficiente B: ");
		// Leemos la entrada
		b = reader.nextInt();
		
		// Preguntamos al usuario por el coeficiente C
		System.out.println("Introduce el coeficiente C:");
		// Leemos la entrada
		c = reader.nextInt();
		
		// Calcular el discriminante
		discriminante = b*b - 4*a*c;
		
		// Si a es igual a 0, solo hay una solucion
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuacion tiene solo una solucion");
		} else if (discriminante >= 0) {
			// Si es positivo tiene solucion, aplica formulas
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else {
			// Si es negtivo no tiene solucion
			System.out.println("La ecuación no tiene soluciones");
		}
		
		// Cerramos el scanner
		reader.close();
	}
}
