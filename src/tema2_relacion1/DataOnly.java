package tema2_relacion1;
/**
 * Ejercicio 10 y 11
 * @author Colibrí
 *
 */
//clase plantilla para crear objetos
public class DataOnly {

		int i;
		float f;
		boolean b;
		
	
		
		
	//main ( siempre debe ir dentro de una clase ) 
	public static void main(String[] args) {
		
		DataOnly data = new DataOnly();
		//asignamos valores con el operador punto
		data.i = 12;
		data.f = 23f;
		data.b = true;
		
		//imprimimos los valores también accediendo a ellos con el operador punto
		System.out.println(data.i);
		System.out.println(data.f);
		System.out.println(data.b);
	}

}
