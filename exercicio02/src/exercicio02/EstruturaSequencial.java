package exercicio02;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a floating number :");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("A = %.4f ", area);
		
		sc.close();
	}

}
