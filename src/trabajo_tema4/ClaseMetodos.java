package trabajo_tema4;

import java.util.Scanner;

/**
 * Clase que contiene los metodos correspondientes para comprobar si un numero
 * es primo, comprobar si un numero es perfecto, calcular el numero de digitos
 * de un numero, calcular el factorial de un numero, mostrar un numero uno a uno
 * con palabras y una estructura de control para hacer un menu que acceda a
 * estos metodos.
 * 
 * @author Colibrí
 *
 */
public class ClaseMetodos {

	/**
	 * Menu que accede a los metodos de la clase dependiendo del numero seleccionado
	 */

	public static void menu() {

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		do {

			System.out.println("\n\t**** Selecciona una opción del menú **** " + "\n");
			System.out.println("1. Comprobar si un número es primo.");
			System.out.println("2. Comprobar si un número es perfecto.");
			System.out.println("3. Calcular el número de digitos de un número.");
			System.out.println("4. Calcular el factorial de un número.");
			System.out.println("5. Mostrar los digitos de un número uno a uno con palabras.");
			System.out.println("6. Salir");

			menu = sc.nextInt();

			if (menu == 1)
				ClaseMetodos.esPrimo();
			else if (menu == 2)
				ClaseMetodos.esPerfecto();
			else if (menu == 3)
				ClaseMetodos.calcularNumeroDigitos();
			else if (menu == 4)
				ClaseMetodos.calcularFactorial();
			else if (menu == 5)
				ClaseMetodos.mostrarNumerosEnTexto();
			else if (menu != 6 && menu != 5 && menu != 4 && menu != 3 && menu != 2 && menu != 1)
				System.out.println(
						"\nError, el número introducido no corresponde a ninguna opción del menú, intentelo de nuevo;\n");

		} while (menu < 6 || menu > 6);
		sc.close();

		System.out.println("***Programa finalizado****");
	}

	/**
	 * Metodo que comprueba si un numero introducido por teclado es primo o no.
	 */
	public static void esPrimo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para ver si es primo o no: ");
		int numero = sc.nextInt();

		int resto = 0;
		int divisores = 0;

		for (int i = 1; i <= numero; i++) {

			resto = numero % i;

			if (resto == 0) {
				divisores++;
			}
		}

		if (divisores > 2) {
			System.out.println("No es primo");
		} else if (divisores <= 2) {
			System.out.println("Es primo");
		}
	
	}

	/**
	 * Metodo que calcula si un numero introducido por teclado es perfecto o no.
	 */
	public static void esPerfecto() {

		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int numero = 0;

		do {
			System.out.println("Introduce un número positivo");
			numero = sc.nextInt();

			if (numero < 0) {
				System.out.println("El número debe ser positivo, intenalo de nuevo");
			}
		} while (numero < 0);
	

		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		if (suma == numero) {
			System.out.println("Es un número perfecto.");
		} else {
			System.out.println("No es un número perfecto.");
		}
	}

	/**
	 * Metodo que calcula el numero de digitos que tiene un número instroducido por
	 * el usuario
	 */
	public static void calcularNumeroDigitos() {

		Scanner sc = new Scanner(System.in);
		int digitos = 0;

		System.out.println("Introduce el numero para calcular cuantos digitos tiene: ");
		int numero = sc.nextInt();

		while (numero > 0) {

			numero = numero / 10;
			digitos++;

		}
		System.out.println("El numero de digitos que tiene el numero es " + digitos);
	}

	/**
	 * Metodo que calcula el factorial de un numero introducido por el usuario
	 */
	public static void calcularFactorial() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero al que quieres sacar su factorial: ");
		int numero = sc.nextInt();
	
		long factorial = 1;
		for (int i = 1; i <= numero; i++) {

			factorial *= i;
		}
		System.out.println("El factoriale es:   " + factorial);
	}

	/**
	 * Metodo que cambia un numero introducido por teclado del usuario y lo
	 * transforma a su equivalente en texto(ejmp 1 lo transforma a "uno", 2 lo
	 * transforma a "dos"....)
	 */
	public static void mostrarNumerosEnTexto() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		int contador = 0;
		String numeroTexto = "";
		int resto1 = 0;
		int invertido = 0;
		int resto2 = 0;

		while (numero > 0) {
			resto1 = numero % 10;
			invertido = invertido * 10 + resto1;
			numero /= 10;
		}
		
		int i = 0;
		while (i < invertido) {
			contador = 0;
			resto2 = invertido % 10;
			invertido = invertido / 10;
			
			for (int j = 1; j <= resto2; j++) {
				contador++;
			}

			switch (contador) {

			case 0:
				numeroTexto = "cero";
				break;
			case 1:
				numeroTexto = "uno";
				break;
			case 2:
				numeroTexto = "dos";
				break;
			case 3:
				numeroTexto = "tres";
				break;
			case 4:
				numeroTexto = "cuatro";
				break;
			case 5:
				numeroTexto = "cinco";
				break;
			case 6:
				numeroTexto = "seis";
				break;
			case 7:
				numeroTexto = "siete";
				break;
			case 8:
				numeroTexto = "ocho";
				break;
			case 9:
				numeroTexto = "nueve";
				break;
			}
			System.out.print(" " + numeroTexto);
		}
		System.out.println("\n");
	}
}
