package codificacao_topico_20_heranca;

public class A {
	
	protected String description;
	
	public A() {
		this.description = "Descrição Classe A";
	}

	public A(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
