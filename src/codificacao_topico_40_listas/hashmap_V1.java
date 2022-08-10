package codificacao_topico_40_listas;

import java.util.HashMap;

public class hashmap_V1 {

	/*
	   * Criamos nosso HashMap que irá armazenar um par chave-valor,
	   * sendo que tanto a chave como o valor deverá sempre ser do tipo
	   * "String". Pois especificamos isso no Generics
	   * através do <String,String>
	   *
	   * Atenção: Lembre-se que o tamanho inicial do HashMap é
	   * 16 e o load factor é 0.75,
	   * então quando nossa lista alcançar o tamanho 12,
	   * automaticamente ela dobrará para 32.
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
