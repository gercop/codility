package codificacao_topico_10_classes;

public class static_method {

	private static void set(int a) {
		
		int b = ++a;  //a vari�vel "b" � irrelevante neste caso e o m�todo set tamb�m n�o gera nenhuma altera��o!
		b++;
	}

	public static void main(String[] args) {
		int value = 0;
		
		set(value); //N�o � necess�rio chamar o m�todo set()
		System.out.print("Antes: " + value + " | ");
		
		set(++value); //tanto faz ser ++value ou value++
		System.out.print("Depois: " + value);
	}
}
