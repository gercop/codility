package codificacao_topico_20_heranca;

class Main {
	Object message(){
		
		return "Hello!";
	}	
}

class Auxiliar extends Main {
	@Override
 	String message(){ 		
		
 		return "World!";
 	}
}

public class heranca_classe_V2 {	

	public static void main(String[] args) {
	
		System.out.print(new Main().message());
		System.out.print(new Auxiliar().message());
	}

}
