package tema1_relacion2;


//importamos la clase Scanner para recoger los datos con un objeto Scanner 
import java.util.Scanner;

/**
 * 12. Escribe un programa que pida dos números al usuario y muestre el
 * resultado de la suma, diferencia, producto y división. Utilizaremos la clase
 * Scanner para leer datos desde teclado.
 * 
 * @author Colibrí
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		//Creación del objeto Scanner ( nombre de la clase, nombre del objeto, llamada al constructor con token new y le pasamos por parámetro la entrada por consola
		Scanner sc = new Scanner(System.in);
		// mandamos un mensaje al usuario de orientación
		System.out.println("Introduce un número: ");
		//creamos la varibale que almacenará lo que escriba por consola el usuario gracias al objeto scanner
		// sc es el objeto y nextInt() una función del objeto que recoje enteros
		int num1 = sc.nextInt();
		
		
		//pido otro número al usuario con su respectivo mensaje de orientación
		System.out.println("Introduce un segundo número");
		//creo la variable y lo almaceno con el objeto scanner como anteriormente
		int num2 = sc.nextInt();
		
		
		
		//ahora llebo a cabo las operaciones que me pide el ejercicio
		System.out.println("Suma: "+(num1+num2));
		System.out.println("Diferencia: "+(num1-num2));
		System.out.println("Producto: "+(num1*num2));
		System.out.println("División: "+(num1/num2));
	
		//cierro el flujo del objeto scanner
		sc.close();
	}

}
