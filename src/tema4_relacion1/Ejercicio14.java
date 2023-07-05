package tema4_relacion1;

import java.util.Scanner;
/**
 * 14. Resuelve el ejercicio anterior utilizando un bucle while.
 * @author Colibrí
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int numero = 0;

		int i = 0;
		while (i < 5) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			suma += numero;
			i++;
		}
		sc.close();
		System.out.println("La suma de los números resulta: " + suma);
	}

}
