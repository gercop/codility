package codificacao_topico_01_geral;

public class StringBuilder_V01 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");
		//Errado: sb.deleteCharAt(0).insert(0, "H")." World!";
	    sb.deleteCharAt(0).insert(0, "H").append("World!");
	    System.out.println(sb);

	}

}
