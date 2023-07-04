package tema4_relacion1;

import java.util.Scanner;

/**
 * 8. Implementa un programa que pida un número del 1 al 7 por teclado e imprima
 * el día de la semana correspondiente.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		String dia ="";
		boolean bandera_dia = true;
		
			System.out.println("Introduce un número del 1 al 7 : ");
			numero=sc.nextInt();
		
		sc.close();
		switch(numero) {
		case 1:
			dia="Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miércoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sábado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			bandera_dia=false;
			break;
		}
		
		if(bandera_dia)
			System.out.println(dia);
		else
			System.out.println("El número no corresponde a nigún día de la semana.");
	}
}
