package codificacao_topico_20_heranca;

import codificacao_apoio.Filho;

public class heranca_acesso_protected {

	public static void main(String[] args) {
		
		Filho filho = new Filho("Ricardo","Engenheiro F�sico de 45 anos");		
		System.out.println(filho.getNome() + " - " + filho.getDescricao());

	}

}
