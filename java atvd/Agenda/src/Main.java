import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContatos agenda = new AgendaContatos();

        while (true) {
            System.out.println("\n===== Agenda de Contatos =====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email do contato: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, email, telefone));
                    break;
                case 2:
                    System.out.print("Nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite um termo para buscar: ");
                    String termoBusca = scanner.nextLine();
                    agenda.buscarContato(termoBusca);
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
