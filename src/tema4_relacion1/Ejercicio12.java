package tema4_relacion1;

import java.util.Scanner;

/**
 * 12. Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado
 * 
 * @author Colibrí
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean valido = true;
		System.out.println("Introduce la hora ( solo la hora sin  los minutos): ");
		int hora = sc.nextInt();
		
		sc.close();
		String saludo="";
		
		if(hora > 5 && hora < 13)
			saludo="Buenos días";
		else if(hora > 12 && hora < 21)
			saludo="Buenas tardes";
		else if((hora > 20 && hora < 24) || (hora >= 0 && hora < 6))
			saludo="Buenas noches";
		else {
			valido=false;
			System.out.println("La hora introducida no está dentro de las 24 ( de 00 a 23): ");
		}
		
		if(valido)
		System.out.println(saludo);
		
	}

}
