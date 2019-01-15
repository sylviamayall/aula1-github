package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

//Em um banco, para se cadastrar uma conta bancária, 
//é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial
//que o titular depositou ao abrir a conta. 

//Este valor de depósito inicial, entretanto, é opcional, 
//ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
//conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.



public class TransacaoBancaria {
	
	public static void cadastro() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contaBancaria;
		
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Nome do Titular: ");
		sc.nextLine(); // Preciso colocar para que seja consumida a quebra de linha do nextInt anterior
		String titular = sc.nextLine();
				
		System.out.print("Tem depósito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.print("Entre com Valor Inicial: ");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(numero,titular,depositoInicial);
		}
		else {
			contaBancaria = new ContaBancaria(numero,titular);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		contaBancaria.deposito(deposito);
		System.out.println("Updated account data:");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		contaBancaria.saque(saque);
		System.out.println("Updated account data:");
		System.out.println(contaBancaria);
		
		sc.close();
	}
}