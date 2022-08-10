package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.List;

class Duck {
	
	private String name;
	
	Duck () {
		this.name = "";
	}
	
	Duck (String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class arraylist_V05 {

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<Duck>();
		
		ducks.add( new Duck("Waddles") );
		
		Duck waddles = new Duck();
		ducks.add(waddles);
		
		System.out.println(new Duck("Mobby"));
	}

}
