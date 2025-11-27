package boletinbucles;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca una hora válida: ");
		int hora = reader.nextInt();
		
		assert hora >= 0 && hora <=23 : "La hora no es válida";
		
		
//		while (numAux > 0) {
//			ultimaCifra = numAux % 10;
//			numInvertido = numInvertido * 10 + ultimaCifra;
//			numAux /= 10;
//		}
	}
}
