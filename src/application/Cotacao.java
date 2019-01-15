package application;

import java.util.Locale;
import java.util.Scanner;
import util.ConversorMoeda;

public class Cotacao {

	public static void valorEmReais() {
		
	Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is the dollar price? ");
	double price = sc.nextDouble();
	
	System.out.println("How many dollars will be bought? ");
	double quantity = sc.nextDouble();
	
	double total = ConversorMoeda.CurrencyConverter(price, quantity);
	
	System.out.printf("Amount to be paid in reais = %.2f%n", total);
		/* 
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		*/
		sc.close();
	}
	
}
