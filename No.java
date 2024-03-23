public class No { // Classe que representa um nó na lista encadeada

    private Contato contato;
    No proximo;

    public No(Contato contato){ // Construtor
        this.contato = contato;
        this.proximo = null;
    }
    // Getters e Setters
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
