package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Ocupacao {
	
			public static void calcula() {
				Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Entre com a quantidade de quartos: ");
				int n = sc.nextInt();
				sc.nextLine();
				
				Aluguel[] vect = new Aluguel[10];
				
				for (int i=0; i<n; i++) {
					
					System.out.print("Nome: ");
					String name = sc.nextLine();
					
					System.out.print("Email: ");
					String email = sc.nextLine();									
					
					System.out.print("Quarto: ");
					int quarto = sc.nextInt();		
					sc.nextLine();
										
					vect[quarto] = new Aluguel(name,email);
				}
				
				System.out.println();
				System.out.print("Quartos Ocupados: ");
				System.out.println();
				
				for (int i=0; i<10; i++) {
					if (vect[i] != null) {
						System.out.println(i + ": " + vect[i]);	
					}
				}
			sc.close();
			}
}

