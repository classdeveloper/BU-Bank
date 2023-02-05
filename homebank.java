package bank;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class homebank {
	
	public static void main(String[] args) throws IOException {
		
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
			if (idade < 18) {
				System.out.println("Você é menor de idade, não pode continuar com o registro!");
			}
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
		
		FileWriter arq = new FileWriter("C:\\Users\\Administrator\\eclipse-workspace\\Projects\\src\\bank\\dados.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    gravarArq.println("Name: " + nome + " " + sobrenome);
	    gravarArq.println("Email: " + email);
	    gravarArq.println("Idade: " + idade);
	    gravarArq.println("CPF: " + CPF);
	    gravarArq.println("Senha: " + senha);
	    
	    gravarArq.println("-------------");
	    
	    gravarArq.println("Informações bancarias: ");
	    gravarArq.printf("Saldo: " + saldototal);
	    
	    
	    arq.close();
	    
	    System.out.printf("\nOs dados foram gravados com sucesso em \"C:\\Users\\Administrator\\eclipse-workspace\\Projects\\src\\bank\\dados.txt");
		
		entrada.close();
		
	}
	
	static Object gravarArq;
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

