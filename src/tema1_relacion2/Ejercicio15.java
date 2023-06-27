package tema1_relacion2;

import java.util.Scanner;

/**
 * 16. Escribe un programa que calcule el área de un triángulo. La base y la
 * altura deben introducirse por teclado.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura del triángulo: ");
		double altura = sc.nextDouble();
		
		System.out.println("Introduce la base del triangulo: ");
		double base = sc.nextDouble();
		// las operaciones aritméticas si se ejecutan en el orden 1º producto y división y después sumas y restas
		// Si hay duda de qué se ejecutará antes ( división o multiplicación ) se controla metiendolo entre paréntesis. La operaciones entre paréntesis se ejecutan las pirmeras.
		System.out.println("El área del triángulo es: "+((base*altura)/2));
		sc.close();
	}

}
