package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Orientado_a_objeto {

	public static void main(String[] args) {
		
		//sem orientação a objeto
		
/*		double xA, xB, xC, yA, yB, yC;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("enter the measures of triangle x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("enter the measures of triangle y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		 p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle x area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("larger area : x");
		} else {
			System.out.println("larger area : y");
		}
*/		
		//com a orientação a objeto
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("larger area : x");
		} else {
			System.out.println("larger area : y");
		}
		
		
		sc.close();
	}
	
}
