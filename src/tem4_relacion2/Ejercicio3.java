package tem4_relacion2;

import java.util.Scanner;

/**
 * 3. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Introduce el número: ");
		numero = Integer.parseInt(sc.next());
		
		for(int i=0; i<5;i++) {
			System.out.println((numero)+"  "+(numero*2)+"  "+(numero*3));
			numero+=1;
		}
		sc.close();
	}

}
