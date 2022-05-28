package codificacao_topico_01_geral;

public class repeticoes_V1 {
	
	public static void main(String[] args) { 
		
		int count = 0;
		for (int i = 0;;) {
			int n = 0;
			for (;;) {
				System.out.println(n);
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
