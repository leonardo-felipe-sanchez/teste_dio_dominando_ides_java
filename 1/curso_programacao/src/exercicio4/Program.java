package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(mat[i][j]+ " ");
			}
		}
		System.out.println(" ");
		System.out.println("main diagonal");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println(" ");
		System.out.println("negative numbers:" + count);
		
		
		sc.close();
	}

}
