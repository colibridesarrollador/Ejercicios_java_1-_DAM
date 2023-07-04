package tema4_relacion1;

import java.util.Scanner;

/**
 * 4. Implementa un programa que lea por teclado una cantidad entera. Si la
 * cantidad es 100, mostrará por pantalla la cantidad y la cantidad más 200. Si
 * la cantidad está entre 101 y 200, mostrará en pantalla la cantidad y la
 * cantidad multiplicada por 2. Si la cantidad es negativa, mostrará en pantalla
 * la cantidad y “ES NEGATIVA”. En otro caso, que visualice en el documento la
 * cantidad y la cantidad multiplicada por 3.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int numero  = sc.nextInt();
		sc.close();
		if(numero == 100)
			System.out.println(numero+100);
		else if(numero > 100 && numero <= 200)
			System.out.println(numero*2);
		else if(numero < 0) {
			
			System.out.println("La cantidad es negativa.");
		}
		else {
			System.out.println(numero);
			System.out.println(numero*2);
	
		}
	}
}
