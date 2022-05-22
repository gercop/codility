package codificacao_topico_30_interface;

interface One {	
	
	public abstract void setDescricao(String descricao);
	public abstract String getDescricao();
	
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method () {
        System.out.println("Two");
    }
}

public class interface_V01 implements One, Two{

	private String descricao;
	
	@Override
	public void method() {	
		One.super.method();
		Two.super.method();
	}
	
	public static void main(String[] args) {
		
		interface_V01 i1 = new interface_V01();
		i1.method();

	}

	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;		
	}

	@Override
	public String getDescricao() {		
		return this.descricao;
	}
}
