package codificao_topico_heranca;

public class heranca_classe_static_V2 {

	static class A {
		
		protected String a;
	
		public A(String a) {
			this.a = a;
		}
	}	
	
	//Maiores detalhes: http://www.mauda.com.br/?p=1670
	static class B extends A {
		protected String a; 
		protected String b;
		
		public B(String b) {
			super(b); //teve que colocar essa linha aqui para funcionar, antes estava depois de a="a"; 
			a = "a";
			//super(b); //Não se pode chamar o super na segunda linha, sempre na primeira linha.
			this.b = b;
		}
		
		void  print() {
			System.out.println(b+a);
		}
	}

	public static void main(String[] args) {
		new B("b").print();
	}
}
