package aula81;

public class Conta {

	private int nConta;
	public String titular;
	public double saldo;

	public Conta(int conta, String titular) {
		this.nConta = conta;
		this.titular = titular;
	}

	public Conta(int conta, String titular, double depositoInicial) {
		this.nConta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		this.saldo += quantia;
	}

	public void saque(double quantia) {
		this.saldo -= quantia + 5.0 ;
	}
	
	public String toString() {
		return "conta: "
				+ nConta
				+", Titular: "
				+ titular
				+", Saldo: "
				+ saldo;
	}

}
