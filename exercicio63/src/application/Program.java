package application;

public class Program {

	public static void main(String[] args) {
		
		//boxing
		int x = 20;
		Object obj = x;		
		System.out.println("Boxing: " + obj);
		System.out.println();		
		//unboxing		
		int y = (int) obj;	
		System.out.println("Unboxing: " + y);
		System.out.println();
		//wrapper classes
		int z = 20;
		Integer object = z;
		Integer w = object * 4;
		System.out.println("Wrapper Classes: "+ object);
		System.out.println("Wrapper Classes: " + w);
	}

}
