package tema4_relacion1;

import java.util.Scanner;

/**
 * 15. Realiza un programa para leer el nombre y la edad de tres alumnos. Y
 * calcula la edad media de los alumnos. Al leer la edad hay que validarla
 * comprobando que está entre 13 y 100.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int edades = 0;
		int edad = 0;
		int i = 0;
		String nombre="";
		
		for (i = 0; i < 3; i++) {
			System.out.println("Introduce el nombre del alumno " + i + "º: ");
			nombre = sc.nextLine();
			do {
				System.out.println("Introduce la edad ( entre 13 y 100 años ): ");
				edad = sc.nextInt();
				if(edad < 13 || edad > 100) {
					System.out.println("Error, la edad introducida no es valida, debe ser entre 13 años y 100.");
				}else {
					edades+=edad;
				}
			}while(edad < 13 || edad > 100);
			sc.nextLine();
		}
		sc.close();
		System.out.println("La media de edades es: "+edades/3);
	}

}
