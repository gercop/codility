package codificacao_topico_20_heranca;

public class heranca_classe_static_V1 {

	static class Pai {
		
		protected String nome;
		
		public Pai(String nome) {
			this.nome = nome;
		}
	}
	
	static class Filho extends Pai {
		
		protected String nome; //Se vc tirar esse protected ele passa a usar a variável "nome" da classe Pai
		protected String descricao;
		
		public Filho(String descricao) {
			super(descricao);
			this.descricao = descricao;
		}

		public Filho(String nome, String descricao) {
			super(nome);
			this.nome = nome;
			this.descricao = descricao;
		}
		
		void print() {
			System.out.println(nome+" - "+descricao);
		}
	}	
	
	public static void main(String[] args) {
		
		new Filho("Engenheiro Físico de 45 anos").print();
		new Filho("Ricardo","Engenheiro Físico de 45 anos").print();
	}
	


}
