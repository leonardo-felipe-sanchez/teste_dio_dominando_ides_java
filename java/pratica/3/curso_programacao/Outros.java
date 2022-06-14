package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Outros {
	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		int n = sc.nextInt();
		int mask = 0b100000;
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		String original = "abcd FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("original -"+original+"-");
		System.out.println("to lower case -"+ s01+"-");
		System.out.println("to upper case -"+ s02+"-");
		System.out.println("trim -"+s03+"-");
		System.out.println("substring(2) -"+s04+"-");
		System.out.println("substring(2, 9) -"+s05+"-");
		System.out.println("replace('a', 'x') -"+s06+"-");
		System.out.println("replace('abc', 'xy') -"+s07+"-");
		System.out.println("index of: "+ i);
		System.out.println("last index of: "+ j);
		
		String s = "portato applo lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
		double y = 25.0;
		double x = Math.sqrt(y);
		
		System.out.println(x);
		
		System.out.println("enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		
		showResult(higher);
		
		/* if(a > b && a> c) {
			System.out.println("Higher = "+ a);
		} else if(b > c) {
			System.out.println("Higher = "+ b);			
		} else {
			System.out.println("Higher = "+ c);
		}
		*/
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		 if(x > y && x> z) {
				aux = x;
			} else if(y > z) {
				aux = y;		
			} else {
				aux = z;
			}
		 return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("higher = "+ value);
	}
}
