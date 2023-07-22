package tema4_relacion1;

import java.util.Scanner;

/**
 * 19. Implementa un programa que pida números por teclado hasta que el usuario
 * introduzca un 0. Muestra los números, el número de números introducidos, la
 * suma y la media de ellos.
 * 
 * @author JuanG
 *
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int suma = 0;
		int cantidadNumeros=0;
		int numero = 0; 
		
		boolean bandera_salir=false;
		do {
			System.out.print("Introduce un número (introduzca 0 para salir ) : ");
			numero = Integer.parseInt(sc.nextLine());
			if(numero == 0)
				bandera_salir=true;
			else
				cantidadNumeros++;
			
			suma+=numero;
			
		}while(bandera_salir==false);
		sc.close();
		System.out.println("Ha introducido "+cantidadNumeros+" numeros, la suma de ellos es "+suma+" la media de ellos es "+(suma/cantidadNumeros));
	}
}
