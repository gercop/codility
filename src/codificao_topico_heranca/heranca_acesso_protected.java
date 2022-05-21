package codificao_topico_heranca;

public class heranca_acesso_protected {

	public static void main(String[] args) {
		
		B b = new B("teste value","teste description");
		
		System.out.println(b.getValue() + " - " + b.getDescription());

	}

}
