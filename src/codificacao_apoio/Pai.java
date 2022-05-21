package codificacao_apoio;

public class Pai {
	
	protected String descricao;
	
	public Pai() {
		this.descricao = null;
	}

	public Pai(String descricao) {
		this.descricao = descricao;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
}
