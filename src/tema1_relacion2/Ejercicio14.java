package tema1_relacion2;

import java.util.Scanner;

/**
 * 15. Escribe un programa que calcule el área de un rectángulo. La base y la
 * altura deben introducirse por teclado.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el ancho de un rectangulo: ");
		double ancho = sc.nextDouble();
		System.out.println("Introduce el alto del rectangulo: ");
		double alto = sc.nextDouble();
		
		System.out.println("El área del rectangulo es: "+(alto*alto+ancho*ancho));
		
		sc.close();
	}

}
