package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Progam {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good Morning!", "Good evening!", "Hello, my family name is Santos.",
				"What's your Christian name?" };

		String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\devSuperior\\Exercicios-de-Fixacao\\exercicio91\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
