package tema4_relacion1;

import java.util.Scanner;

/**
 * 1. Implementa un programa que pida una nota por teclado. Si la nota es mayor
 * o igual que 5, mostrará por pantalla el mensaje “APROBADO”.
 * 
 * @author Colibri
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		double nota  = sc.nextDouble();
		sc.close();
		if(nota >= 5)
			System.out.println("APROBADO");

	}

}
