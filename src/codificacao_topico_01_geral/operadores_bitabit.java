package codificacao_topico_01_geral;

public class operadores_bitabit {


	//https://www.javatpoint.com/pt/operadores-em-java
	//Disjução inclusiva: https://www.infoescola.com/matematica/conectivos-logicos/
	public static void main(String[] args) {

		int i1 = 1; // binário: 01
		int i2 = 2; // binário: 10 
		
		//Disjução inclusiva ou OU inclusivo
		/* 0 0 = 0
		 * 1 0 = 1
		 * 0 1 = 1
		 * 1 1 = 1
		 */
		if ((i1 | i2) == 3) {
			System.out.println("Operador bit a bit OU inclusivo");
		}

		//Disjução exclusiva ou OU exclusivo
		/* 0 0 = 0
		 * 1 0 = 1
		 * 0 1 = 1
		 * 1 1 = 0
		 */		
		int op = i1 ^ i2; //p XOR q - https://pt.wikipedia.org/wiki/Ou_exclusivo: 
		//A saída é igual a 0 se as entradas forem iguais. A saída é igual a 1 se as entradas não forem iguais, se uma delas diferirem das outras.
		if (op < 4) {
			System.out.println("Operador bit a bit OU exclusivo");
		}		
	}
}
