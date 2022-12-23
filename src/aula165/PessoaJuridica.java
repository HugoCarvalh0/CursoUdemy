package aula165;

public class PessoaJuridica extends Contribuintes {

	private int numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calcImposto() {
		double imposto;
		if (numeroFuncionarios < 10) {

			imposto = super.getRendaAnual() * 0.16;

		} else {

			imposto = super.getRendaAnual() * 0.14;

		}
		return imposto;
	}

}
