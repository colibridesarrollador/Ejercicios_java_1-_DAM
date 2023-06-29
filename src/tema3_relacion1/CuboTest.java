package tema3_relacion1;

public class CuboTest {
	public static void main(String[] args) {
		
		// Le doy una capacidad al cubo de 1000
		Cubo cubo1 = new Cubo(1000);
		
		// Veo el contendio que es vacío con un mensaje literal exlicativo
		System.out.println("El contenido del cubo: " +cubo1.getContenido());
	
		// lleno el cubo
		cubo1.llena();
		// Aviso de que el cubo se ha llenado literamente
		System.out.println("El cubo se ha llenado.");
		
		System.out.println("EL contenido del cubo: "+cubo1.getContenido());
	
		cubo1.vacia();
		System.out.println("El cubo se ha vaciado.");
	
		System.out.println("EL contenido del cubo: "+cubo1.getContenido());
	}

}
