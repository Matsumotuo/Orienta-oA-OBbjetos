public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public Jogador(){

    }

    public void exibirInfo(){
        System.out.println("User: " +nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " +this.nivel);
    }
    
    public void subirNivel(){
        this.nivel++;
    }

    public void aumentarPontos(int pontos){
        if (pontos > 0) {
            this.pontuacao += pontos;

        }
    }

    public void trocarNome(String novoNome){
        this.nome = novoNome;
    }
}