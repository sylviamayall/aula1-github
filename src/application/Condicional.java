package application;

import java.util.Locale;
import java.util.Scanner;

public class Condicional {
	
	//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	public static void posNeg() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int a = sc.nextInt();
		if (a >= 0) {
			System.out.println("POSITIVO");
		}
		else { 
			System.out.println("NEGATIVO");
		}
		sc.close();
		}
	
	//Fazer um programa para ler um número inteiro, e depois dizer se este número é par ou ímpar.
	public static void parOuImpar() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("PAR");
		}
		else { 
			System.out.println("ÍMPAR");
		}
		sc.close();
		}
	
	//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
	//ordem crescente ou decrescente.
	public static void multiplos() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		if (a % b == 0 || b % a == 0) {
			// Resto zero são multiplos
			System.out.println("São Múltiplos");
		}
		else {
			// Resto zero são multiplos
			System.out.println("Não São Múltiplos");
		}
		sc.close();
		}
	
	//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	public static void hora() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int duracao;
		if (a <= 24 & b <= 24) { // Números de Hora Válidos
			if (b > a) {
				duracao = b - a;
			}
			else {
			//	b = b + 24;
			//	duracao = (b - a);
				duracao = 24 - a + b;
			}
			System.out.println("O Jogo durou = " + duracao + " hora(s)");
		}
		else {
			System.out.println("Números Inválidos");
		}
		sc.close();
		}

	//Com base na tabela abaixo, escreva um programa que leia o código de um item e 
	//a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	// codigo    Espoecificação   Preço
	// 1         Cachorro Quente  R$ 4,00
	// 2         X-Salada         R$ 4,50
	// 3         X-Bacon          R$ 5,00
	// 4         Torrada simples  R$ 2,00
	// 5         Refrigerante     R$ 1,50

	public static void lanchonete() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code and quantidade:");
		int codigo = sc.nextInt();
		int qte = sc.nextInt();
		double valorUnitario = 0;
		String especificacao = null;
		switch (codigo) {
		case 1:
			especificacao = "Cachorro Quente";
			valorUnitario = 4.00;  
			break;
		case 2:
			especificacao = "X-Salada";
			valorUnitario = 4.50;  
			break;
		case 3:
			especificacao = "X-Bacon";
			valorUnitario = 5.00;  
			break;	       
		case 4:
			especificacao = "Torrada Simples";
			valorUnitario = 2.00;  
			break;	       
		case 5:
			especificacao = "Refrigerante";
			valorUnitario = 1.50;  
			break;	       
		}
		double total;
		total = qte * valorUnitario;
		System.out.println("Total a Pagar = " + especificacao + " " + total);
		sc.close();
		}
	//Você deve fazer um programa que leia um valor qualquer e 
	//apresente uma mensagem dizendo em qual dos
	//seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
	//este valor se encontra. Obviamente se o valor não estiver em
	//nenhum destes intervalos, deverá ser impressa a mensagem "Fora de intervalo".

	public static void foraDeIntervalo() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int valor = sc.nextInt();
		if (valor <= 25) {
			System.out.println("O Valor = " + valor + " está no intervalo [0,25] ");
		}
		else if (valor > 25 & valor <= 50) {
			System.out.println("O Valor = " + valor + " está no intervalo [25,50] ");
		}
		else if (valor > 50 & valor <= 75) {
			System.out.println("O Valor = " + valor + " está no intervalo [50,75] ");
		}
		else if (valor > 75 & valor <= 100) {
			System.out.println("O Valor = " + valor + " está no intervalo [75,100] ");
		}
		else if (valor > 100) {
			System.out.println("O Valor = " + valor + " está fora de intervalo.");
		}
		sc.close();
		}
	//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
	//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
	//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
	//Se o ponto estiver na origem, escreva a mensagem "Origem".
	//Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme for a
	//situação.
	public static void quadrante() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a == 0 && b == 0) {
			System.out.println("Origem");
		}
		else if (a >= 0 & b >= 0) {
				System.out.println("Q1");
			}
		else if (a >= 0 & b <= 0) {
				System.out.println("Q4");
			}
		else if (a <= 0 & b >= 0) {
			System.out.println("Q2");
		}
		else if (a <= 0 & b <= 0) {
			System.out.println("Q3");
		}
		sc.close();
		}
	//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
	//pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados
	//em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo
	//é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
	//Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
	//segundo a tabela abaixo.
	// Renda IR
	// de 0.00 a R$ 2000.00 Isento
	// de R$ 2000.01 a R$ 3000.00 8%
	// de R$ 3000.01 a R$ 4500.00 18%
	// acima de R$ 4500.00 28%
	public static void salario() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		double a, imposto;
		imposto = 0;
		System.out.println("Enter Salary:");
		a = sc.nextDouble();
		if (a >= 0 && a <= 2000) {
			System.out.println("Isento");
		}
		else if (a > 2000 && a <= 3000){
			imposto = (a-2000) * 0.08;
		}
		else if (a > 3000 && a <= 4500){
			imposto = ((a-3000) * 0.18) + 80;
		}
		else if (a > 4500){
			imposto = ((a-4500) * 0.28) + 80 + 270;
		}
		if (imposto > 0) {
		System.out.printf("Imposto a Pagar: $ %.2f%n%n", imposto);
		}
		sc.close();
		}
	
}
