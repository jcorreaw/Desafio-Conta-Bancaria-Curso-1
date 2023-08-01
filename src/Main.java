import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Clark Kent";
        String accountType = "Corrente";
        double balance = 1599.99;
        int option = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo conta: " + accountType);
        System.out.println("Saldo atual: " + balance);
        System.out.println("\n***********************");

        while (option != 4) {
            System.out.println(menu);
            option = sc.nextInt();

            if (option == 1){
                System.out.println("O saldo atualizado é " + balance);
            } else if (option == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double value = sc.nextDouble();
                if (value > balance) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    balance -= value;
                    System.out.println("Novo saldo: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: ");
                double value = sc.nextDouble();
                balance += value;
                System.out.println("Novo saldo: " + balance);
            } else if (option != 4) {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();

    }
}