package codificacao_topico_01_geral;

public class try_catch_finally_V3 {

	public static void main(String[] args) {
		try {
		    System.out.println("Hello World");
		} catch (Exception e) {
		    System.out.println("e");
		//ArithmeticException é derivada de RuntimeException, que é derivada de Exception!
		/*} catch (ArithmeticException e) { 
		    System.out.println("e");*/
		} finally {
		    System.out.println("!");
		}
	}

}
