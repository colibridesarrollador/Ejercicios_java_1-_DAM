package tema1_relacion2;

/**
 * 9. Escribe un programa que declare 5 variables de tipo char. A continuación,
 * crea otra variable como cadena de caracteres y asígnale como valor la
 * concatenación de las anteriores 5 variables. 
 * Por último, muestra la cadena de caracteres por
 * pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author Colibrí
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		// variables tipo char
		char uno = 'B';
		char dos = 'u';
		char tres = 'e';
		char cuatro = 'n';
		char cinco = 'a';
		
		// Concatenación de las variables ( es necesario empezar con comillas aun sean vacías para que java empiece a concatenar )
		//String concatenacion = uno+dos+tres+cuatro+cinco; ERROR, al no tener unas comillas o un string inicial
		String concatenacion = ""+uno+dos+tres+cuatro+cinco;
		
		System.out.println(concatenacion);
		
	}

}
