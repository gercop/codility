package codificacao_topico_20_heranca;

class Base {
	
	protected String message;
	protected String identification;

	/* About constructors:
	 * A class can have multiple constructors with a different parameter list.
	 * You can call another constructor with this or super.
	 * A constructor does not define a return value.
	 */
	public Base() {		
		this.identification = "Program";
		this.message = "What message do you wanna send?";
	}
	
	public Base(String identification, String message) {
		this.identification = identification;
		this.message = message;		
	}
			
	Object message(){		
		return this.message;
	}

	/*Overloading*/	
	Object message(String message){		
		return message;
	}
	
	String warning() {		
 		return "The best of both worlds.";
 	}
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
	private String printPerson() {
		if (identification != null)
			return identification + ": ";
		else
			return "Program: ";
	}
	
	public void println() {
		System.out.println();
	};	
	
	/*Overloading*/
	public void print() {
		System.out.println( printPerson() + message );		
	};
	
	/*Overloading*/
	public void print(String message) {
		System.out.println( printPerson() + message );
	};	
}

class Derivada extends Base {
	
	public Derivada() {		
		super();
	}
	
	public Derivada(String identification, String message) {		
		super(identification, message);
	}	
	
	@Override
 	String warning() {		
 		return "Hang in there! (Don't give up).";
 	}
}

public class heranca_classe_V2 {
	
	public static void main(String[] args) {
	
		Base program = new Base();		
		program.print();		
		program.println();		
		
		Base person1 = new Base("Person 1","Hello World!");
		person1.print();	
		person1.println();
		
		Base person2 = new Base("Person 2","Let's agree to disagree!");
		person2.print();
		person1.print("Cut somebody some slack! (Don't be so critical) ");				
		person2.print("No pain, no gain!");				
		person1.print("It's not rocket science! (It's not complicated)");	
		person1.println();		
		
		Derivada person3 = new Derivada("Person 3","Make a long story short (Tell something briefly).");
		person3.print();
		System.out.println("Person 3: " + person3.warning());
		person1.print("Pull yourself together! (Calm down)");
		person3.print("Every cloud has a silver lining. (Good things come after bad things) ");
		person1.println();
		
		program.print("Referência: https://www.ef.com/wwen/english-resources/english-idioms/");
	}
}
