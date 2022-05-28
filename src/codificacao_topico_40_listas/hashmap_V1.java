package codificacao_topico_40_listas;

import java.util.HashMap;

public class hashmap_V1 {

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
