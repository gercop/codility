package codificacao_topico_01_geral;

public class switch_string {
	
	public static void main(String[] args) {
		String abc = "a";
		
		switch (abc) {
		case "a": 
			System.out.print("a"); //N�o foi colocado o break aqui			
		case "b": 
			System.out.print("b");
			break;
		case "c": 
			System.out.print("c");
			break; //Sem esse break aqui o default � executado tamb�m!
		default:
			System.out.print("not found");
		}
	}

}
