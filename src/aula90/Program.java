package aula90;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas vao ser digitadas?");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[n];

		for (int i = 0; i < vet.length; i++) {

			System.out.println("Digite os dados da primeira pessoa:");
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Idade:");
			int idade = sc.nextInt();
			System.out.println("Altura:");
			double altura = sc.nextDouble();
			vet[i] = new Pessoa(nome, idade, altura);
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dados pessoa " + (i+1));
			System.out.println(vet[i]);
		}
		sc.close();
	}
}
