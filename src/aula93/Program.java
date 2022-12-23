package aula93;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pessoa[] vetor = new Pessoa[10];

		System.out.println("Quantos quartos vao ser alugados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome do locador:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o email do locador:");
			String email = sc.nextLine();
			System.out.println("Digite o quarto que o locador deseja:");
			int quarto = sc.nextInt();
			vetor[quarto] = new Pessoa(nome, email);
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println("Quarto " + (i) + ":\n" + vetor[i] + "\n");
			}
			sc.close();
		}
	}
}
