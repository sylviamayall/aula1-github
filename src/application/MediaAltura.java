package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
	public static void calcula() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Média Altura: %.2f%n", + media);
		
	sc.close();
}
}