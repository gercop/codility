package codificacao_apoio;

public class Filho  extends Pai {
	private String nome;

	public Filho() {
		this.nome = null;
		this.descricao = null;
	}

	public Filho(String nome) {
		this.nome = nome;
	}

	public Filho(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setValue(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
