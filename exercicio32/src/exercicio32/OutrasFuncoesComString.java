package exercicio32;

public class OutrasFuncoesComString {

	public static void main(String[] args) {
		
		String original = "- ABCDEf, ABCDEf, abcde, ABCDEf ,abcde, abcde ";
		String s01 = original.toUpperCase(); // transforma tudo em maisculo
		String s02= original.toLowerCase(); // transforma tudo em minusculo
		String s03 = original.trim(); // remove os espaços no inicio e no fim
		String s04 = original.substring(2); // exibe do índice 2 em diante
		String s05 = original.substring(2, 9); // exibe entre o indice 2 a 9
		String s06 = original.replace("A", "Z4Z3Z2Z1 hm.."); // troca a letra A que encontrar por Z4Z3Z2Z1 hm..
		String s07 = original.replace("abc", "HAHAHA"); // troca o conjunto abc por HAHAHA
		int i = original.indexOf("bc"); // informa em qual posição se encontra o primeiro bc
		int g = original.lastIndexOf("bc"); // informa onde se encontra o ultimo bc

		System.out.println("String original: " + original + "-");
		System.out.println("String .toUpperCase: " + s01 + "-");
		System.out.println("String .toLowerCase: " + s02 + "-");
		System.out.println("String .trim: " + s03 + "-");
		System.out.println("String .substring(2): " + s04 + "-");
		System.out.println("String .substring(2, 5): " + s05 + "-");
		System.out.println("String .replace(A, Z4Z3Z2Z1 hm..): " + s06 + "-");
		System.out.println("String .replace(abc, HAHAHA): " + s07 + " -");
		System.out.println("String .indexOf(bc): " + i + "-");
		System.out.println("String .LastIndexOf(): " + g + " -");
		System.out.println("Tamanho da String: " + original.length());
		
		String split = "potato apple orange";  // operação split
		String[] vector = split.split(" ");
		System.out.println(vector[0]);
		System.out.println(vector[1]);
		System.out.println(vector[2]);
	}

}
