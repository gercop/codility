package codificacao_topico_05_metodos;

public class string_substring_V2 {

	public static void main(String[] args) {
		
		String message = "Hello world!";
        String newMessage = message.substring(6, 12)
            + message.substring(12, 6);
        System.out.println(newMessage);
	}

}
