package codificacao_topico_25_polimorfismo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class polimorfismo_V01 {

	public static void main(String[] args) {
		List[] myLists = { 
				new ArrayList<>(), 
				new LinkedList<>(), 
				new Stack<>(), 
				new Vector<>(), };

		for (List list : myLists) {
			list.clear();
		}
	}
}
