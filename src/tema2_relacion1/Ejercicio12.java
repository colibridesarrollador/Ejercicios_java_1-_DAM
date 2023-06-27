package tema2_relacion1;

/**
 * Este método dice cuántos bytes son necesarios para almacenar la información
 * de un String en particular (cada carácter de una cadena tiene 16 bits, o 2
 * bytes para soportar caracteres Unicode). El parámetro S es de tipo String.
 * Una vez que se pasa S al método, es posible tratarlo como a cualquier otro
 * objeto (se le pueden enviar mensajes). Aquí se invoca al método length( ),
 * que es uno de los métodos para String; devuelve el número de caracteres que
 * tiene la cadena. También es posible ver el uso de la palabra clave return,
 * que hace dos cosas. Primero, quiere decir, "abandona el método, que ya hemos
 * acabado". En segundo lugar, si el método produce un valor, ese valor se ubica
 * justo después de la sentencia return. En este caso, el valor de retorno se
 * produce al evaluar la expresión s.length( )*2. Se puede devolver el tipo que
 * se desee, pero si no se desea devolver nada, hay que indicar que el método
 * devuelve void.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio12 {

	//creo el método que corresponderá a los objetos creados por esta clase llamada Ejercicio12
	int storage(String s) {
		return s.length()*2;
	}
	
	public static void main(String[] args) {
		//creo el objeto que se llama ejercicio ( el nombre del objeto en minúsculas por convenio )
		Ejercicio12 ejercicio = new Ejercicio12();
		
	// introduzco una caden para saber cuanto espacio en bytes y creo una variable para guardarlos llamada bytes  de tipo entera ( int )
	int bytes = ejercicio.storage("¿cuánto espacio necesito?");
	
	//imprimo la cantidad de bytes que me devolvió y almacené en la variable bytes
	
	System.out.println("Se necesitan "+bytes+" para almacenar ese texto.");
	}
}
