package exercicio07;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("Enter a number: "); 
		number = sc.nextInt();
		
		if (number >= 0) {
			System.out.print("Positivo");
		} else if (number < 0) {
			System.out.print("Negativo");
		}
		
		sc.close();

	}

}
