package tema4_relacion1;

import java.util.Scanner;

/**
 * 20. Implementa un programa que lea dos números n1 y n2. Valida que los
 * números sean positivos. Suma n1 el número de veces que indique n2. Visualiza
 * la suma. Por ejemplo, si n1 es 5 y n2 es 3, hay que sumar n1 tres veces y el
 * resultado será 15 (5+5+5).
 * 
 * @author JuanG
 *
 */
public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		
		do {
			System.out.print("Introduce un valor para el nº 1: ");
			n1 = Integer.parseInt(sc.nextLine());
			if(n1<0)
				System.out.println("nº 1 debe ser positivo, intentalo de nuevo.");
		}while(n1<0);
		
		do {
			System.out.print("Introduce un valor para nº 2: ");
			n2 = Integer.parseInt(sc.nextLine());
			if(n2<0)
				System.out.print("nº 2 debe de ser positivo, intentalo de nuevo.");
		}while(n2<0);
		
		int suma = 0;
		for (int i = 0; i < n2; i++) {
			suma+=n1;
		}
		sc.close();
		System.out.println(n1 +" sumado "+n2+" veces da como resultado "+suma);
	}
}
