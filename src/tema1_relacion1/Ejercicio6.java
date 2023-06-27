package tema1_relacion1;

/**
 * 6. Escribe un programa que declare una variable entera x a la que le asigne
 * el valor 100. Muestra en pantalla: 
 * x = ….. 
 * x+5 = …. 
 * x-5 = ….. 
 * x*5 = ….. 
 * x/5 =…... 
 * x%5 = …...
 * 
 * @author Colibrí
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		int x = 100;
		System.out.println("x = "+x);
		// Hay que tener en cuenta que si los cálculos aritméticos no van entre paréntesis es posible que sea concatenado como texto al haber un strin literal al principio
		// EJEMPLO DE CONCATENACIÓN ( NO LO PIDE EL EJERCICIO )  
		System.out.println("x+5 (Concatenación, no lo pide el ejercicio) = "+x+5);
		// Así es como lo pide el ejercicio ( atento al cálculo artmético, va entre paréntesis ) 
		System.out.println("x+5 (suma entre paréntesis, lo pide así) : "+(x+5));
		// El resto del ejercicio es igual, entre paréntesis los cálculos aritméticos
		System.out.println("x-5: "+(x-5));
		System.out.println("x*5 = "+(x*5));
		System.out.println("x/5 = "+(x/5));
		System.out.println("x%5 (% devuelve el resto de la división de los números) = "+(x%5));
	}

}
