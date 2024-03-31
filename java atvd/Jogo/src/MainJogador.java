import java.util.Scanner;

public class MainJogador {
    public static void main(String[] args) {
        Scanner vScanner = new Scanner(System.in);
        int opcao;

        Jogador vJogador = new Jogador("joao", 0, 1); // Criar o objeto fora do loop

        do {
            System.out.println("--Dados Jogador--");
            System.out.println("[1] Aumentar Pontuação");
            System.out.println("[2] Aumentar Nível");
            System.out.println("[3] Trocar Nome");
            System.out.println("[4] Info Jogador");
            System.out.println("[5] Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println("");

            opcao = vScanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Pontos a serem aumentados: ");
                    int pontos = vScanner.nextInt();
                    vJogador.aumentarPontos(pontos);
                    System.out.println("");
                    break;
                case 2:
                    vJogador.subirNivel();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Nome novo: ");
                    String novoNome = vScanner.next();
                    vJogador.trocarNome(novoNome);
                    System.out.println("");
                    break;
                case 4:
                    vJogador.exibirInfo();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("saindoo.........");
                    break;
                default:
                    System.out.println("Número errado, tento novamente!");
                    break;
            }
        } while (opcao != 5);

        vScanner.close();
    }
}
