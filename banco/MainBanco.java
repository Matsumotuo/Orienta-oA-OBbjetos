import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria(123456, "Pedrinho");
        
        int opcao;
        do {
        System.out.println("\nB A N C O\n");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: \n");
                    float valorDeposito = leitor.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: \n");
                    float valorSaque = leitor.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Saindo do Sistema Bancário. Obrigado!");
                    break;
                default:
                    System.out.println("Saindo... Vou sentir Saudade...");
            }
        } while (opcao != 0);
    }
}
