package codificacao_topico_20_heranca;

class MainClass {
	
  final String message(){
      return "Hello!";
  }
}

public class heranca_classe_V1 extends MainClass {

	public static void main(String[] args) {		
		
		System.out.println(new MainClass().message());
	}
}

/*Compilation error because of final methods cannot be overridden, and here message() is a 
 * final method, and also note that Non-static method message() cannot be referenced from a static context.
 */
/*String message() {
	return "World";
}*/


