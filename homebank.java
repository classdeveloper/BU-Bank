package bank;

import java.util.Scanner;

public class homebank {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);		 
		
		System.out.println("Seja bem vindo ao BU BANK!");
		System.out.println("Deseja se registrar? (S/N)");
		registro = entrada.next();
		
		if (registro.equals("S")) {
			System.out.print("Insira seu nome: ");
			nome = entrada.next();
			System.out.print("Insira seu sobrenome: ");
			sobrenome = entrada.next();
			System.out.print("Insira sua idade: ");
			idade = entrada.nextInt();
			System.out.print("Insira seu e-mail: ");
			email = entrada.next();
			System.out.print("Insira seu CPF: ");
			CPF = entrada.next();
			System.out.print("Insira sua senha: ");
			senha = entrada.next();
			System.out.print("Insira sua senha novamente: ");
			confirmsenha = entrada.next();
			
			if (!confirmsenha.equals(senha)) {
				System.out.println("As senhas não batem!");
			}
			
			else {
				System.out.println("Você foi registrado com sucesso!");
			}
			
		}
		
		else if (registro.equals("N")) {
			System.out.println("Até mais!");
		}
		
		while(true){
	        System.out.println("\n\nPAINEL DO BU BANK!");
	        System.out.println("Seja muito bem vindo!\n");
	        
	        System.out.println("1) Minhas informações: ");
	        System.out.println("2) Meu saldo: ");
	        System.out.println("3) Depositar: ");
	        System.out.println("4) Transferencias: ");
	        int op = entrada.nextInt();
	        
	        switch (op) {
	        
	        case 1: 
	          System.out.println("\nNome: " + nome + sobrenome);
	          System.out.println("Idade: " + idade);
	          System.out.println("Email: " + email);
	          System.out.println("CPF: " + CPF);
	          System.out.println("Senha: " + senha);
	          break;
	          
	        case 2: 
	          System.out.println("Seu saldo é: " + saldototal);
	          break;
	          
	        case 3: 
	          System.out.println("Digite o valor do deposito: ");
	          deposito = entrada.nextDouble();
	          System.out.println("Seu saldo agora é de: " + saldototal);
	          break;
	          
	        case 4:
	          System.out.println("Digite o valor da transferência: ");
	          transferencia = entrada.nextDouble();
	          break;
	          
	        }

	        String quer_sair = "";
	        while(!quer_sair.equals("n") && !quer_sair.equals("y")){
	          System.out.println("Quer sair? y/n");
	          quer_sair = entrada.next();
	        }

	        if  (quer_sair.equals("y")){
	          break;
	        }
	    }
		
		entrada.close();
		
	}
	
	static String confirmsenha;
	static String registro;
	static String nome;
	static String CPF;
	static int idade;
	static String email;
	static String senha;
	static String sobrenome;
	static double transferencia = 0;
	static double deposito = 0;
	static double saldototal =  deposito;
	static double valor = 0;
	
	}

