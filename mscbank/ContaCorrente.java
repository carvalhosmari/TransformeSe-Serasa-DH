package mscbank;

public class ContaCorrente extends Conta {
	
	private double limite;
		
	
	public ContaCorrente() {
		super();
		this.setLimite(500);
	}
	
	
	@Override
	public void sacar(double valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso!");
		}
		else if (valor > this.getSaldo() && valor <= this.getSaldo() + this.getLimite()) {
			this.setLimite(this.getLimite() + (this.getSaldo() - valor));
			this.setSaldo(0);
			System.out.println("Saque efetuado com utiliza��o do cheque especial.");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			contaDestino.depositar(valor);
			System.out.println("Transfer�ncia efetuada com sucesso!");
		}
		else if (valor > this.getSaldo() && valor <= this.getSaldo() + this.getLimite()) {
			this.setLimite(this.getLimite() + (this.getSaldo() - valor));
			this.setSaldo(0);
			contaDestino.depositar(valor);
			System.out.println("Transfer�ncia efetuada com utiliza��o do cheque especial.");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
