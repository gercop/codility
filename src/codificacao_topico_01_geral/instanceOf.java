package codificacao_topico_01_geral;

import java.util.ArrayList;
import java.util.List;

public class instanceOf {

	public static void main(String[] args) {
		List list = new ArrayList();
        list.add("hello");
        list.add(2);
        
        System.out.print(list.get(0) instanceof Object);
        System.out.print(list.get(1) instanceof Integer);

	}

}
