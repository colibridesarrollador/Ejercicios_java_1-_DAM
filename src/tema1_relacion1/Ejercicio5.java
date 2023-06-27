package tema1_relacion1;

/**
 * 5. Escribe un programa que declare dos variables de tipo char y le asigne una
 * letra a cada una. Muestra en pantalla el resultado de sumarlas y el resultado
 * de concatenarlas. Explica la diferencia
 * 
 * @author Colibrí
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		char primera = 'a';
		char segunda = 'b';
		
		//Los tipos de dato char son primitivos y al sumarlos dan el valor que cada uno tiene en código ASCII ( primera + segunda)
		System.out.println("Sumado: "+(primera+segunda)); // lo he metido entre paréntesis para que no sea concatenado y el signo + sea de valor aritmético
		//El signo + después de cualquier tipo de dato String o entrecomillado doble lo que hará es concatenar ( añadir en forma de texto )
		System.out.println("Concatenado: "+primera+segunda);// aqui al no ir entre paréntesis y haber un string literal, lo que hace es añadirlo a la cadena de texto
		
	}

}
