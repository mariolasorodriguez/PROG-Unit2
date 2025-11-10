package boletindowhile;

public class Exercise01 {
	public static void main(String[] args) {
		
		// Declaramos las variables
		int numero = 1;
		
		System.out.println("Mostrando los numeros del 1 al 20:");
		
		// Creamos el bucle para mostrar los numeros del 1 al 20
		do {
			System.out.println(numero);
			numero++;
		} while (numero <= 20);
	}
}
