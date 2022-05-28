package codificacao_topico_01_geral;

public class parametros_copia {

	//Função inútil, pois o java não trabalha com parâmetros por referência:
	static void swapsies(int a, int b) {
		
	    int temp=a;
	    a=b;
	    b=temp;
	}
	
	public static void main(String[] args) {
		
		int x=5,y=10;
	    swapsies(x,y);
	    System.out.println(x+" "+y);
	}

}
