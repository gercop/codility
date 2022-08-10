package codificacao_topico_40_listas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator_V01 {

	public static void main(String[] args) { 
	
		String[] array = {"abc", "2", "10", "0"};
		List<String> list = Arrays.asList(array);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
	}
}
