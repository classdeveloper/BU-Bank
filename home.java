import java.util.Scanner;

public class home {

    private static void cadastro() {

        Scanner entrada = new Scanner(System.in);
        variaveis variaveis = new variaveis();

        System.out.println("1) Registro 2) Login");
        variaveis.seletorRegistro = entrada.nextInt();

        switch (variaveis.seletorRegistro) {

            case 1:

                System.out.println("Digite seu nome: ");
                variaveis.nome = entrada.next();
                System.out.println("Digite seu sobrenome: ");
                variaveis.sobrenome = entrada.next();
                System.out.println("Digite sua idade: ");
                variaveis.idade = entrada.nextInt();
                System.out.println("Digite seu e-mail: ");
                variaveis.emailRegistro = entrada.next();
                System.out.println("Digite seu CPF: ");
                variaveis.CPFRegistro = entrada.next();
                System.out.println("Digite sua senha: ");
                variaveis.senhaRegistro = entrada.next();
                System.out.println("Digite sua senha novamente: ");
                variaveis.confirmsenhaRegistro = entrada.next();

                System.out.println("Deseja ativar sua conta? ");
                variaveis.ativarRegistro = entrada.hasNext();

                if (!variaveis.confirmsenhaRegistro.equals(variaveis.senhaRegistro)) {

                    System.out.println("As senhas não batem se cadastre novamente!");
                }

                else if (variaveis.idade < 18) {

                    System.out.println("Você não tem idade suficiente!");

                }

                else {

                    System.out.println("Você criou sua conta com sucesso!");

                }

                break;

            case 2:

                System.out.println("Digite seu e-mail: ");
                variaveis.emailLogin = entrada.next();
                System.out.println("Digite seu CPF: ");
                variaveis.CPFLogin = entrada.next();
                System.out.println("Digite sua senha: ");
                variaveis.senhaLogin = entrada.next();
                System.out.println("Digite sua senha novamente: ");
                variaveis.confirmsenhaLogin = entrada.next();

                System.out.println("Deseja entrar em sua conta? ");
                variaveis.ativarLogin = entrada.hasNext();

                if (!variaveis.emailLogin.equals(variaveis.emailRegistro) && !variaveis.CPFLogin.equals(variaveis.CPFRegistro) && !variaveis.senhaLogin.equals(variaveis.senhaRegistro)) {

                    System.out.println("Suas credênciais estão erradas!");

                }

                else {

                    System.out.println("Seja bem-vindo novamente!");

                }
                break;

        }

        entrada.close();
    }

    public static void painel() {

        variaveis variaveis = new variaveis();
        Scanner entrada = new Scanner (System.in);

        System.out.println("PAINEL: ");
        System.out.println("1) Minhas informações");
        System.out.println("2) Transferências");
        System.out.println("3) Saldo");
        System.out.println("4) Deposito");
        variaveis.seletorPainel = entrada.nextInt();

        switch (variaveis.seletorPainel) {

            case 1:

                System.out.println("Nome: " + variaveis.nome + " " + variaveis.sobrenome);
                System.out.println("Email: " + variaveis.emailRegistro);
                System.out.println("CPF: " + variaveis.CPFRegistro);
                System.out.println("Idade: " + variaveis.idade);
                break;

            case 2:

                System.out.println("Digite o CPF: ");
                variaveis.CPFTransferencias = entrada.next();
                System.out.println("Digite o valor: ");
                variaveis.valor = entrada.nextInt();
                break;

            case 3:
                System.out.println("Seu saldo total é: " + variaveis.saldoTotal);
                break;

            case 4:
                System.out.println("Digite o valor que deseja depositar: ");
                variaveis.deposito = entrada.nextDouble();

        }

    entrada.close();

    }

    public static void main(String[] args) {

        variaveis variaveis = new variaveis();

       cadastro();

       if (variaveis.ativarRegistro == true || variaveis.ativarLogin == true) {

           painel();

       }



    }
}
