package bank;

import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		
		boolean retornar = false;
		
		do {
		
		Scanner entrada = new Scanner (System.in);
			
		System.out.println("1) Register");
		System.out.println("2) Login");
		System.out.print("Selecionar: ");
		int controlador = entrada.nextInt();
		
		switch (controlador) {
		
		case 1:
			
			System.out.println("Seja bem-vindo a página de registro!");
			
			System.out.print("Digite seu nome: ");
			variables.name = entrada.next();
			System.out.print("Digite seu sobrenome: ");
			variables.sobrenome = entrada.next();
			System.out.print("Digite seu e-mail: ");
			variables.email = entrada.next();
			System.out.print("Digite seu CPF: ");
			variables.CPF = entrada.next();
			System.out.print("Digite sua senha: ");
			variables.senha = entrada.next();
			System.out.print("Digite sua senha novamente: ");
			variables.repsenha = entrada.next();
			
			break;
			
		case 2:
			
			System.out.println("Seja bem-vindo novamente a página de login!");
			
			System.out.print("Digite seu e-mail ou CPF: ");
			variables.name = entrada.next();
			
			System.out.print("Digite sua senha: ");
			variables.senha = entrada.next();
			
			System.out.print("Digite sua senha novamente: ");
			variables.repsenha = entrada.next();
			
			if (variables.senha.equals(variables.repsenha)) {
				
				System.out.print("Seja bem-vindo novamente!");
			}
			
			else {
				
				System.out.println("Suas credenciais estão erradas!");
			}
			break;
		}
		
		
		System.out.println("\nPAINEL DE INFORMAÇÕES");
		
		System.out.println("1) Dados");
		System.out.println("2) Saldo");
		System.out.println("3) Depositar");
		int controlador2 = entrada.nextInt();
		
		switch (controlador2) {
		
		case 1: 
			
			System.out.println("Nome completo: " + variables.name + " " + variables.sobrenome);
			System.out.println("Email: " + variables.email);
			System.out.println("CPF: " + variables.CPF);
			
			retornar = true;
			
			break; 
			
		case 2:
			
			System.out.println("Seu saldo atual é: " + variables.saldo);
			
			retornar = true;
			
			break;
			
		case 3: 
			
			System.out.println("PAINEL DEPOSITO");
			
			System.out.println("1) PIX");
			System.out.println("2) Boleto");
			System.out.print("Seletor: ");
			int controlador3 = entrada.nextInt();
			
			
			switch (controlador3) {
			
			case 1: 
				
				System.out.print("Insira um CPF: ");
				variables.PIX = entrada.next();
				
				System.out.println("Insira o valor da transferencia: ");
				variables.transferencia = entrada.next();
				
				System.out.println("Deseja mesmo realizar essa transferencia? ");
				variables.confirmacaoPIX = entrada.next();
				
				if (variables.confirmacaoPIX.equalsIgnoreCase("sim")) {
					
					System.out.println("Transferencia realizada com sucesso!");
					
					
				}
				
				else {
					
					System.out.println("Deseja voltar para página inicial? ");
					variables.retornar = entrada.next();
					
					if (variables.retornar.equalsIgnoreCase("sim")) {
					
					retornar = true;
					
					}
					
					if (variables.retornar.contentEquals("não")) {
						
						retornar = false;
							
					}
					}
				
				break;
				
			case 2:
				
				System.out.println("Insira o código: ");
				variables.boleto = entrada.next();
				
				System.out.println("Deseja mesmo realizar essa transferencia? ");
				variables.confirmacaoBOLETO = entrada.next();
				
				if (variables.confirmacaoBOLETO.equalsIgnoreCase("Sim")) {
					
					System.out.println("Transferencia realizada com sucesso!");
					
					retornar = true;
					
				}
				
				
				break; 
			}
		}
		
	}while (retornar);
		
		
	}
	
	}
	
