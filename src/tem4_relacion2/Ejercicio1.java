package tem4_relacion2;

import java.util.Scanner;

/**
 * 1. Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int clave = 4444;
		boolean bandera_abierto=false;
		int intentos=4;
		int numeroUsuario = 0;
		
		do {
			System.out.print("Introduzca la combinación: ");
			numeroUsuario=Integer.parseInt(sc.nextLine());
			
			if(numeroUsuario==clave) { 
				bandera_abierto=true;
				System.out.println("Caja fuerte abierta con exito.");
			}
			else {
				intentos--;
				System.out.println("Clave incorrecta, le quedan "+intentos+" intentos.");
				if(intentos==0)
					System.out.println("Se le acabron los intentos");
			}
		}while(bandera_abierto==false&&intentos>0);
	sc.close();	
	}

}
