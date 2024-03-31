import java.util.ArrayList;

public class GerenciamentoEstoque {
    private ArrayList<Produto> estoque;

    public GerenciamentoEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void atualizarProduto(int codigo, float novoPreco, int novaQuantidade) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produto.setPreco(novoPreco);
                produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + novaQuantidade);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void removerProduto(int codigo) {
        estoque.removeIf(produto -> produto.getCodigo() == codigo);
        System.out.println("Produto removido com sucesso!");
    }

    public void gerarRelatorio() {
        float valorTotalEstoque = 0;
        System.out.println("\n===== Relatório de Estoque =====");
        for (Produto produto : estoque) {
            System.out.println(produto);
            valorTotalEstoque += produto.getPreco() * produto.getQuantidadeEmEstoque();
        }
        System.out.println("Valor Total do Estoque: " + valorTotalEstoque);
    }
}
