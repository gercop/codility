package codificacao_topico_10_classes;

public class MagicPower {
	
	void castSpell() {
		
		System.out.println("Please, choose a spell!");
	}
	
	void castSpell(String spell) {
		
		System.out.println(spell);
	}
	
	static void castStaticSpell(String spell) {
		
		System.out.println(spell);
	}

	public static void main(String[] args) {
		
		new MagicPower().castSpell("Expecto Patronum!");
		
		MagicPower magicPower = new MagicPower(); 
		magicPower.castSpell();
		
		MagicPower.castStaticSpell("Expelliarmus!");
		
		new MagicPower().castSpell();
	}	
	

}
