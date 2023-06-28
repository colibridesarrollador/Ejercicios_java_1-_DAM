package tema2_relacion1;

/**
 * 13. Crea una clase llamada Dog con dos String: name (nombre) y says
 * (ladrido). En main(), crea dos objetos perro con los nombres "spot" que ladre
 * diciendo "Ruff!" y "scruffy", que ladre diciendo "Wurf!". Después, muestra
 * sus nombres y el sonido que hacen al ladrar. Salida: 
 * spot dice ruff! 
 * scruffy dice wurf!
 * 
 * @author Colibrí
 *
 */
public class Dog {
	// Los atributos del objeto name y says
	String name;
	String says;
	
	// El constructor que recibe dos parámetros name y says ( no tienen nada que ver con los atributos del objeto )
	public Dog(String name,String says) { // los parámetros podrían tener nombres diferentes pero se usan los mismos porque su fin es el de dar un name y un says al objeto ( los tipos de datos deben ser iguales a los que darán valor  )
		// this es una palabra reservada que se usa para hacer constar que es del objeto
		// name y says ( parámetros del constructor ) son asignados a this.name y this.says ( atributos del objeto )
		this.name = name;
		this.says = says;
	}
	// El main o clase principal del progrma suele hacerse en una clase diferente pero al ser un progrma pequeño lo hago aquí
	public static void main(String[] args) {
		
	// Creo un objeto de la clase Dog ( nombre de la clase, nombre del objeto = new nombre de la clase ( parámetros )	
		Dog perro1 = new Dog("spot","Ruff"); // Recibe dos parámetros string, en este caso literales
		Dog perro2 = new Dog("scruffy","Wurf"); // Nombre y ladrido que serán asignados a los atributos this de la clase Dog
	
		// Accedo a los valores de sus atributos mediante el operador punto y lo concateno con las comillas dobles con 'dice'
		System.out.println(perro1.name+" dice "+perro1.says);
		System.out.println(perro2.name+" dice "+perro2.says);
	}
}
