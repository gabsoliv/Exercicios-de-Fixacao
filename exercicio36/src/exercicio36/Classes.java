package exercicio36;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Classes {

	public static void main(String[] args) {
		
		/*	PODE CONTER:
		 
		 Atributos (dados / campos)
		 Métodos (funções / operações)
		 
		A classe também pode prover muitos outros recursos, tais como:		 
			• Construtores
			• Sobrecarga
			• Encapsulamento
			• Herança
			• Polimorfismo
		 
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;  // meus objetos
		x = new Triangle();  // instaciação dos objetos
		y = new Triangle();
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();		
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n" , areaX);
		System.out.printf("Triangle Y area: %.4f%n" , areaY);
		
		if (areaX > areaY) {
			System.out.println("Area X");
			
		} else if (areaX < areaY) {
			System.out.println("Area Y");
			
		} else {
			System.out.println("Erro");
		}

		
		sc.close();

	}

}
