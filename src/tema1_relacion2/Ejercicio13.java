package tema1_relacion2;

import java.util.Scanner;

/**
 * 14. Realiza un conversor de euros a dólares. La cantidad de euros que se
 * quiere convertir debe ser introducida por teclado.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros que quiere convertir a dólares: ");
		// El objeto scanner ( sc ) esta vez llama la función nexDouble() que recoge datos tipo double MUY IMPORTANTE
		double euros = sc.nextDouble();
		//Con Math.floor() quita los decimales ( hay otras formas para que te dé el número de decimales que necesitas )
		double dolares = Math.floor(euros * 1.09);
		
		System.out.println("En dólares: "+dolares);
		
		sc.close();
	}

}
