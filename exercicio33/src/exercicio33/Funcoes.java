package exercicio33;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberA, numberB, numberC;
		
		System.out.print("Enter a three numbers: ");
		numberA = sc.nextInt();
		numberB = sc.nextInt();
		numberC = sc.nextInt();
		
		int higher = max(numberA, numberB, numberC); // o max é a funcão que vou criar e pega 3 numeros inteiros e retorna o maior entre eles
		showResult(higher); // outra função criada para passar apenas o resultado

		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
			
		} else if (b > c) {
			aux = b;
			
		} else {
			aux = c;
		}
		
		return aux;		
	}
	
	public static void showResult(int value) {
		System.out.println("O maior entre eles é: " + value);
		
	}

}
