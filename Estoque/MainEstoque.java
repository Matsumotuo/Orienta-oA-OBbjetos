import java.util.Scanner;

public class MainEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoEstoque gerenciador = new GerenciamentoEstoque();

        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Preço do produto: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarProduto(new Produto(nome, codigo, preco, quantidade));
                    break;
                case 2:
                    System.out.print("Digite o código do produto a ser atualizado: ");
                    int codigoAtualizar = scanner.nextInt();
                    System.out.print("Novo preço do produto: ");
                    float novoPreco = scanner.nextFloat();
                    System.out.print("Quantidade a ser adicionada ao estoque: ");
                    int novaQuantidade = scanner.nextInt();
                    gerenciador.atualizarProduto(codigoAtualizar, novoPreco, novaQuantidade);
                    break;
                case 3:
                    System.out.print("Digite o código do produto a ser removido: ");
                    int codigoRemover = scanner.nextInt();
                    gerenciador.removerProduto(codigoRemover);
                    break;
                case 4:
                    gerenciador.gerarRelatorio();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
