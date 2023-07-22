package tema4_relacion1;

import java.util.Scanner;

/**
 * 18. Realiza los cambios necesarios en el ejercicio anterior para que lea
 * también la nota del alumno. Valida esta entrada haciendo que la nota sea
 * válida si está entre 0 y 10. Y que visualice también la nota media.
 * 
 * @author JuanG
 *
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int edades = 0;
		int edad = 0;
		int i = 0;
		double notas = 0;
		double nota = 0;
		int hombres=0;
		int mujeres = 0;
		String nombre = "";
		String sexo = "";
		
		
		for (i = 0; i < 3; i++) {
			System.out.println("Introduce el nombre del alumno " + (i+1) + "º: ");
			nombre = sc.nextLine();
			do {
				System.out.print("Introduce la edad ( entre 13 y 100 años ): ");
				edad = sc.nextInt();
				sc.nextLine();
				System.out.print("Introduce su sexo 'h' hombre, 'm' mujer: ");
				sexo = sc.nextLine();
				if (edad < 13 || edad > 100) {
					System.out.println("Error, la edad introducida no es valida, debe ser entre 13 años y 100.");
				}
				
				if (!sexo.equalsIgnoreCase("m")&& !sexo.equalsIgnoreCase("h")) {	
					System.out.println("Error, el sexo debe ser 'h' hombre ó 'm' mujer, vuelva a intentarlo.");
				}
				
				else {
					
					if(sexo.equalsIgnoreCase("h")) { 
						sexo="hombre";
						hombres++;
					}
					else if(sexo.equalsIgnoreCase(sexo)) {
						sexo="mujer";
						mujeres++;
					}
					edades += edad;
				}
				
				do {
					System.out.print("Introduce la nota del alumno: ");
					nota = Double.parseDouble(sc.nextLine());
				}while(nota > 10 || nota < 0);
				notas+=nota;
				
			} while ((edad < 13 || edad > 100) && (sexo.equals("hombre") && sexo.equals("mujer")));
			//sc.nextLine();
			System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nNota: "+nota);
			sexo="";
		}
		sc.close();
		
		System.out.println("La media de edades es: " + edades / 3);
		System.out.println("Hay "+hombres+" hombres y "+mujeres+" mujeres");
		System.out.println("La nota media de los alumnos es "+notas/3);
	}

}

