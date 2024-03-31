import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    String matricula;
    String nome;
    
    //float[] notas = new float[5];
    List<Float> notas = new ArrayList<>();

    //float nota1;
    //float nota2;

    float media;
    boolean aprovado;
    //float media = (nota1 + nota2)/2;
    
    //O construtor é normalmente utilizado para fornecer valores iniciais para variáveis de instâncias definidas pela classe 
    //ou uma forma de inicialização
    //de um objeto já formado, ou seja, um construtor inicializa um objeto.


    Aluno(){
        System.out.println("~~ Aluno vazio sendo adicionado ~~");
    }

    Aluno(String nome){
        this.nome = nome;
    }

    Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    //metodo
    void mostrar(){
        System.out.println("\n--- Resultados");
        System.out.println("Matricula: "+ matricula);
        System.out.println("Aluno: "+ nome);

        for(int i =0; i< notas.size(); i++){
            System.out.println("--- Notas ("+(i+1)+"): "+ notas.get(i));
        }
        
        calcularMedia();;
        System.out.print("Média do aluno: "+media);

        if (media >= 6) {
            System.out.println("\n--- Aluno foi aprovado\n");
        }else{
            System.out.println("\n--- Aluno foi Reprovado\n");
        }

    }

    void calcularMedia(){
       
        float somaNota = 0;

        for(int i =0; i< notas.size(); i++){
            somaNota += notas.get(i);
        }

        media = somaNota /notas.size();

    }
}
