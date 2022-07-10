package codificacao_testes;

interface Interface1 {
	
    static void print() {
        System.out.print("Hello ");
    }
}

interface Interface2 {
	
    static void print() {
        System.out.print("World!");
    }
}

public class T001_hello_world {

	public static void main(String[] args) {
		
		System.out.println( "10/07/2022: Hello World!!!" );
		
		//Outra forma mais arrojada de usar o interface
		Interface1.print(); 
		Interface2.print();
	}

}
