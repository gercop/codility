package codificacao_topicos;

public class repeticoes_V1 {
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0;;) {
			int n = 0;
			for (;;) {
				if (n++ > i) {
					count += n;
					break;
				}
			}
			if (++i > 10) {
				break;
			}
		}
		
		System.out.println(count);
	}
	
	

}
