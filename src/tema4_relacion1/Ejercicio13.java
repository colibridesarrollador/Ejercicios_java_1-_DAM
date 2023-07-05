package tema4_relacion1;

import java.util.Scanner;

/**
 * 13. Implementa un programa que lea 5 números por teclado y visualice la suma
 * de ellos. Utiliza un bucle do..while
 * 
 * @author Colibrí
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int numero = 0;
		
		int i =0;
		
		do {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			suma+=numero;
			i++;
		}while(i < 5);
		
		sc.close();
		System.out.println("La suma de los números resulta: "+suma);
	}

}
