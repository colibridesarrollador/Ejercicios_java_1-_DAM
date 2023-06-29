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
// Clase libro
public class Libro {

	// Siempre que no se vayan a hacer operaciones aritméticas los atributos aunque
	// sean números es recomendado hacerlos string ( resuelven muchos fallos en
	// tiempo de ejecucion )
	private String isbn;
	private String titulo;
	private String numPaginas;

	// Constructor que recibirá los parámetros para dar valores a los atributos del
	// objeto
	public Libro(String isbn, String titulo, String numPaginas) {

		// La palabra reservada 'this' se utiliza para diferenciar atributos del onjeto
		// y parámetros del método ( en este caso el constructor )
		this.isbn = isbn;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
	}
	// Al hacer los atributos privados con la palabra 'private' tenemos que crear
	// get y set para acceder a los atributos
	// Se harán los necesarios, no es obligatorio hacerlos
	// Todo esto es para que no se acceda de forma erronea o malintencionada a los
	// atributos de una clase

	// Los get son para acceder al valor de un atributo
	// La sintaxis por convenio de los get es 'getNombe' ( camel case )
	public String getIsbn() {
		return isbn;
	}

	// Los set son para modificar los atributos del objeto
	// La sintaxisos por convenio es 'setNombre' ( case camel )
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(String numPaginas) {
		this.numPaginas = numPaginas;
	}

}
