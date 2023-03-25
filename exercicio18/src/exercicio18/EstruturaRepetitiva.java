package exercicio18;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter number: ");
		number = sc.nextInt();
		
		int soma = 0;
		while ( number != 0 ) {
			soma += number;
			number = sc.nextInt();
			
		}
		
		System.out.print(soma);
		
		
		sc.close();

	}

}
