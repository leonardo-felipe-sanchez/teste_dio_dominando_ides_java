package basica;

public class Matematica {

	public static void main(String[] args) {
		
		double tres = 3.0;
		double quatro = 4.0;
		double cinco = -5.0;
		double ra, be, ce;
		
		ra = Math.sqrt(tres);
		be = Math.sqrt(quatro);
		ce = Math.sqrt(25.0);
		
		System.out.println("raiz quadrada de " +tres+" = "+ ra);
		System.out.println("raiz quadrada de " +quatro+" = "+ be);
		System.out.println("raiz quadrada de 25 " + ce);
		
		ra = Math.pow(tres, quatro);
		be = Math.pow(tres, 2.0);
		ce = Math.pow(5.0, 2.0);

		System.out.println(tres + " elevado a "+ quatro+ " = "+ ra);
		System.out.println(tres + " elevado ao quadrado = "+ be);
		System.out.println("5 elevado ao quadrado = "+ ce);

		ra = Math.abs(tres);
		be = Math.abs(cinco);
		
		System.out.println("o valor absoluto de "+ quatro + " = "+ ra);
		System.out.println("o valor absoluto de "+ cinco + " = "+ be);
	}
	
}
