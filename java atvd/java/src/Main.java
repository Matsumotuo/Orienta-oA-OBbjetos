import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){   
        Scanner scanner = new Scanner(System.in);
        List<Aluno> turma = new ArrayList<Aluno>();

        System.out.print("Quantos alunos deseja pesquisar? ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();


        for(int i = 0; i <tamanho; i++){
            Aluno aluno = new Aluno();

            System.out.print("Matricula: ");
            aluno.matricula = scanner.nextLine();


            System.out.print("Nome: ");
            aluno.nome = scanner.nextLine();
                     
            System.out.print("Quantas notas deseja adicionar:" );
            int qtdnotas = Integer.parseInt(scanner.nextLine());
            
            System.out.print("\n~~~Notas~~\n");
            for(int j = 0; j < qtdnotas; j++){
                System.out.print("Notas ("+(j+1)+"): ");
                float notaDigitada = Float.parseFloat(scanner.nextLine());
                aluno.notas.add(notaDigitada);
                
                //Aluno alunoAtual = turma.get(j);//alunosAtual serve para armazenamento // alunos.get(j) para buscar na lista alunos as infos
                //alunoAtual.calcularMedia(true);
            }
            aluno.mostrar();
            turma.add(aluno);
        }
      
    }
}
