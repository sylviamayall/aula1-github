package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Encap;

public class MediaPreco {

		public static void calcula() {
			Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			Product_Encap[] vect = new Product_Encap[n];
			
			for (int i=0; i<vect.length; i++) {
				sc.nextLine();
				String name = sc.nextLine();
				double price = sc.nextDouble();
				
				vect[i] = new Product_Encap(name,price);
			}
			
			double soma = 0;
			
			for (int i=0; i<vect.length; i++) {
				soma += vect[i].getPrice();
			}
			
			double media = soma / n;
			
			System.out.printf("Média Preço: %.2f%n", + media);
			
		sc.close();
		}
}
