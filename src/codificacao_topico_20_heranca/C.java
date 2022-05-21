package codificacao_topico_20_heranca;

//Classe com mais de 6 construtores:
public class C {
	
	public String nome;
	public int idade;
	public String endereco;
	public String cep;
	public String cpf;
	public String telefone;
	public String email;
	
	public C() {
		this.nome = "";
		this.idade = 0;
		this.endereco = "";
		this.cep = "";
		this.cpf = "";
		this.telefone = "";
		this.email = "";
	}
	
	public C(String nome) {
		this.nome = nome;
		this.idade = 0;
		this.endereco = "";
		this.cep = "";
		this.cpf = "";
		this.telefone = "";
		this.email = "";
	}
	
	public C(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;		
		this.endereco = "";
		this.cep = "";
		this.cpf = "";
		this.telefone = "";
		this.email = "";
	}
	
	public C(String nome, int idade, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = "";
		this.cpf = "";
		this.telefone = "";
		this.email = "";
	}	

	public C(String nome, int idade, String endereco, String cep) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = "";
		this.telefone = "";
		this.email = "";
	}
	
	public C(String nome, int idade, String endereco, String cep, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.telefone = "";
		this.email = "";
	}
	
	public C(String nome, int idade, String endereco, String cep, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = "";
	}	

	public C(String nome, int idade, String endereco, String cep, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
