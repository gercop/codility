package codificacao_topico_10_classes;

class TaxCalculator2002 {
	
	static double calculate (double total) {
		return total * .05;
	}
}

public class static_class_V1 {
	
	static class TaxCalculator2010 {		
		static double calculate (double total) {
			return total * .08;
		}		
	}
	
	static class TaxCalculator2022 {
		
		static double calculate (double total) {
			return total * .10;
		}		
	}

	public static void main(String[] args) {		
		
		System.out.println( TaxCalculator2002.calculate(50) );
		System.out.println( TaxCalculator2010.calculate(50) );
		System.out.println( TaxCalculator2022.calculate(50) );
	}

}
