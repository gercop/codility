package codificacao_topico_01_geral;

public class try_catch_finally_V1 {

	public static void main(String[] args) {
		
		try {
			System.out.print("Eu");
			throw new Exception(" não");	
		} catch (Exception e) {
			System.out.print(" gosto");
		} finally {
			System.out.print(" de Vegetais");
		}
	}

}
