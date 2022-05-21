package codificacao_topico_20_heranca;

public class B  extends A {
	private String value;

	public B() {
		this.value = "Teste Classe B";
		this.description = "Descrição Classe B";
	}

	public B(String value) {
		this.value = value;
	}

	public B(String value, String description) {
		this.value = value;
		this.description = description;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
