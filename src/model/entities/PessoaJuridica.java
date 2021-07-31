package model.entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double taxa() {
		double valor = 0;
		if(this.numFuncionarios > 10) {
			valor = this.rendaAnual * 0.14;
		} else {
			valor = this.rendaAnual * 0.16;
		}
		return valor;
	}
	
}
