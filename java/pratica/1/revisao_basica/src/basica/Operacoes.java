package basica;

public class Operacoes {

	public static void main(String[] args) {

		int x1, y1;
		
		x1 = 5;
		
		y1 = 2 * x1;
		
		System.out.println(x1);
		System.out.println(y1);
		
		int x2;
		double y2;
		
		x2 = 5;
		
		y2 = 2 * x1;
		
		System.out.println(x2);
		System.out.println(y2);
	
		double b , B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);

		float b1, B1, h1, area1;

		b1 = 6f;
		B1 = 8f;
		h1 = 5f;

		area1 = (b1 + B1) / 2f * h1;	
		
		System.out.println(area1);
	
		int a1, b3;
		double resultado;
	
		a1 = 5; 
		b3 = 2;
		
		resultado = (double) a1 / b3;
		
		System.out.println(resultado);
	
		int b4;
		double a2;
	
		a2 = 5.0; 
		b4 = (int) a2;
		
		System.out.println(b4);
	}
	
}
