package model.entities;

public class PessoaFisica extends Pessoa{
	

	private double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double taxa() {
		double valor = 0;
		if(this.rendaAnual < 20000.00) {
			valor = (this.rendaAnual * 0.25) - (this.gastoSaude*0.5);
		} else {
			valor = (this.rendaAnual * 0.25) - (this.gastoSaude*0.5);
		}
		return valor;
	}
}
