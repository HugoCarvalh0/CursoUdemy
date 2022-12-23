package Aula177;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Digite os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String nome = sc.nextLine();
		System.out.print("Saldo incial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta c1 = new Conta(numero, nome, saldo, limiteSaque);
		
		System.out.print("\nDigite uma quantia para o saque: ");
		double saque = sc.nextDouble();
		c1.saque(saque);
		System.out.print("Novo saldo: ");
		System.out.println(c1.getSaldo());
		} catch (DomainException e) {
			System.out.println("Erro na operacao: " + e.getMessage());
		}
		
		sc.close();
	}
	
}
