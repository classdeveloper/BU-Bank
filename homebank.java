package bank;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class homebank {
	
	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner (System.in);	
		
		System.out.println("Seja bem-vindo ao BU Bank!");
		System.out.println("1) Registro");
		System.out.println("2) Login");
		Registro = entrada.nextInt();
		
		switch (Registro) {
		
		case 1: 
			
			System.out.print("Insira seu nome: ");
			Nome = entrada.next();
			System.out.print("Insira seu sobrenome: ");
			Sobrenome = entrada.next();
			System.out.print("Insira sua idade: ");
			Idade = entrada.nextInt();
			System.out.print("Insira seu e-mail: ");
			Email = entrada.next();
			System.out.print("Insira seu CPF: ");
			CPF = entrada.next();
			System.out.print("Insira sua senha: ");
			Senha = entrada.next();
			System.out.print("Insira sua senha novamente: ");
			ConfirmSenhaRegistro = entrada.next();
			
			if (!ConfirmSenhaRegistro.equals(Senha)) {
				System.out.println("As senhas não batem!");
			}
			
			else {
				System.out.println("Você foi registrado com sucesso!");
			}
			
			break;
			
		case 2:
			System.out.print("Digite seu e-mail: ");
			ConfirmEmailLogin = entrada.next();
			System.out.println("Digite seu CPF: ");
			ConfirmCPFLogin = entrada.next();
			System.out.println("Digite sua senha: ");
			ConfirmSenhaLogin = entrada.next();
			
			if (!ConfirmEmailLogin.equals(Email) && !ConfirmCPFLogin.equals(CPF)) {
				
				System.out.println("Suas credênciais estão erradas!");
				
			}
			
			else if (!ConfirmSenhaLogin.equals(Senha)) {
				
				System.out.println("Suas credênciais estão erradas!");
				
			}
			
			else {
				
				System.out.println("Você se registrou com sucesso!");
				
			}
			
			break;
			
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
	          System.out.println("\nNome: " + Nome + Sobrenome);
	          System.out.println("Idade: " + Idade);
	          System.out.println("Email: " + Email);
	          System.out.println("CPF: " + CPF);
	          System.out.println("Senha: " + Senha);
	          break;
	          
	        case 2: 
	          System.out.println("Seu saldo é: " + SaldoTotal);
	          break;
	          
	        case 3: 
	          System.out.println("Digite o valor do deposito: ");
	          Deposito = entrada.nextDouble();
	          System.out.println("Seu saldo agora é de: " + SaldoTotal);
	          break;
	          
	        case 4:
	          System.out.println("Digite o valor da transferência: ");
	          Transferencia = entrada.nextDouble();
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
	    
	    gravarArq.println("Name: " + Nome + " " + Sobrenome);
	    gravarArq.println("Email: " + Email);
	    gravarArq.println("Idade: " + Idade);
	    gravarArq.println("CPF: " + CPF);
	    gravarArq.println("Senha: " + Senha);
	    
	    gravarArq.println("-------------");
	    
	    gravarArq.println("Informações bancarias: ");
	    gravarArq.printf("Saldo: " + SaldoTotal);
	    
	    
	    arq.close();
	    
	    System.out.printf("\nOs dados foram gravados com sucesso em \"C:\\Users\\Administrator\\eclipse-workspace\\Projects\\src\\bank\\dados.txt");
		
		entrada.close();
		
	}
	
	
	static String ConfirmCPFLogin;
	static String ConfirmEmailLogin;
	static Object gravarArq;
	static String ConfirmSenhaRegistro;
	static String ConfirmSenhaLogin;
	static int Registro;
	static String Nome;
	static String CPF;
	static String Email;
	static int Idade;
	static String Senha;
	static String Sobrenome;
	static double Transferencia = 0;
	static double Deposito = 0;
	static double SaldoTotal =  Deposito;
	static double Valor = 0;
	
	}

