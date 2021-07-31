package model.entities;

import model.exceptions.AccountException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balanca;
	private Double withdrawLimit;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer number, String holder, Double balanca, Double withdrawLimit) {
		if(balanca < 0) {
			throw new AccountException("Erro Contrutor: " + balanca + " saldo inicial negativo!");
		}
		if(withdrawLimit < 0) {
			throw new AccountException("Erro Contrutor: " + withdrawLimit + " saque negativo!");
		}
		this.number = number;
		this.holder = holder;
		this.balanca = balanca;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalanca() {
		return balanca;
	}

	public void setBalanca(Double balanca) {
		this.balanca = balanca;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		if(amount < 0) {
			throw new AccountException("Error deposito: Valor a depositar negativo!");
		}
		this.balanca += amount;
	}
	
	public void withdraw(Double amount) {
		if(amount > this.withdrawLimit) {
			throw new AccountException("Error de saque: A qunatidade excede o limite de saque");
		}
		if(amount > this.balanca) {
			throw new AccountException("Error de saque: Saldo insuficiente");
		}
		this.balanca -= amount;
	}
}
