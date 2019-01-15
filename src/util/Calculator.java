package util;

public class Calculator {

	//Declarando uma variável constante - Letras Maiúsculas com _ entre as palavras
	public static final double PI = 3.14159;

	// public indica que o método pode ser usado fora da classe
	// double é o tipo de retorno do método se fosse void não retornaria nada
	// area é o nome do método e () método que não recebe nada de fora pois
	// o que ela precisa que são o a b e c já estão na própria classe
	
	//Fórmula de Heron
	//S: área do triângulo
	//p: semiperímetro
	//a, b e c: lados do triângulo
	//Sendo o perímetro do triângulo a soma de todos os lados da figura, 
	//o semiperímetro representa a metade do perímetro:
	//p igual a numerador a mais b mais c sobre denominador 2 fim da fração
	
	public static double areaTriangleHeron(double ladoa,double ladob, double ladoc) {
		double semiperimetro = (ladoa + ladob + ladoc) / 2.0;
		return Math.sqrt(semiperimetro * (semiperimetro - ladoa) * (semiperimetro - ladob) * (semiperimetro - ladoc));
	}
	//Fórmula de cálculo da área de um círculo
    //Fórmula da área: area = pi . raio2
    //Considere o valor de pi = 3.14159
	
	public static double areaCirculo(double raio) {
		return PI * (raio * raio);
	}
	
	public static int diferencaEntreQuatro(int a, int b, int c, int d) {
	    return (a * b) - (c * d);
	}
	
	public static double areaTriangle(double altura, double lado) {
		return altura * lado / 2.0;
	}
	
	public static double areaTrapezio(double altura, double lado, double largura) {
		return (altura + lado) / 2.0 * largura;
	}
	
	public static double areaQuadrado(double lado) {
		return lado * lado;
	}
	
	public static double areaRetangle(double altura, double lado) {
		return altura * lado;
	}
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
