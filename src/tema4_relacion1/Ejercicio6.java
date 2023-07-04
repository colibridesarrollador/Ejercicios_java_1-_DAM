package tema4_relacion1;

import java.util.Scanner;

/**
 * 6. Implementa un programa que pida por teclado el sexo, que deberá ser H o M
 * o h o m y muestre por pantalla el mensaje “Hombre” si es H o h, el mensaje
 * “Mujer” si es M o m, y un mensaje de error si no es ninguna de esas cuatro
 * letras.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce de que sexo eres (H o h: hombre, M o m: mujer): ");
		String sexo = sc.nextLine();
		sc.close();
		if(sexo.equalsIgnoreCase("m"))
			System.out.println("Mujer");
		else if(sexo.equalsIgnoreCase("h"))
			System.out.println("Hombre");
		else
			System.out.println("Error, debe introducir H (hombre) o M (mujer).");
		
	}

}
