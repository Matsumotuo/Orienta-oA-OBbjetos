public class Biblioteca {
    
    String titulo;
    String autor;
    int ano;


    Biblioteca(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    Biblioteca(){
        
    }

    void exibirInfo(){
        
        System.out.println("Título: "  + titulo);
        System.out.println("Autor: " + autor );
        System.out.println("Ano: " + ano);
        System.out.println("\n");

    }




}
