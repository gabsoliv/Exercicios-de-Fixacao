package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];

		for(int i=0; i<matriz.length ; i++) {		
			for(int j=0; j<matriz[i].length ; j++) {				
				matriz[i][j] = sc.nextInt();
			}}
		
		System.out.println();
		System.out.print("Main diagonal: ");		
		for(int i=0; i<matriz.length ; i++) {					
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		System.out.print("Negative numbers= ");
		int count = 0;
		for(int i=0; i<matriz.length ; i++) {		
			for(int j=0; j<matriz[i].length ; j++) {				
				if(matriz[i][j] < 0) {
					count++;
				}}}
		
		System.out.print(count);
		
		sc.close();
	}
}
