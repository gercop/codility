package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist_V06 {

	public static void main(String[] args) {
		
		//Errado: ArrayList<String> words = new ArrayList<String>(){"Hello", "World"};
		ArrayList<String> words1 = new ArrayList<String>();
		words1.add("Hello");
		words1.add("World");
		System.out.println(words1);
		
		//Errada: ArrayList words = Arrays.asList("Hello", "World");		
		List<String> words2 = Arrays.asList( new String[]{"Hello", "World"} );
		System.out.println(words2);
		List<String> words3 = Arrays.asList( "Hello", "World" );
		System.out.println(words3);
		
		//Errada: ArrayList<String> words = {"Hello", "World"};
		Object[] words4 = Arrays.asList( "Hello", "World" ).toArray();
		System.out.print("["+words4[0].toString()+", ");
		System.out.println(words4[1].toString()+"]");
		
		//Entrada: ArrayList<String> words = {"Hello", "World"};
		ArrayList<String> words5 = new ArrayList<>( Arrays.asList("Hello", "World") );
		System.out.println(words5);
		
	}
}
