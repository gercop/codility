package codificacao_topico_30_interface;

public class interface_V02 {

	public static void main(String[] args) {

		/*
		 * Refer�ncia: http://www.universidadejava.com.br/java/java-interface/
		 */
		Banco bancoBradesco = new BancoBradesco();
	    Conta contaC = new Conta();
	    contaC.setNomeProprietario("Cristiano Camilo");
	    contaC.setNumero(1);
	    contaC.setSaldo(1000);

	    bancoBradesco.deposito(contaC, 150.50);
	    bancoBradesco.saque(contaC, 500);
	    bancoBradesco.extrato(contaC);

	    Banco bancoSakurai = new BancoBrasil();
	    Conta contaS = new Conta();
	    contaS.setNomeProprietario("Rafael Sakurai");
	    contaS.setNumero(1);
	    contaS.setSaldo(500);

	    bancoSakurai.deposito(contaS, 40.99);
	    bancoSakurai.saque(contaS, 300);
	    bancoSakurai.extrato(contaS);
	    
	    /*  Ter-se-� um erro de compila��o, pois a interface Banco n�o tem a assinatura para o  
	    	m�todo transferencia(Conta contaOrigem, Conta contaDestino, double valor), 
	    	este m�todo � disponibilizado atrav�s da classe BancoSakurai, ent�o para us�-lo 
	    	precisaremos de uma vari�vel do tipo BancoSakurai
	    */
	    //bancoSakurai.transferencia(contaS, contaC, 1000.00);
	}

}
