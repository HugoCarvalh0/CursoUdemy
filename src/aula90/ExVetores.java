package aula90;

import java.util.Scanner;

public class ExVetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros vc vai digitar?");
		int n = sc.nextInt();
		int[] vet = new int[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um numero:");
			vet[i] = sc.nextInt();
		}
		System.out.println("Os numeros negativos foram:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		sc.close();
	}
}
