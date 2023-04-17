package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		System.out.println("FIM");

	}

	public static void method1() {

		System.out.println("****** START METHOD 01 ******");
		System.out.println("*****************************");
		System.out.println("****** START METHOD 02 ******");
		System.out.println();
		method02();
		System.out.println();
		System.out.println("****** END METHOD 01 ******");
		System.out.println("***************************");
		System.out.println("****** END METHOD 02 ******");


	}

	public static void method02() {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o nome de quantas pessoas quiser separadas por espaço:");
			String[] vector = sc.nextLine().split(" ");
			System.out.println("Agora digite um número qualquer:");
			int position = sc.nextInt();			
			System.out.println(vector[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Digitou uma posição inexistente, bye bye");
			System.out.println();
		
		} catch (InputMismatchException e) {
			
			System.out.println("Te pedi um número e não uma letra.");
			e.printStackTrace(); // imprime o tipo de exceção e a sequencia de chamadas que gerou a exceção
			sc.nextLine();
		}
		
		
		sc.close();

	}

}
