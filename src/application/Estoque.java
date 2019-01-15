package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {
	
	public static void calculaEstoque() {
	
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter product data: ");
	
		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();
	
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
	
        //Sobrecarga
		//Product product = new Product(name, price, quantity);
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
	
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
	
		int quantity = sc.nextInt();
		product.addProducts(quantity);
	
		System.out.println();
		System.out.println("Update data: " + product);
	
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
	
		System.out.println();
		System.out.println("Update data: " + product);
	
		sc.close();
	}
}
