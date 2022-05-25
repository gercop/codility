package codificacao_topico_01_geral;

public class try_catch_finally_V2 {

	public static void badMethod1() throws Exception {		
		throw new Exception();
	}
	
	public static void badMethod2(){
		throw new Error();	//Error is not inherited from Exception
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("A");
			badMethod1();
			badMethod2();
			System.out.println("B");
		} catch (Exception ex) {
			System.out.println("C");
		} catch (Error ex) {
			System.out.println("Error");
		} finally {
			System.out.println("D");
		}

	}

}
