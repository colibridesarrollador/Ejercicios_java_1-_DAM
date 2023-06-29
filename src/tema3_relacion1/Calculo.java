package tema3_relacion1;

public class Calculo {
	
	private double num1;
	private double num2;
	public double getNum1() {
		return num1;
	}
	public Calculo(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Ahora los métodos no serán void porque devolverán un tipo de dato double
	// Cuando los métodos la operación que hacen no devuelve nada se utiliza la palbara reservada 'void'
	// Siempre que un método devuelva algo deberemos gestionar lo que devuelve en la llamada al método
	// Para hacer que un método devuelva necesitamos la palabra reservada 'return'
	public double suma() {
		return num1+num2;
	}
	public double resta() {
		return num1-num2;
	}
	public double producto() {
		return num1*num2;
	}
	public double division() {
		return num1/num2;
	}
	public double resto() {
		return num1%num2;
	}
	public double media() {
		return (num1+num2)/2;
	}
}
