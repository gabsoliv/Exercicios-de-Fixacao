package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, maisVelho, pessoaMaisVelha;
		System.out.print("Quantas pessoas voce vai digitar?");
		n = sc.nextInt();
		
		String[] names = new String[n];
		int[] idades = new int[n];
		
		for (int i=0; i<n ; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa > ");
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		maisVelho = idades[0];
		pessoaMaisVelha = 0;		
		for(int i=0; i<n ; i++) {
			if(idades[i] > maisVelho) {
				maisVelho = idades[i];
				pessoaMaisVelha = i;
			}
		}
		
		System.out.println("O mais velho é: " + names[pessoaMaisVelha]);
		sc.close();

	}
}
