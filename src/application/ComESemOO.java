package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
import util.Calculator;

public class ComESemOO {
	
	public static void semOO() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
	
	// Solução Sem OO
			double xA, xB, xC, yA, yB, yC;
			
			System.out.println("Enter the measures of triangle X: ");
			xA = sc.nextDouble();
			xB = sc.nextDouble();
			xC = sc.nextDouble();
			System.out.println("Enter the measures of triangle Y: ");
			yA = sc.nextDouble();
			yB = sc.nextDouble();
			yC = sc.nextDouble();
			
			double p = (xA + xB + xC) / 2.0;
			double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
			
			p = (yA + yB + yC) / 2.0;
			double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
			
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);
			
			if (areaX > areaY) {
				System.out.println("Larger area: X");
			}
			else {
				System.out.println("Larger area: Y");
			}

			// Variável x e y são do tipo Triangle
			// São instânciadas com o new
		sc.close();
	}
	public static void comOO() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
			
			System.out.println("Enter the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);
			
			if (areaX > areaY) {
				System.out.println("Larger area: X");
			}
			else {
				System.out.println("Larger area: Y");
			}
		sc.close();
	}
	// Com membros estáticos
	public static void comStaticOO() {
		Locale.setDefault(Locale.US); // Para funcionar precisa ser antes do Scanner
		Scanner sc = new Scanner(System.in);
	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
			
			System.out.println("Enter the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaX = Calculator.areaTriangleHeron(x.a, x.b, x.c);
			double areaY = Calculator.areaTriangleHeron(y.a, y.b, y.c);
			
			
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);
			
			if (areaX > areaY) {
				System.out.println("Larger area: X");
			}
			else {
				System.out.println("Larger area: Y");
			}
			sc.close();
	}
}
