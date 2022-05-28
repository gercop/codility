package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.List;

public class arraylist_V01 {
	
	/*
	 * Q55. Why are ArrayLists better than arrays?
	 * You don't have to decide the size of an ArrayList when you first make it.
	 */
	public static void main(String[] args) {
		
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(Boolean.parseBoolean("false"));
		list.add(Boolean.TRUE);
		System.out.println(list);
		System.out.print(list.size());
		System.out.print(list.get(1) instanceof Boolean);
	}
}
