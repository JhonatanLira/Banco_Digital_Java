package classes;

public class Main {

	public static void main(String[] args) {
		/*
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		*/
		
		boolean documentacaoOk = false;
		int score= 600;
		
		Cliente cliente = new Cliente();
		cliente.setDataNascimento("24/02/2005");
		
		Conta conta = new ContaPoupanca(cliente);
		
		conta.aberturaConta(cliente, documentacaoOk, score );
		
		
		
	}

}