import java.util.ArrayList;

public class AgendaContatos {
    private ArrayList<Contato> contatos;

    public AgendaContatos() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.remove(i);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado na agenda.");
    }

    public void buscarContato(String termo) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase().contains(termo.toLowerCase()) ||
                    contato.getEmail().toLowerCase().contains(termo.toLowerCase()) ||
                    contato.getTelefone().toLowerCase().contains(termo.toLowerCase())) {
                System.out.println(contato);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum contato encontrado para o termo '" + termo + "'.");
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda de contatos está vazia.");
        } else {
            System.out.println("\n===== Lista de Contatos =====");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
