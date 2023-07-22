package tem4_relacion2;

import java.util.Scanner;

/**
 * 2. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * @author Colibrí
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int digitos = 0;
		
		System.out.print("Introduce un número para ver cuántos dígitos tiene: ");
		int numero = Integer.parseInt(sc.nextLine());
		
		while(numero>0) {
			numero/=10;
			digitos++;
		}
		System.out.println("El número tiene "+digitos+" número de digitos.");
		sc.close();
	}

}
