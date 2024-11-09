
import java.util.Scanner;

public class Carteira {
    public static void main(String[] args) {
        String nome = "Diego";
        String tipoConta = "Corrente";
        Double saldo = 1500.99;

        System.out.println("**************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n**************************************");

        int opcao = 0;
        String menu = """
                ** Digite a sua opção **
                
                1 - Consultar Saldo
                2 - Fazer Pix
                3 - Receber Valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                Double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso! Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja receber?");
                Double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Valor recebido com sucesso! Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("Sessão encerrada. Obrigado!");
        leitura.close();
    }
}
