package codificacao_topicos;

public class switch_string {
	
	public static void main(String[] args) {
		String abc = "a";
		
		switch (abc) {
		case "a": 
			System.out.print("a");
		case "b": 
			System.out.print("b");
		case "c": 
			System.out.print("c");			
		default:
			System.out.print("not found");
		}
	}

}
