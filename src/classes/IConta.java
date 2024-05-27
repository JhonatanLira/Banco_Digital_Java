package classes;

public interface IConta {
	
	void aberturaConta(Cliente cliente, boolean documentacaoOk, int score);
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}