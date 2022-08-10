package codificacao_topico_10_classes;

public class Duck {
	
private String name;
	
	Duck () {
		
		this.name = "";
	}
	
	Duck (String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Exemplo de como modificar toString(): " + name;
	}

	public static void main(String[] args) {

		System.out.println(new Duck("Mobby"));
	}

}
