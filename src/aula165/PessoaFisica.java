package aula165;

public class PessoaFisica extends Contribuintes {

	private double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcImposto() {
		double imposto;
		if (super.getRendaAnual() < 20000) {

			imposto = super.getRendaAnual() * 0.15 - getGastosSaude() / 2;

		} else {

			imposto = super.getRendaAnual() * 0.25 - getGastosSaude() / 2;

		}

		return imposto;

	}

}
