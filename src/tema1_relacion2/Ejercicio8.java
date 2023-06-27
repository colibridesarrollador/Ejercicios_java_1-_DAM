package tema1_relacion2;

/**
 * 8. Escribe un programa que declare variables de tipo char y de tipo String.
 * Intenta mostrarlas por pantalla todas juntas en la misma línea y con una sola
 * sentencia de Java (con un solo println) ¿es posible?
 * 
 * @author Colibrí
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		//variables de tipo char
		char uno = 'h';
		char dos = 'o';
		char tres = 'l';
		char cuatro = 'a';
		
		//variables de tipo string
		String primera = " buenos días, ";
		String segunda = " ¿ qué tal ? ";
		
		//mostra todas en la misma linea gracias a la clase string que concatena los valores de las variables
		System.out.println(primera+uno+dos+tres+cuatro+segunda);
		
		
	}

}
