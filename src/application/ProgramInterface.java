package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class ProgramInterface {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, data, totalValue);
		
		System.out.print("Enter number of installments: ");
		int months = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, months);
		

		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		sc.close();
	}

}
