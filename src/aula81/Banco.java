package aula81;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta conta1;
		
		System.out.println("Digite o numero da conta:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular");
		String nome = sc.nextLine();
		System.out.println("Deseja fazer um deposito? (s/n)");
		char resposta= sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Digite um depósito incial:");
			double valor = sc.nextDouble();	
			conta1 = new Conta(numero,nome,valor);
		}else {
			conta1 = new Conta(numero, nome);
		}
		
		System.out.println("\nDados da conta:\n" + conta1);
		
		System.out.println("Digite um valor de deposito:");
		double valorDeposito = sc.nextDouble();
		conta1.deposito(valorDeposito);

		System.out.println("\nDados da conta atualizados:\n" + conta1);
		
		System.out.println("\nDigite um valor para sacar:");
		double valorSaque = sc.nextDouble();
		conta1.saque(valorSaque);

		System.out.println("\nDados da conta atualizados:\n" + conta1);
		
		sc.close();
	}

}
