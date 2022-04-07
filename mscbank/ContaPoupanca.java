package mscbank;

public class ContaPoupanca extends Conta {
	
	private double rendimento;
	
	
	public ContaPoupanca() {
		super();
	}
	
	
	@Override
	public void sacar(double valor) {
		if (valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente."); 
		}
		else if (valor <= 0) {
			System.out.println("O valor precisa ser maior que R$0");	
		}
		else {
			this.setSaldo(getSaldo() - valor); 
		}
	}
		
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}
		else {
			System.out.println("O valor precisa ser maior que R$0");
		}
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente.");
		}
		else if (valor <= 0) {
			System.out.println("O valor precisa ser maior que R$0");
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
			contaDestino.depositar(valor);
		}
	}
	
	
	public double getRendimento() {
		return rendimento;
	}
	
	
}
