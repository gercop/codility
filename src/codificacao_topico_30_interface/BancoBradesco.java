package codificacao_topico_30_interface;

public class BancoBradesco implements Banco{
	private Conta contaBancoCristiano;

	  public BancoBradesco() {
	    this.contaBancoCristiano = new Conta();
	    this.contaBancoCristiano.setNomeProprietario("Banco Cristiano");
	    this.contaBancoCristiano.setNumero(0);
	    this.contaBancoCristiano.setSaldo(0d);
	  }

	  public void manutencaoConta(Conta conta) {
	    //Sempre executa o saque na conta bancaria.
	    double novoSaldo = conta.getSaldo() - 0.01;
	    conta.setSaldo(novoSaldo);

	    //Deposita o dinheiro da manuten��o na conta do Banco Cristiano.
	    double saldoBanco = this.contaBancoCristiano.getSaldo() + 0.01;
	    this.contaBancoCristiano.setSaldo(saldoBanco);
	  }

	  public boolean saque(Conta conta, double valor) {
	    //Verifica se tem saldo suficiente para fazer o saque
	    if(conta.getSaldo() >= valor) {
	      //Realiza o saque na conta.
	      double novoValor = conta.getSaldo() - valor;
	      conta.setSaldo( novoValor );
	      System.out.println("Saque efetuado!!!");

	      //Toda vez que fizer um saque faz cobra a manuten��o da conta.
	      manutencaoConta(conta);
	      return true;
	    } else {
	      System.out.println("N�o conseguiu fazer o saque!!!");
	      //Se n�o conseguir fazer o saque, mostra o extrato da conta.
	      extrato(conta);
	      return false;
	    }
	  }

	  public boolean deposito(Conta conta, double valor) {
	    //Realiza o deposito na conta.
	    double novoValor = conta.getSaldo() + valor;
	    conta.setSaldo(novoValor);
	    System.out.println("Deposito efetuado!!!");

	    //Toda vez que fizer um deposito faz cobra a manuten��o da conta.
	    manutencaoConta(conta);

	    return true;
	  }

	  public void extrato(Conta conta) {
	    System.out.println("\n -- BANCO BRADESCO -- \n");
	    System.out.println("-> EXTRATO CONTA\n");
	    System.out.println("Nome: " + conta.getNomeProprietario());
	    System.out.println("Numero: " + conta.getNumero());
	    System.out.println("Saldo: " + conta.getSaldo());
	    System.out.println("\n---------------------\n");
	  }
}
