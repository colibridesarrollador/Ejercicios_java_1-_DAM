package tema4_relacion1;

/**
 * 21. Realiza un programa que muestra los números múltiplos de 5 de 0 a 100.
 * @author JuanG
 *
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100 ; i++) {
			if(i%5==0)
				System.out.println(i);
		}

	}

}
