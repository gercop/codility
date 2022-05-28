package codificacao_topico_10_classes;

public class static_class_V2 {
	
	static class Pojo {
		public int value;
	}
	
	private static void set(Pojo pojo) {
		int b = ++pojo.value; //a variável "b" é irrelevante neste caso.
		b++;
	}

	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		pojo.value = 0;
		
		set(pojo);
		System.out.print("Before: " + pojo.value + " | ");
		
		set(pojo);
		System.out.print("After: " + pojo.value);
	}
}
