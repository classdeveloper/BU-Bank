package bank;

import java.util.Scanner;


public class homebank {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
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
	
	static String nome;
	static String CPF;
	static int idade;
	static String email;
	static String senha;
	static String sobrenome;
	static double transferencia = 0;
	static double deposito = 0;
	static double saldototal = (transferencia + deposito);
	static double valor = 0;
	
	}

