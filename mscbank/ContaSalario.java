package mscbank;

public class ContaSalario extends Conta {
	
	private double tarifa;
	
	
	public ContaSalario() {
		super();
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
			System.out.println("Transferência efetuada com sucesso!");
		}
	}
		
	
	public double getTarifa() {
		return tarifa;
	}
	

}
