package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Capitulo2 {
	//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a 
	//soma desses números com uma mensagem explicativa, conforme exemplos.
		public static void somaNumeros() {
			
			Scanner sc = new Scanner(System.in);
			int a,b,sum;
			
			System.out.println("Enter two numbers:");
			a = sc.nextInt();
			b = sc.nextInt();
			
			sum = (a + b);
			
			System.out.println("SOMA = " + sum);
			
			sc.close();
		}
	
		//Faça um programa para ler o valor do raio de um círculo, 
		//e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		
		public static void calculaArea() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Raio do Círculo: ");
			
			double raio = sc.nextDouble();
			double area = Calculator.areaCirculo(raio);
			
			System.out.printf("%.4f%n", area);
			sc.close();
		}
			
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		public static void diferenca() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			int a,b,c,d, dif;
			System.out.println("Enter 4 Values for a,b,c and d:");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			dif = Calculator.diferencaEntreQuatro(a, b, c, d);
			System.out.println("Resultado da diferença " + dif);
			sc.close();
		}
		
		//Fazer um programa que leia o número de um funcionário, 
		//seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. 
		//A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		public static void salary() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
								
			System.out.println("Enter Nome:");
			String nome = sc.nextLine();
			
			System.out.println("Número de Horas Trabalhadas:");
			int HorasTrabalhadas = sc.nextInt();
			
			System.out.println("Valor por hora:");
			int ValorPorHora = sc.nextInt();
			
			double salario = ValorPorHora * HorasTrabalhadas;
			System.out.printf("Nome: %s Salário: $ %.2f%n%n", nome, salario);
			
			sc.close();
			
		}
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		//o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
		//e o valor unitário de cada peça 2.
		//Calcule e mostre o valor a ser pago.
		
		public static void valorAPagar() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			int cod1 = sc.nextInt();
		    int qte1 = sc.nextInt();
		    double preco1 = sc.nextDouble();
		    
		    int cod2 = sc.nextInt();
		    int qte2 = sc.nextInt();
		    double preco2 = sc.nextDouble();
		    
		    double total = preco1 * qte1 + preco2 * qte2;
		    
		    System.out.println("Código: " + cod1);
		    System.out.println("Código: " + cod2);
		    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
			
			sc.close();
		}
		//Fazer um programa que leia três valores com ponto flutuante 
		//de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.
		
		public static void areas() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
		    
			double A,B,C;
		    A = sc.nextDouble();
		    B = sc.nextDouble();
		    C = sc.nextDouble();
		    
		    double triangulo = Calculator.areaTriangle(A, C);
			double circulo = Calculator.areaCirculo(C);
			double trapezio = Calculator.areaTrapezio(A, B, C);
			double quadrado = Calculator.areaQuadrado(B);
			double retangulo = Calculator.areaRetangle(A, B);
		    
			System.out.printf("Área do Triângulo: %.3f%n", triangulo);
		    System.out.printf("Área do Círculo: %.3f%n", circulo);
		    System.out.printf("Área do Trapézio: %.3f%n", trapezio);
		    System.out.printf("Área do Quadrado: %.3f%n", quadrado);
		    System.out.printf("Área do Retângulo: %.3f%n", retangulo);
		    
		    sc.close();
		}	
		

}
