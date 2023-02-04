package bank;

import java.util.Scanner;


public class homebank {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Seja bem-vindo ao BU BANK!");
		
		System.out.println("Para criar sua conta digite as seguintes informações:\n\n");
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.next();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.next();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu email: ");
		String email = entrada.next();
		
		System.out.print("Digite seu CPF: ");
		String CPF = entrada.next();
		
		System.out.print("Digite sua senha: ");
		String senha = entrada.next();
		
		System.out.println("Registrado com sucesso!\n");
		System.out.println("LOGUE-SE!");
		System.out.print("Email: ");
		String verificacaoemail = entrada.next();
		System.out.println("Senha: ");
		String verificacaosenha = entrada.next();
		
		entrada.close();		
		
		if (email.equals(verificacaoemail) && senha.equals(verificacaosenha)) {
			
			System.out.println("Você conseguiu se logar com sucesso!");
			
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

				
			}
		
		else {
			System.out.println("Suas credênciais de acesso estão erradas!");
		}
		
		}
		
		static double transferencia = 0;
		static double deposito = 0;
		static double saldototal = (transferencia + deposito);
		static double valor = 0;
		
		
				
				
}			

