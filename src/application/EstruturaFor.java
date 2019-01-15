package application;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {
		//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
		//um valor por linha, inclusive o X, se for o caso.
		public static void mostraImpar() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com a quantidade de vezes");
			int x = sc.nextInt();
			
			for (int i = 1; i <= x; i++) {
				
				if (i % 2 != 0) {
					System.out.println("" + i);
				}
							
			}
			sc.close();
		}
		//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X 
		//que serão lidos em seguida. Mostre quantos destes valores X estão dentro do 
		//intervalo [10,20] e quantos estão fora do intervalo, mostrando
		//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, 
		//e "out" para fora do intervalo).
		public static void dentroIntervalo() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com a quantidade de vezes:");
			int x = sc.nextInt();
			int in = 0;
			int out = 0;
			
			for (int i = 1; i <= x; i++) {
				System.out.println("Entre com um número:");
				int y = sc.nextInt();
								
				if (y >= 10 && y <= 20) {
					in = in + 1;
				}
				else {
					out = out + 1;
				}
			}
			System.out.println(in + "in");
			System.out.println(out + "out");
			sc.close();
		}
		//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
		//Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
		//Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
		//sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 
		//e o terceiro valor tem peso 5.
		public static void casosDeTestes() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com a quantidade de Casos de Testes:");
			int x = sc.nextInt();
			
			for (int i = 0; i <= x; i++) {
				double valor1 = sc.nextDouble();
				double valor2 = sc.nextDouble();
				double valor3 = sc.nextDouble();
				double media = (valor1*2.0 +valor2*3.0 + valor3*5.0)/10.0;
				System.out.printf("%.1f%n%n", media);
			}
			sc.close();
		}
		
		
		//Fazer um programa para ler um número N. Depois leia N pares de números e 
		//mostre a divisão do primeiro pelo segundo. 
		//Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		public static void divisaoImpossivel() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com a quantidade de pares:");
			int x = sc.nextInt();
			
			for (int i = 0; i <= x; i++) {
				double valor1 = sc.nextDouble();
				double valor2 = sc.nextDouble();
				
				if (valor2 == 0) {
					System.out.printf("Divisão Impossível!");
				}
				else {
					double divisao = (valor1/valor2);
					System.out.printf("Valor Divisão" + divisao);
				}
			}
			sc.close();
		}
			
		//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial 
		//de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
		public static void fatorial() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com número para cálculo do fatorial:");
			int x = sc.nextInt();
			int fatorial = 1;
			for (int i = 1; i <= x; i++) {
				fatorial = fatorial * i;
			}
			System.out.printf("Fatorial é:" + fatorial);
			sc.close();
		}

		//Ler um número inteiro N e 
		//calcular todos os seus divisores.
		public static void divisores() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com número para cálculo dos divisores:");
			int x = sc.nextInt();
			for (int i = 1; i <= x; i++) {
				if (x % 1 == 0) {
					System.out.println(i);		
				}
			}
			
			sc.close();
		}
		
		//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		//exemplo.
		public static void quadradoCubo() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com número de vezes:");
			int x = sc.nextInt();
			for (int i = 1; i <= x; i++) {
				int primeiro = i;
				int segundo = i * i;
				int terceiro = i * i * i;
				System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			}
			
			sc.close();
		}
		
		
}
