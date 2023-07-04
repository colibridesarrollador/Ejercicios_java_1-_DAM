package tema4_relacion1;

import java.util.Scanner;

/**
 * 7. Implementa un programa que pida dos números por teclado y que imprima un
 * mensaje diciendo si son iguales o cuál es mayor y cuál es menor.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un valor para el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce un valor para el segundo número: ");
		int num2 = sc.nextInt();
		sc.close();
		if (num1 == num2)
			System.out.println("Los números son iguales.");
		else if (num1 < num2)
			System.out.println(num1 + " es menor que " + num2);
		else
			System.out.println(num1 + " es mayor que " + num2);

	}

}
