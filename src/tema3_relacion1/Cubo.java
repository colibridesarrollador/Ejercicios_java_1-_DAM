package tema3_relacion1;

/**
 * 6. Implementa una clase Cubo con dos atributos de tipo entero: capacidad y
 * contenido. La clase tendrá un constructor para inicializar la capacidad.
 * Implementa los métodos Relación III. (RA 2) PROGRAMACIÓN 1DAM 2022/2023 get y
 * set y los métodos vacía() (que vacía el cubo) y llena() (para llenar el
 * cubo). Crea un objeto de la clase Cubo y prueba los distintos métodos.
 * 
 * @author Colibrí
 *
 */
public class Cubo {

	private int capacidad;
	private int contenido;
	
	public Cubo(int capacidad) {
		
		this.capacidad = capacidad;
		
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public void llena() {
		this.contenido = this.capacidad;
	}
	public void vacia() {
		this.contenido = 0;
	}
}
