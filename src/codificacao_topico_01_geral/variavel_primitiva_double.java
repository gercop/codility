package codificacao_topico_01_geral;

public class variavel_primitiva_double {

	public static void main(String[] args) {
		
		double pi1 = 3.14159265;       //accuracy up to 15 digits
	    float pi2  = 3.141f;           //accuracy up to 6-7 digits

	    System.out.println ("Pi1=" + pi1);
	    System.out.println ("Pi2=" + pi2);
	    
	    /*The default Java type which Java will be using for a float variable will be double.
		*	So, even if you declare any variable as float, what the compiler has to actually do 
		*	is to assign a double value to a float variable, which is not possible. So, to tell 
		* 	the compiler to treat this value as a float, that 'F' is used.
		* */
	}
}
