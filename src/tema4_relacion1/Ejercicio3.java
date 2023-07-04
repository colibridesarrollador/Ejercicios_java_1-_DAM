package tema4_relacion1;

import java.util.Scanner;

/**
 * 3. Implementa un programa que pida por teclado un nombre y una edad y muestre
 * por pantalla el nombre y si es mayor de edad o no. La salida podría ser: Tu
 * nombre es …. y eres mayor de edad.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		sc.close();
		if(edad >= 18 && edad < 100)
			System.out.println("Tu nombre es "+nombre+" y eres mayor de edad.");
		else if(edad > 0 && edad < 18)
			System.out.println("Tu nombre es "+nombre+" y eres menor de edad.");
		else
			System.out.println("La edad introducida no es válida.");
		

	}

}
