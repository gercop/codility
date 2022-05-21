package codificacao_topico_01_geral;

public class try_catch_finally_V1 {

	public static void main(String[] args) {
		try {
			System.out.print("Start");
			throw new Exception("abc");	
		} catch (Exception e) {
			System.out.print("Middle");
		} finally {
			System.out.print("End");
		}
	}

}
