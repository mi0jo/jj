public class ContaBancaria{
	private String nomeTitular;
	private String numConta;
	private double saldo;
	
	public ContaBancaria(String nomeTitular, String numConta){
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
		this.saldo = 50.0;
	}
	
	public String getNomeTitular(){
	 return nomeTitular;
	}
	public String getNumConta(){
	  return numConta;
	}
    public double getSaldo(){
	   return saldo;
    }

	public void sacar (double valor){
		if(valor > 0 && valor <=saldo){
			saldo -= valor;
			System.out.println("Saque de R$" + valor +  " realizado com sucesso!");
		} else {
			System.out.println("Saque inválido. Seu saldo não é insuficiente.");
		  }
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
		} else {
			System.out.println("Seu valor de depósito é inválido.");
		  }
	}
	
	public void impExtrato(){
		System.out.println("Nome do Titular: " + nomeTitular);
		System.out.println("Número da Conta: " + numConta);
		System.out.println("Saldo: R$ " + saldo);
	}
	
	public static void main (String [] args) {
		ContaBancaria minhaConta =  new ContaBancaria("Rafaela", "10456020");
		minhaConta.sacar(50.0);
		minhaConta.depositar(2000.0);
		minhaConta.impExtrato();
		
	}

}
