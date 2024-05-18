package edu.diosantander.contaBanco;

import java.util.*;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		String NomeCliente;
		int Agencia;
		int Numero;
		float Saldo;
		
		
		System.out.print("Olá, Aqui é o assistente virtual do Banco Dio \nPor favor, digite o seu nome para podermos começar o seu cadatro! \nNome:");
		NomeCliente = scanner.nextLine();
		
		System.out.print("Perfeito! Agora digite o numero da sua agencia \nAgencia:");
		Agencia = scanner.nextInt();
		
		System.out.print("Òtimo! Quase acabando, pode me informar o numero da sua conta agora? \nNumero da conta:");
		Numero = scanner.nextInt();
		
		System.out.print("Excelente, agora para finalizar me informe o seu saldo por favor \nSaldo:");
		Saldo = scanner.nextFloat();
		
		
		
		
		System.out.print("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", \nconta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
		
	}
	
}
