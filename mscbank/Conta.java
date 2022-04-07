package mscbank;

public class Conta {

	private int agencia;
	private int numeroConta;
	private double saldo;
	private Pessoa titular;
	
	
	public Conta() {
		super();
	}
	
	public Conta(int agencia, int numeroConta, double saldo, Pessoa titular) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//Métodos
	public void depositar(double valor) {
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}
		else {
			System.out.println("O valor precisa ser maior que R$0");
		}
	}
	
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
		
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
	
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
}
