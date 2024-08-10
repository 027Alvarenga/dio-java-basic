package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws parametrosInvalidosException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int n2 = sc.nextInt();
		
		try {
			contar(n1,n2);
		}
		catch(parametrosInvalidosException Exception) {
			System.out.println("O segundo número deve ser maior que o primeiro números");
		}
		sc.close();
	}
	
	static void contar(int n1, int n2) throws parametrosInvalidosException {
		if(n1 > n2){
			throw new parametrosInvalidosException();
		}
		
		int contagem = n2 - n1;
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}
}
