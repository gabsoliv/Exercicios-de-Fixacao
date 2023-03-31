package entities;  // pacote da classe

public class Triangle { // triangle = nome da classe 
	// public: indica que pode ser acessada por outro aquivo
	
	public double a;  // atributos
	public double b;
	public double c;
	
	public double area() {  
		// double = tipo do dado que o método retorna, caso não retorne nada usa-se void
		// () onde se passa a lista de parametros do metodo
		// area = nome do metodo
		
		double p = (a + b + c) / 2;
		return Math.sqrt (p * (p - a)  * (p - b) * (p - c));  // corpo do método
	
	}

}
