package aula103;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Linhas:");
		int m = sc.nextInt();
		System.out.println("Colunas:");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite um numero para ver as ocorrencias");
		int numOc = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numOc) {
					System.out.println("\nPosicao: " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if (i < mat[i].length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
