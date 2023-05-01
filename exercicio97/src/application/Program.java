package application;

import java.util.Locale;
import java.util.Scanner;

import model.entitites.AbstractShape;
import model.entitites.Circle;
import model.entitites.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AbstractShape s1 = new Circle(Color.ROSE, 2.0);
		AbstractShape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);

		System.out.println("Circle color:  " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));

		System.out.println();
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

		sc.close();

	}

}
