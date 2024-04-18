public class ListaDuplamenteEncadeada {
    private AlunoDuplaEncad primeiro;
    private AlunoDuplaEncad ultimo;

    public ListaDuplamenteEncadeada(){
        this.primeiro = null;
        this.primeiro = null;
    }

    public AlunoDuplaEncad getPrimeiro() {
        return primeiro;
    }

    public AlunoDuplaEncad getUltimo() {
        return ultimo;
    }

    public void setPrimeiro(AlunoDuplaEncad primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(AlunoDuplaEncad ultimo) {
        this.ultimo = ultimo;
    }



    public void inserir(String nome){
        AlunoDuplaEncad novoAluno = new AlunoDuplaEncad(nome);
        if (primeiro == null){
            primeiro = novoAluno;
            ultimo = novoAluno;
        } else {
            ultimo.proximo = novoAluno;
            novoAluno.anterior = ultimo;
            ultimo = novoAluno;
        }
    }

    public void exibir() {
        AlunoDuplaEncad atual = primeiro;
        System.out.println("Alunos na lista:");
        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.proximo;
        }
    }
}
