package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("First trimester: ");
		student.trimestre01 = sc.nextDouble();
		System.out.println("Second trimester: ");
		student.trimestre02 = sc.nextDouble();
		System.out.println("Third quarter: ");
		student.trimestre03 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n" , student.pass());
		
		if (student.pass() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.failed());
			}
			else {
			System.out.println("PASS");
			}

		sc.close();

	}

}
