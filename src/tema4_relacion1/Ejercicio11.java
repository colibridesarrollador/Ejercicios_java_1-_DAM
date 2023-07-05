package tema4_relacion1;

import java.util.Scanner;

/**
 * 11. Implementa un programa que lea por teclado el nombre de empleado, su
 * salario y su número de departamento. Se pretende subir el salario de los
 * empleados.
 * La subida será la siguiente: 
 * Si el departamento es 10, la subida de salario será de 100. 
 * Si el departamento es 20, la subida de salario será del 5%. 
 * Si el departamento es 30, la subida de salario será del 4%. 
 * Si es otro departamento, la subida será de 75.
 *  
 * Muestra por pantalla el nombre del empleado, el salario, la subida de salario y el nuevo salario, que será la
 * suma del salario más la subida. La salida podría ser: 
 * Nombre del empleado:……., su salario es: ………, su departamento es: ………, la subida de salario es:……… y el nuevo salario es: ……
 * 
 * @author Colibrí
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double subida =0;
		double total =0;
		System.out.println("Introduce nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce su salario: ");
		double salario = sc.nextDouble();
		System.out.println("Introduce el número de departamento: ");
		int numDepart = sc.nextInt();
		sc.close();
		
		if(numDepart==10)
			subida=100;
		else if(numDepart==20)
			subida=salario*0.5;
		else if(numDepart==30)
			subida=salario*0.4;
		else 
			subida=75;
		
		total=salario+subida;
		

		System.out.println("Nombre del empleado:"+nombre+", su salario es: "+salario+", su departamento es: "+numDepart+", la subida de salario es: "+subida+" y el nuevo salario es: "+total);
	}

}
