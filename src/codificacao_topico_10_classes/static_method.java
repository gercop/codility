package codificacao_topico_10_classes;

public class static_method {

	private static void set(int a) {
		int b = ++a;
		b++;
	}

	public static void main(String[] args) {
		int value = 0;
		
		set(value);
		System.out.print("Before: " + value + " | ");
		
		set(++value);
		System.out.print("After: " + value);
	}
}
