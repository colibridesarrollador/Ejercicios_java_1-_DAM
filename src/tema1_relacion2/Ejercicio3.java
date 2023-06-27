package tema1_relacion2;

/**
 * número de teléfono. Asegúrate de que los datos se muestran en líneas
 * separadas. 3.
 *  Sabiendo que A=10, B=20, C=30 y D=40, evalúa las siguientes
 * expresiones: 
 * a) A==B && C==D 
 * b) A>B && C>D 
 * c) A<B && C<D 
 * d)A==B || C==D 
 * e) D>A|| C>D 
 * f) A<B || C>D 
 * g) !(A==B) 
 * h) !(D>A) 
 * i) !(A<B)
 * 
 * @author Colibrí
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {

		//declaración de las variables y sus valores
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		//Aquí se usa la lógica booleana, declaro una variable booleana para recoger los valores
		boolean resultado;
		/*
		 * Los operadores lógicos son:
		 * 
		 * &&  y
		 * ||  o
		 * !   negación
		 */
		//en java un = asigna un valor y cuando son dos = ( == ) lo que hacen es comparar
		/*
		 * Los operadores de comparación son:
		 * == 		igual 
		 * != 		no igual
		 * <		menor 
		 * >		mayor
		 */
		//¿ es igual a y b? y ¿ es igual c y d ? deben ser las dos comparaciones verdad para que sea verdad
		resultado = a == b && c==d;
		System.out.println(resultado);
		
		//¿ Es a menor que b ? y ¿ c menor que d ?
		resultado = a < b && c < d;
		System.out.println(resultado);
		
		//¿ Es d mayor que a ? ó ¿ c >d ? con el operador 'or' || si una de las dos se cumple es verdadero
		resultado = d > a || c > d;
		System.out.println(resultado);
		
		//¿ Es a igual a b ? ó ¿ c igual a d ? si los dos son falsos es falsa la expresión
		resultado = a == b || c == d;
		System.out.println(resultado);
		
		//¿ es d mayor que a ? ó ¿ es c mayor que d ?
		resultado = d > a || c > d;
		System.out.println(resultado);
		
		// ¿ Es a < b ? o ¿ c > d ?
		resultado = a < b || c > d ;
		System.out.println(resultado);
		 
		// La negación 'not' en java es '!'
		// NO es a igual a b
		resultado = a != b;
		System.out.println(resultado);
		
		// ¿ NO es d mayor que a ? 
		resultado = ! (d > a);
		System.out.println(resultado);
		
		// ¿ NO es a < b ?
		resultado = ! ( a < b );
		
	}
}
