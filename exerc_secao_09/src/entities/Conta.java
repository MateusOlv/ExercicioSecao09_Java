package entities;

public class Conta {
	private int num_conta;
	private String nome;
	private double saldo;
	
	public Conta(int num_conta, String nome, double depositoInicial) {
		this.num_conta = num_conta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public Conta(int num_conta, String nome) {
		this.num_conta = num_conta;
		this.nome = nome;
	}
	
	public int getNumConta() {
		return num_conta;
	}
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.saldo -= valorSaque + 5.0; 
	}
	
	public String toString() {
		return "Conta "
				+ num_conta
				+ ", Titular: "
				+ nome
				+ ", Saldo: $ "
				+ saldo;
	}

}
