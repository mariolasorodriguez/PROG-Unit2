package boletindowhile;

public class Exercise02 {
	public static void main(String[] args) {
		
		// Declaramos las variables
		int numero = 0;
		
		System.out.println("Mostrando los numeros pares del 1 al 200:");
		
		// Creamos el bucle para mostrar los numeros pares del 1 al 200
		do {
			System.out.println(numero);
			numero += 2;
		} while (numero <= 200);
	}
}
