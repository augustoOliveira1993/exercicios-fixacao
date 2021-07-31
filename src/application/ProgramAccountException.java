package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class ProgramAccountException {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre dados da conta");
			System.out.print("Numero: ");
			int number = sc.nextInt();
			System.out.print("Titular: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double initBalance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Entre com valor de saque: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.println("Novo saldo:: " + String.format("%.2f", acc.getBalanca()));
			
		}
		catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Error inesperado!");
		}
		finally {
			sc.close();
		}

	}

}
