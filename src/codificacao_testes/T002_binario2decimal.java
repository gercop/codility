package codificacao_testes;

import javax.swing.JOptionPane;

public class T002_binario2decimal {
	
	private final static int tamSBinario = 10;
	private final static int tamSDecimal = 6;

	private static int fator(char c) {
		if (c == '0')
			return 0;
		else
			return 1;				
	}
	
	private static int binario2decimal(String s) {
		
		int inteiro = 0;
		int tam = s.length();
		for (int i = 0; i < tam; i++) {
			
			int m_fator   = fator( s.charAt(i) );
			int p_fator   = tam -1 - i;
			int potencia  = (int) Math.pow(2,p_fator);
			
			inteiro += m_fator*potencia;			
		}					
		
		return inteiro;
	}
	
	
	private static Boolean parametro_valido(String s) {
					
		if ( s.length() == 0  ) {
			System.out.println("Erro: parâmetro vazio!");
			return false;
		};
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) != '0' && s.charAt(i) != '1') {
				System.out.println("Erro: os valores do parâmetro podem ser apenas 0 ou 1!");
				return false;
			}				
		}		
			
		return true;
	}
	
	private static int nropassos_binario2decimal(String s) {
		
		int contador = 0;		
		int inteiro = binario2decimal(s); 
				
		do {
			
			if (inteiro % 2 == 0) { //número par
				inteiro /= 2;
			} else {                //número ímpar
				inteiro -= 1;
			}
			
			contador++;
			
		} while (inteiro>0);		 
		
		return contador;
	}
	
	private static String formatar(String s, int largura) {
		
		int tam = s.length();
		for (int i=tam; i < largura; i++)
			s = '0' + s;
		return s;
	}	
	
	
	private static String inteiro2string(int inteiro) {
		
		try {
			return String.valueOf(inteiro);	
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null,e.getMessage());
			return "";
			
		}
		
	}
	
	public static void main(String[] args) {
		
		/* Rodar através do terminal: codility > src > condificacao_testes > Txx_xxx > show in local terminal
		 * Linha de comando de exemplo: java src\codificacao_testes\T002_binario2decimal.java "11" "0001101" 
		 * */
		for (int i = 0; i < args.length; i++)
			if ( parametro_valido(args[i]) ) {
				System.out.println("BINÁRIO "  
								   + formatar(args[i],tamSBinario) 
								   + " para DECIMAL: "  
								   + formatar(inteiro2string(binario2decimal(args[i])),tamSDecimal) 
								   + " - Qtde de passos: " 
								   + nropassos_binario2decimal(args[i]));
			}
		
	}

}
