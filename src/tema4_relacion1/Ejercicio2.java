package tema4_relacion1;

import java.util.Scanner;

/**
 * 2. Implementa un programa que pida una nota por teclado. Si la nota es mayor
 * o igual que 5 mostrará el mensaje “APROBADO”. Si la nota es menor que 5
 * mostrará el mensaje “SUSPENSO”.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota: ");
		double nota = sc.nextDouble();
		sc.close();
		if(nota >= 5 && nota <= 10)
			System.out.println("APROBADO");
		else if(nota < 5 && nota >= 0)
			System.out.println("SUSPENSO");
		else
			System.out.println("La nota introducida no es válida.");
	}

}
