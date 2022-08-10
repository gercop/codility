package codificacao_topico_01_geral;

public class operadores_bitabit {


	//https://www.javatpoint.com/pt/operadores-em-java
	//Disju��o inclusiva: https://www.infoescola.com/matematica/conectivos-logicos/
	public static void main(String[] args) {

		int i1 = 1; // bin�rio: 01
		int i2 = 2; // bin�rio: 10 
		
		//Disju��o inclusiva ou OU inclusivo
		/* 0 0 = 0
		 * 1 0 = 1
		 * 0 1 = 1
		 * 1 1 = 1
		 */
		if ((i1 | i2) == 3) {
			System.out.println("Operador bit a bit OU inclusivo");
		}

		//Disju��o exclusiva ou OU exclusivo
		/* 0 0 = 0
		 * 1 0 = 1
		 * 0 1 = 1
		 * 1 1 = 0
		 */		
		int op = i1 ^ i2; //p XOR q - https://pt.wikipedia.org/wiki/Ou_exclusivo: 
		//A sa�da � igual a 0 se as entradas forem iguais. A sa�da � igual a 1 se as entradas n�o forem iguais, se uma delas diferirem das outras.
		if (op < 4) {
			System.out.println("Operador bit a bit OU exclusivo");
		}		
	}
}
