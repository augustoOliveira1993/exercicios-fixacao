package entities;

public abstract class Pessoa {
	
	protected String nome;
	protected double rendaAnual;

	public Pessoa() {
		
	}

	public Pessoa(String nome, double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double taxa();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
}
