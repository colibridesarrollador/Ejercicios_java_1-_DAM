package tema4_relacion1;

import java.util.Scanner;

/**
 * 5. Implementa un programa que pida una edad por teclado. Si la edad es mayor
 * de 110 o menor de 0, mostrará un mensaje diciendo que la edad no es correcta.
 * Si la edad es correcta y mayor de 18, mostrará un mensaje diciendo que es
 * mayor de edad y si es menor de 18, mostrará un mensaje diciendo que es menor
 * de edad.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		sc.close();
		if (edad > 110 || edad <= 0)
			System.out.println("La edad no es correcta.");
		else if (edad >= 18)
			System.out.println("Es mayor de edad.");
		else
			System.out.println("Es menor de edad.");
	}

}
