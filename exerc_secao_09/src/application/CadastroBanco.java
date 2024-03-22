package application;

import java.util.Scanner;

import entities.Conta;

public class CadastroBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Informe o número da conta:");
		int num_conta = sc.nextInt();
		
		System.out.println("Informe o nome do titular da conta:");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Deseja fazer um depósito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.println("Digite o valor do depósito inicial:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(num_conta, nome, depositoInicial);
		} else {
			conta = new Conta(num_conta, nome);
		}
		
		System.out.println();
		System.out.println("Informações da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println();
		System.out.println("Informações atualizadas da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
	
		System.out.println();
		System.out.println("Informações atualizadas da conta:");
		System.out.println(conta);
		
		sc.close();
	}

}
