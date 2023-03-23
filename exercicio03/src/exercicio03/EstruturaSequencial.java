package exercicio03;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int A = sc.nextInt();
		System.out.print("Enter an integer: ");
		int B = sc.nextInt();
		System.out.print("Enter an integer: ");
		int C = sc.nextInt();
		System.out.print("Enter an integer: ");
		int D = sc.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
		System.out.printf("DIFFERENCE: %d", diferenca);

		
		
		sc.close();
	}

}
