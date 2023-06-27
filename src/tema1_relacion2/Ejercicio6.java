package tema1_relacion2;

/**
 * 6. Crea las variables nombre, direccion y telefono y asígnales los valores
 * correspondientes. Muestra los valores de esas variables por pantalla de tal
 * forma que el resultado del programa sea el mismo que en el ejercicio 2.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		String nombre = "Colibrí Desarrollador";
		String direccion = "C/ Colibrí nº23";
		// El telefono si se necesita poner con espacios no puede ser un int
		// Aquí como no se van a hacer operaciones aritméticas con el tlfn no tiene sentido hacerlo numérico
		String  telefono = "654 32 32 12";

		System.out.println("Mi nombres es "+nombre+" mi dirección "+direccion+" mi teléfono "+telefono);
	}

}
