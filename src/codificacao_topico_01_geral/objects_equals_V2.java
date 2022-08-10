package codificacao_topico_01_geral;

public class objects_equals_V2 {

	public static void main(String[] args) {

		String a = "A";
		String b = "A";
		
		System.out.println(a == b); 
		System.out.println(a.equals(b));
		System.out.println( new String("A").equals(new String("A")) );
		System.out.println( new String("A") == new String("A") );
	}
}
