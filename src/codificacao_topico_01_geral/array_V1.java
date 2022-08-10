package codificacao_topico_01_geral;

public class array_V1 {
	
	public static void main(String[] args) {
		
		int array[] = { 1, 2, 3, 4 };
		/*Errado: 
		 * for (int i = 0; i < array.size(); i++) {
			System.out.print(array[i]);
		}*/
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
