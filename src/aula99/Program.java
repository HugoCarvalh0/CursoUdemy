package aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios vao ser registrados?");
		int n = sc.nextInt();

		List<Funcionario> lista = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("Funcionario " + (i + 1) + ":\nDigite o id:");
			int id = sc.nextInt();

			Funcionario filter = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (filter == null) {
			} else {
				System.out.println("O id ja existe!");
				System.exit(0);
			}

			System.out.println("Digite o nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o salario:");
			double salario = sc.nextDouble();

			lista.add(new Funcionario(id, nome, salario));

		}
		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionario " + (i + 1) + lista.get(i));
		}

		System.out.println("\n-----------------------------------------");

		System.out.println("\nDigite um id para receber um aumento:");
		int id = sc.nextInt();
		Funcionario filter = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (filter == null) {
			System.out.println("O id nao exite!");
			System.exit(0);
		} else {
			int index = lista.indexOf(filter);
			System.out.println("Digite a porcentagem do aumento:");
			double porcentagem = sc.nextDouble();
			double valor = porcentagem / 100 + 1;
			lista.get(index).setSalario(lista.get(index).getSalario() * valor);
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\nFuncionario " + (i + 1));
			System.out.println(lista.get(i));
		}
		sc.close();
	}

}
