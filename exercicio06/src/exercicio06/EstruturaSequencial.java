package exercicio06;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Enter 3 float values");
		System.out.print("First floating number: ");
		double A = sc.nextDouble();
		
		System.out.print("Second floating number: ");
		double B = sc.nextDouble();
		
		System.out.print("Third floating number: ");
		double C = sc.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGLE; %.3f%n ", triangulo);
		System.out.printf("CIRCLE: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("SQUARE: %.3f%n", quadrado);
		System.out.printf("RECTANGLE: %.3f%n", retangulo);
		
		
		sc.close();
	}

}
