import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private float valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = "";
        this.valorTotal = 0.0f;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0f;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public int getQuantidadePizzas() {
        return pizzas.size();
    }
}
