package codificacao_topico_20_heranca;

public class heranca_classe_static_V2 {

	static class Pai {
		
		protected String nome;
	
		public Pai(String nome) {
			this.nome = nome;
		}
	}	
	
	//Maiores detalhes: http://www.mauda.com.br/?p=1670
	static class Filho extends Pai {
		protected String nome; 
		protected String descricao;
		
		public Filho(String descricao) {
			super(descricao); //teve que colocar essa linha aqui para funcionar, antes estava depois de nome="Ricardo"; 
			nome = "Ricardo";
			//super(descricao); //Não se pode chamar o super na segunda linha, sempre na primeira linha.
			this.descricao = descricao;
		}
		
		void  print() {
			System.out.println(nome + " - " + descricao);
		}
	}

	public static void main(String[] args) {
		new Filho("Engenheiro Físico").print();
	}
}
