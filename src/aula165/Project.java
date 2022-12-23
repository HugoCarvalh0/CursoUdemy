package aula165;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Contribuintes> lista = new ArrayList<>();

		System.out.print("Digite o numero de contribuintes:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Pessoa Fisica ou Juridica? (F/J): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'F') {

				System.out.print("Gastos com saude: ");
				double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));

			} else {

				System.out.println("Numero de funcionarios: ");
				int nf = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, nf));

			}
			
		}
		System.out.println();
		System.out.println("Taxas de imposto: ");
		double totalTaxas=0;
		
		for(Contribuintes contr : lista) {
			
			System.out.println(contr.getNome() + ": " + contr.calcImposto());
			totalTaxas += contr.calcImposto();
		}
		System.out.println();
		System.out.println("Total: " + totalTaxas);
		
		sc.close();
	}

}
