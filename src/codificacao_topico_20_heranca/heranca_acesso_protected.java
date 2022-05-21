package codificacao_topico_20_heranca;

import codificacao_apoio.Filho;

public class heranca_acesso_protected {

	public static void main(String[] args) {
		
		Filho f = new Filho("Ricardo","Engenheiro Físico de 45 anos");
		
		System.out.println(f.getNome() + " - " + f.getDescricao());

	}

}
