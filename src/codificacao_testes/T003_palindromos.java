package codificacao_testes;

public class T003_palindromos {

	public static boolean ehValido(char c) {
		
		if ( (c >= 97 && c <=122) ||  c == 63 )
			return true;
		else
			return false;
	}

	public static String solution(String S) {

        int tam = S.length();
        StringBuilder newString = new StringBuilder(S);    

        if ( (tam >= 1) && (tam <= 100) ) {           

            for (int i=0; i<tam; i++) {
                if (!ehValido(S.charAt(i))) {                                    
                    return "NO";
                }
            }

            for (int i=0; i<tam; i++) {
                if ( S.charAt(i) == '?' ) {                
                	if (S.charAt(tam-i-1) != '?')
                		newString.setCharAt(i,S.charAt(tam-i-1));
                	else
                		newString.setCharAt(i,'a');
                }
            }

            for (int i=0; i<tam/2; i++) {                
                if ( newString.charAt(i) !=  newString.charAt(tam-i-1) ) {
                        return "NO";                   
                }
            }
        }

        return newString.toString();
        
    }

	public static void main(String[] args) {
		
		System.out.println(solution("?a?"));

	}

}
