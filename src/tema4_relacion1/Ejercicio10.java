package tema4_relacion1;

import java.util.Scanner;

/**
 * 10. Implementa un programa que lea un número de mes por teclado y a partir de
 * ese mes calcule la productividad. La productividad es 100 más el factor del
 * mes. Y el factor del mes es el siguiente: Los meses entero, febrero y marzo
 * tienen factor 15. Los meses abril, mayo y junio tienen factor 17. Los meses
 * septiembre, octubre y noviembre tienen factor 20. Y diciembre tiene factor La
 * salida por pantalla será: El nombre de mes es …… y la productividad …..
 * Muestra el mensaje “Error en el mes” si el número de mes tecleado no está
 * entre 1 y 21. Si no son esos meses, el factor es 0.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de mes: ");
		int mes = sc.nextInt();
		double productividad = 0;
		boolean valido = true;

		sc.close();

		if (mes > 0 && mes < 4)
			productividad = 100 + 15;
		else if (mes >= 4 && mes < 8)
			productividad = 100 + 17;
		else if (mes >= 8 && mes < 12)
			productividad = 100 + 20;
		else if (mes > 11 && mes < 13)
			productividad = 100 + 21;
		else {
			System.out.println("Error en el mes.");
			valido = false;
		}
		if (valido) {
			String txtMes = "";

			switch (mes) {
			case 1:
				txtMes = "enero";
				break;
			case 2:
				txtMes = "febrero";
				break;
			case 3:
				txtMes = "marzo";
				break;
			case 4:
				txtMes = "abril";
				break;
			case 5:
				txtMes = "mayo";
				break;
			case 6:
				txtMes = "junio";
				break;
			case 7:
				txtMes = "julio";
				break;
			case 8:
				txtMes = "agosto";
				break;
			case 9:
				txtMes = "septiembre";
				break;
			case 10:
				txtMes = "octubre";
				break;
			case 11:
				txtMes = "nomviembre";
				break;
			case 12:
				txtMes = "diciembre";
				break;
			}
			System.out.println("El nombre de mes es "+txtMes+" y la productividad es: " + productividad);

		}
	}
}
