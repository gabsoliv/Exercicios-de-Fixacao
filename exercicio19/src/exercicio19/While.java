package exercicio19;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suaSenha;
		System.out.print("Type your password: ");
		suaSenha = sc.nextInt();
		int senha = 2002;
		
		while (senha != suaSenha) {
			System.out.println("Invalid password");
			System.out.print("Type your password: ");
			suaSenha = sc.nextInt();
		}
		
		System.out.print("Access allowed");
		
		
		
		sc.close();

	}

}
