package entities;
import util.Calculator;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	// public indica que o método pode ser usado fora da classe
	// double é o tipo de retorno do método se fosse void não retornaria nada
	// area é o nome do método e () método que não recebe nada de fora pois
	// o que ela precisa que são o a b e c já estão na própria classe
		
	public double area() {
		double areaTriangle = Calculator.areaTriangleHeron(a, b, c);
		return areaTriangle;
	}	
}
