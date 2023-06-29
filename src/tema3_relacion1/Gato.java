package tema3_relacion1;

/**
 * 4. Implementa una clase Libro con los atributos isbn, autor, título y número
 * de páginas. Implementa varios constructores y los métodos get y set. Crea
 * varios objetos de la clase con los distintos constructores y prueba los
 * métodos.
 * 
 * @author Colibrí
 *
 */
public class Gato {
	
	private String color;
	private String raza;
	private String sexo;
	private double peso;
	private int edad;
	
	// este constructor da valores a todos los atributos del objeto que se creará 
	public Gato(String color, String raza, String sexo, double peso, int edad) {
		super();
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.peso = peso;
		this.edad = edad;
	}
	// Este contructor dará valores a los atributos que se indican y los demás serán iniciados a valor por defecto 
	public Gato(String color, String raza, String sexo) {
		super();
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
	}
	// * Se hacen tantos constructores como sean necesarios para resolver las exigencias del programa
	// Ejemplo ( en una colonia de gatos se puede saber a veces todos los datos de un gato pero no siempre ) 
	// Incluso puede que no se sepa nada o se quiere alamcenar un lugar para un gato
	// EL constructor con parámetros vacíos se crea por defecto si no creamos ninguno otro constructor
	public Gato() {
		
	}
	
	// Los métodos son acciones que que hará el objeto
	// Este método por ejemplo solo imprime por consola simulando un maullido 
	public void maulla() {
	
		System.out.println("Miauuuu");
		
	}
	// Los metodos tanto de onjeto como de clase usarán ( camelCase )
	public void ronronea() {
		
		System.out.println("mrrrrrrr");
	}
}
