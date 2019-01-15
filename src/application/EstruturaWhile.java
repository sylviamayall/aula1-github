package application;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhile {
	//Escreva um programa que repita a leitura de uma senha até que ela seja válida.
	//Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
	//Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
	//e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
	public static void salario() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		String senha;
		senha = null;
		while (senha != "London95@") {
			System.out.println("Senha Inválida!");
			senha = sc.nextLine();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
	//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada 
	//de pontos no sistema cartesiano. Para cada ponto escrever o quadrante 
	//a que ele pertence. O algoritmo será encerrado quando pelo
	//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
	public static void quadrante() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe Coordenadas X e Y:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
					System.out.println("primeiro");
				}
				else if (x > 0 && y < 0) {
					System.out.println("quarto");
				}
				else if (x < 0 && y < 0) {
					System.out.println("terceiro");
				}
				else if (x < 0 && y > 0) {
					System.out.println("segundo");
				}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
	//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
	//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
	//1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
	//Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado 
	//um novo código (até que seja válido). O programa será encerrado quando o código informado 
	//for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes 
	//que abasteceram cada tipo de combustível, conforme exemplo.
	public static void posto() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			System.out.println("Informe Código Combustível:");
			tipo = sc.nextInt();
				if (tipo == 1) {
					somaAlcool = somaAlcool + 1;
				}
				else if (tipo == 2) {
					somaGasolina = somaGasolina + 1;
				}
				else if (tipo == 3) {
					somaDiesel = somaDiesel + 1;
				}
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool = " + somaAlcool + " ");
		System.out.println("Gasolina = " + somaGasolina + " ");
		System.out.println("Diesel = " + somaDiesel + " ");
		sc.close();
	}
}
