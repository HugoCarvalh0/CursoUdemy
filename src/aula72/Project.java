package aula72;

import java.util.Locale;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor do dollar:");
		double dollar = sc.nextDouble();
		System.out.println("Digite o valor de dollares a ser comprado:");
		double reais = sc.nextDouble();
		
		double res = CurrencyConverter.calculos(dollar,reais);
		System.out.println("O valor em reais sera: " + res);
		
		sc.close();
	
	}

}
