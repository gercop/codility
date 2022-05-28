package codificacao_topico_10_classes;

public class static_method {

	private static void set(int a) {
		
		int b = ++a;  //a variável "b" é irrelevante neste caso e o método set também não gera nenhuma alteração!
		b++;
	}

	public static void main(String[] args) {
		int value = 0;
		
		set(value); //Não é necessário chamar o método set()
		System.out.print("Antes: " + value + " | ");
		
		set(++value); //tanto faz ser ++value ou value++
		System.out.print("Depois: " + value);
	}
}
