package tema3_relacion1;

public class LibroTest {

	//crearé de nuevo el main en la misma clase porque son programas pequeños
		// EL modificador de acceso 'private' solo oculta los objetos a clases externas
		public static void main(String[] args) {
			// Declaración de un objeto 
			Libro libro1 = new Libro("ER32","El Señor de los anillos","500");
			Libro libro2 = new Libro("DER34","Diario de un revelde","350");
		
			// Para acceder a los atributos llamaremos a los metodos get de los objetos
			System.out.println(libro1.getTitulo());
			System.out.println(libro2.getTitulo());

			// Para modificar llamaremos a los métodos set
			libro1.setTitulo("Alicia en el país de las maravillas");
			libro2.setTitulo("El club de la lucha");
			
			System.out.println("\n***Una vez cambiados los titulos con los métodos 'set': ***\n");
		
			System.out.println(libro1.getTitulo());
			System.out.println(libro2.getTitulo());
		}
}
