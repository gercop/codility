package codificacao_topico_40_listas;

import java.util.HashMap;

public class hashmap_V1 {

	/*
	   * Criamos nosso HashMap que ir� armazenar um par chave-valor,
	   * sendo que tanto a chave como o valor dever� sempre ser do tipo
	   * "String". Pois especificamos isso no Generics
	   * atrav�s do <String,String>
	   *
	   * Aten��o: Lembre-se que o tamanho inicial do HashMap �
	   * 16 e o load factor � 0.75,
	   * ent�o quando nossa lista alcan�ar o tamanho 12,
	   * automaticamente ela dobrar� para 32.
	   * Vamos ver isso acontecer.
	   * */
	public static void main(String[] args) {
		HashMap<String, Integer> pantry = new HashMap<>();

	    pantry.put("Apples", 3);
	    pantry.put("Oranges", 2);
	    
	    System.out.println("Tamanho da lista: " + pantry.size());

	    int currentApples = pantry.get("Apples");
	    pantry.put("Apples", currentApples + 4);

	    System.out.println(pantry.get("Apples"));
	}

}
