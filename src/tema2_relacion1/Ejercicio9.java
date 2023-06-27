package tema2_relacion1;

/**
 * 9. Crea una clase que contenga una variable int y otra char que no estén
 * inicializadas e Imprime sus valores para verificar que Java se encarga de
 * realizar una inicialización predeterminada.
 * 
 * @author Colibrí
 *
 */
// Dentro de la clase declaramos los atributos 'a' que es un entero  y 'b' que es un char
public class Ejercicio9 {
	
	int  a;
	char b;

	//creamos el contructor al que llamaremos ( en este caso no inicializa nada ) * Si no se crea java lo crea por defecto
	//public Ejercicio9() {
		
	//}
	public static void main(String[] args) {
		
		//creamos una clase del objeto
		Ejercicio9 ejercicio = new Ejercicio9();
		//imprimimos sus valores por defecto con accediendo a ellos con el operador '.' ( nombre.atributo )
		System.out.println(ejercicio.a);
		System.out.println(ejercicio.b);
	
		//char se inicia a vacío e int se inicia a 0
	}
}
