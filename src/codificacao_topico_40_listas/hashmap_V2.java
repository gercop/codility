package codificacao_topico_40_listas;

import java.util.HashMap;
import java.util.Map;

/*referencia: https://www.alura.com.br/artigos/iterando-por-um-hashmap-em-java?gclid=CjwKCAjwkMeUBhBuEiwA4hpqEFCVW7FG77BDgbDv5qcgpXPFof-v9d4vxGGM36ktFZQI4K90kPuWYxoCdR0QAvD_BwE
 * 
 */
public class hashmap_V2 {

	public static void main(String[] args) {
		HashMap<String, Integer> pantry = new HashMap<>();

	    pantry.put("Apples", 3);
	    pantry.put("Oranges", 2);
	    pantry.put("Bananas", 4);	    
	    
	    for (String key: pantry.keySet()) {
	    	System.out.println( "key: " + key + " - Valor: " + pantry.get(key) );
	    }
	    
	    System.out.println();
	    
	    for (Map.Entry<String, Integer> entrada: pantry.entrySet()) {
	    	System.out.println( entrada );
	    }
	    
	    System.out.println();
	    pantry.keySet().stream().forEach(System.out::println);
	    
	    System.out.println();
	    pantry.values().stream().forEach(System.out::println);
	    
	    System.out.println();
	    pantry.forEach( (fruta, codigo) -> System.out.println(fruta + " -> " + codigo) );
	    
	    pantry.put("Bananas", 45);
	    System.out.println();
	    pantry.forEach( (fruta, codigo) -> System.out.println(fruta + " -> " + codigo) );	    
	    
	    System.out.println("\nTamanho da lista: " + pantry.size());
	}

}
