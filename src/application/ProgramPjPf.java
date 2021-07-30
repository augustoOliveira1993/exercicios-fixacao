package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ProgramPjPf {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i <=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}else if(type == 'c') {
				System.out.print("Number of employees: ");
				int numFunc = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numFunc));
			}else {
				System.out.println("Error opção invalida!");
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Pessoa p : lista) {
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.taxa()));
		}
		
		
		double sum = 0;
		for(Pessoa p : lista) {
			sum += p.taxa();
		}
		System.out.println();
		System.out.println(String.format("TOTAL TAXES: $ %.2f", sum));
		sc.close();
	}

}
