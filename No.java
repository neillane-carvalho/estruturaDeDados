public class No { // Classe que representa um nó na lista encadeada

    private DadosAluno dadosAluno;
    No proximo;

    public No(DadosAluno dadosAluno){ // Construtor
        this.dadosAluno = dadosAluno;
        this.proximo = null;
    }
    // Getters e Setters
    public DadosAluno getContato() {
        return dadosAluno;
    }

    public void setContato(DadosAluno dadosAluno) {
        this.dadosAluno = dadosAluno;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
