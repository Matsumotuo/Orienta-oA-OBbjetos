import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Livraria {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        List<Biblioteca> livraria = new ArrayList<>();


        int opcao = 0;
        while (opcao != 3) {
            Biblioteca livro = new Biblioteca();
            System.out.println("-- Meus Livros --");
            System.out.println("[1]Registrar Livro");
            System.out.println("[2]Mostrar livros");
            System.out.println("[3]Sair");
            opcao = Integer.parseInt(leitorScanner.nextLine());
            
            
            switch (opcao) {
                case 1:
                System.out.print("Novo titulo: ");
                livro.titulo = leitorScanner.nextLine();
                System.out.print("Novo Autor: ");
                livro.autor = leitorScanner.nextLine();
                System.out.print("Novo Ano: ");
                livro.ano = Integer.parseInt(leitorScanner.nextLine());
                Biblioteca novoLivro = new Biblioteca(livro.titulo,livro.autor,livro.ano);
                livraria.add(novoLivro);
                break;
                case 2:
                for(int i = 0; i < livraria.size(); i++){
                    System.out.println("Livro("+(i+1)+") ");
                            livraria.get(i).exibirInfo();
                         }
                    break;
                default:
                System.out.println(">>>>>>Saindo");
                opcao = 3;
                    break;
            }
        }
       


    }
}
