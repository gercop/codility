package codificacao_topico_01_geral;

public class variavel_primitiva_int {

	public static void main(String[] args) {
		
		//The int type in Java can be used to represent any whole number from -2147483648 to 2147483647. 
		//Therefore, this code will not compile as the number assigned to 'b' is larger than the int type can hold.
		int a = 1234512345;		
		System.out.println(a);
		
		//int b = 12345123451; //The literal 12345123451 of type int is out of range		
		//System.out.println(b);
	}
}
