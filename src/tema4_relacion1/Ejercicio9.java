package tema4_relacion1;

import java.util.Scanner;

/**
 * 9. Implementa un programa que pida por teclado un número de mes e imprima el
 * mes correspondiente.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número que corresponda a un mes del año");
		int mes = sc.nextInt();
		
		sc.close();
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("El número introducido no corresponde a ningún mes del año.");
			break;
		}
		
	}

}
