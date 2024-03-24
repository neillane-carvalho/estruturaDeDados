public class ListaEncadeada { // Classe que representa a Lista Encadeada

    private No primeiro;

    public ListaEncadeada(){ //construtor

        this.primeiro = null;
    }


    public void adcionar(Contato contato) {
        No no = new No(contato);
        no.setProximo(primeiro);
        primeiro = no;
    }

    public void imprimir() {
        No atual = primeiro;
        while (atual != null){
            System.out.println(atual.getContato());
            atual = atual.getProximo();
        }
    }

    public void excluir(int idAluno) {
        No atual = primeiro;
        No anterior = null;

        while (atual != null && atual.getContato().getIdAluno() != idAluno){  // Procurar o nó que contém o contato com o ID especificado
            anterior = atual;
            atual =atual.getProximo();
        }

        if (atual == null){ // Se o contato com o ID especificado não foi encontrado na lista
            System.out.println("Contato com ID " + idAluno + " não encontrado na lista.");
            return;
        }

        if (anterior == null){  // Se o contato com o ID especificado está no primeiro nó
            primeiro = primeiro.getProximo();
        } else {
            // Se o contato com o ID especificado está em um nó intermediário ou no último nó
            anterior.setProximo(atual.getProximo());
        }
    }
}
