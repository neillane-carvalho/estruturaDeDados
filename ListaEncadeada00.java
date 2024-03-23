public class ListaEncadeada00 {
    private No00 primeiro;

    public ListaEncadeada00(){
        this.primeiro = null;
    }

    public void adcionar(int valor){
        No00 novoNo00 = new No00(valor);
        novoNo00.proximo = primeiro;
        primeiro = novoNo00;
    }

    public void imprimir(){
        No00 atual = primeiro;
        while (atual != null){
            System.out.println(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void excluir(int valor){
        No00 atual = primeiro;
        No00 anterior = null;

        while (atual != null && atual.valor != valor){
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null){
            System.out.println("Valor não encontrado na lista!");
            return;
        }

        if (anterior == null){
            primeiro = primeiro.proximo;
        } else {
            anterior.proximo = atual.proximo;
        }

    }

}
