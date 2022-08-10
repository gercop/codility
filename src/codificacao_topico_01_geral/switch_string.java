package codificacao_topico_01_geral;

public class switch_string {
	
	public static void main(String[] args) {
		
		String key = "1";
		
		switch (key) {
		case "1": 
			System.out.print("1"); //Não foi colocado o break aqui			
		case "2": 
			System.out.print("2");
			break;
		case "3": 
			System.out.print("3");
			break; //Sem esse break aqui o default é executado também!
		default:
			System.out.print("default");
		}
	}

}
