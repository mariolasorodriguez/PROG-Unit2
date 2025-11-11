package boletinfor;

public class Exercise04 {
	public static void main(String[] args) {
		
		// Diseñar un programa que muestre la suma de los 10 primeros números impares.
		
		// Declaramos las variables
		int suma = 0;
		
		// Bucle para sumar los 10 primeros numeros impares
		for (int contador = 1; contador <= 19; contador += 2) {
			suma += contador;
		}
		
		// Mostramos el resultado
		System.out.println("La suma de los 10 primeros numeros impares es: " + suma);
		
	}
}
