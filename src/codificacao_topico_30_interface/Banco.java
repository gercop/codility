package codificacao_topico_30_interface;

public interface Banco {
	public abstract void manutencaoConta(Conta conta);
	public abstract boolean saque(Conta conta, double valor);
	public abstract boolean deposito(Conta conta, double valor);
	public abstract void extrato(Conta conta);
}
