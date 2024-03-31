import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

    
        Pizza pizza1 = new Pizza("Calabresa", 30.0f, "Molho de tomate, mussarela, calabresa, cebola e azeitonas");
        Pizza pizza2 = new Pizza("Mussarela", 25.0f, "Molho de tomate, mussarela e orégano");
        Pizza pizza3 = new Pizza("Portuguesa", 35.0f, "Molho de tomate, mussarela, presunto, ovos, cebola, azeitonas e orégano");

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar Pizza ao Pedido");
            System.out.println("2. Cancelar Pedido");
            System.out.println("3. Finalizar Pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n===== Escolha uma Pizza =====");
                    System.out.println("1. Calabresa - R$30.00");
                    System.out.println("2. Mussarela - R$25.00");
                    System.out.println("3. Portuguesa - R$35.00");
                    System.out.print("Escolha uma pizza (1/2/3): ");
                    int escolhaPizza = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (escolhaPizza) {
                        case 1:
                            pedido.adicionarPizza(pizza1);
                            System.out.println("Pizza Calabresa adicionada ao pedido.");
                            break;
                        case 2:
                            pedido.adicionarPizza(pizza2);
                            System.out.println("Pizza Mussarela adicionada ao pedido.");
                            break;
                        case 3:
                            pedido.adicionarPizza(pizza3);
                            System.out.println("Pizza Portuguesa adicionada ao pedido.");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    pedido.cancelarPedido();
                    System.out.println("Pedido cancelado com sucesso.");
                    break;
                case 3:
                    System.out.print("Digite o endereço de entrega: ");
                    String endereco = scanner.nextLine();
                    pedido.setEnderecoEntrega(endereco);
                    System.out.println("Pedido finalizado. Valor total: R$" + pedido.getValorTotal());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
