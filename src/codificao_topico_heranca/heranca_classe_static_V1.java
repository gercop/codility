package codificao_topico_heranca;

public class heranca_classe_static_V1 {

	static class A {
		
		protected String a;
		
		public A(String a) {
			this.a = a;
		}
	}
	
	static class B extends A {
		protected String a; //Se vc tirar esse protected ele passa a usar a variável "a" da classe A
		protected String b;
		
		public B(String b) {
			super(b);
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
