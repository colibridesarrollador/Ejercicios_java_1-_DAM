package tema3_relacion1;

public class CalculoTest {

	public static void main(String[] args) {
		
		Calculo calculo1 = new Calculo(10,2);
		
		// En este caso lo que devuelven los métodos lo imprimo directamente
		System.out.println("Suma: "+calculo1.suma());
		
		// También puedo guardarlo en una variable 
		double resultado = calculo1.resta();
		// Después imprimirlo
		System.out.println("Resta: "+resultado);
		// de esta forma se abre un amplio abanico de posibilidades
		
		System.out.println("División: "+calculo1.division());
		
		System.out.println("Resto: "+calculo1.resto());
		
		System.out.println("Media: "+calculo1.media());
	
		System.out.println("Producto: "+calculo1.producto());
	}

}
