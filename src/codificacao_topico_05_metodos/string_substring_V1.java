package codificacao_topico_05_metodos;

public class string_substring_V1 {

	public static void main(String[] args) {
		
		String fruta = "strawberries";
		System.out.println(fruta.substring(2, 5));
		
		//Pegadinha: "Esse tipo de teste não qualifica a capacitação de uma pessoa!
		String str1 = "abcde";
		str1.trim();
		str1.toUpperCase();
		str1.substring(3, 4);
		System.out.println(str1);
		
		//Correção:
		String str2 = "abcde";
		str2 = str2.trim();
		str2 = str2.toUpperCase();
		str2 = str2.substring(3, 4);
		System.out.println(str2);
	}

}
