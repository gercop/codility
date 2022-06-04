package codificacao_apoio;

public class Main {

	static String MESSAGE = "Hello!";
	
	static void print(){
		
		System.out.println(MESSAGE);
	}	
	
	public static void main(String[] args) {
		
		Main.print();
		
		String a = "bikini";
		String b = "bikini";
		String c = "bikini";

		System.out.println(a == b);
		System.out.println(b == c);
	}

}
