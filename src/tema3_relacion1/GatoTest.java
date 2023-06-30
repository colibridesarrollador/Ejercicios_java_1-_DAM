package tema3_relacion1;

public class GatoTest {

	public static void main(String[] args) {
		
		// Creo un gato sin información ( guardo el espacio sencillamente )
		Gato gato1 = new Gato();
		
		// Creo otro gato con los datos que sé por ahora ( luego podré añadir datos con los metodos set, sería necesario crearlos )
		Gato gato2 = new Gato("Gris","Silvestre","hembra");

		// Creo un gato con todos los datos ( los argumentos literales deben coincidir en orden y tipo con los del constructor )
		Gato gato3 = new Gato("Pardo","Siames","hembra",3.4,3);
		
		gato1.maulla();
		gato2.ronronea();
		gato3.maulla();
	}

}
