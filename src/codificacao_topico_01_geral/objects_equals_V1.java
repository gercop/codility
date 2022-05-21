package codificacao_topico_01_geral;

import codificacao_apoio.Pai;

public class objects_equals_V1 {

	public static void main(String[] args) {

		System.out.print("Neste caso temos a mesma instância: ");
		Pai a1 = new Pai("Teste 1");		
		Pai a2 = new Pai("Teste 1");
		
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
