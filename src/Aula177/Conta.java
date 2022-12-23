package Aula177;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	private double limiteSaque;

	public Conta() {

	}

	public Conta(int numero, String titular, double saldo, double saque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = saque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(double quantia) {
		this.saldo += quantia;
	}

	public void saque(double quantia) {
		if ((quantia > limiteSaque)){
			throw new DomainException("A quantia excede o limite de saque");
		}
		if((quantia > saldo)){
			throw new DomainException("A quantia excede o saldo da conta");
		}
		this.saldo -= quantia;
	}
}
