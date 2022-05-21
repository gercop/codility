package codificacao_topicos;

import codificao_topico_heranca.A;

public class objects_equals_V1 {

	public static void main(String[] args) {

		System.out.print("Neste caso temos a mesma instância: ");
		A a1 = new A("Teste 1");		
		A a2 = new A("Teste 1");
		
		if ( a1.equals(a2) ) {
			System.out.println("São iguais: ");
			System.out.println("Objeto 1: " + a1);
			System.out.println("Objeto 2: " + a2);
		} else {
			System.out.println("Não são iguais: ");
			System.out.println("Objeto 1: " + a1);
			System.out.println("Objeto 2: " + a2);
		}
		
		System.out.print("\nNeste caso temos a mesma classe: ");
		if ( a1.equals(a1) ) {
			System.out.println("São iguais: ");
			System.out.println("Objeto 1: " + a1);
			System.out.println("Objeto 1: " + a1);
		} else {
			System.out.println("Não são iguais: ");
			System.out.println("Objeto 1: " + a1);
			System.out.println("Objeto 1: " + a1);
		}

	}

}
