package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import codificacao_apoio.Filho;

public class hashmap_V3 {

	public static void main(String[] args) {
		
		List<Filho> filhos = new ArrayList<Filho>();
		
		filhos.add( new Filho("Ricardo", "Engenheiro") );
		filhos.add( new Filho("Marcos",  "Pedreiro"  ) );
		filhos.add( new Filho("Ronaldo", "Marcineiro") );
		
		System.out.println(filhos.stream().map(Filho::getNome).collect(Collectors.toList()) );

	}
	
	

}
