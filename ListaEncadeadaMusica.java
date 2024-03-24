public class ListaEncadeadaMusica {
    private NoMusica primeiro;

    public ListaEncadeadaMusica(){
        this.primeiro = null;
    }

    public void  adcionar(Musica musica){
        NoMusica novoNo = new NoMusica(musica);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public void imprimir(){
        NoMusica atual = primeiro;
        while (atual != null){
            System.out.println(atual.getMusica());
            atual = atual.getProximo();
        }
    }

    public void excluir(int idMusica){
        NoMusica atual = primeiro;
        NoMusica anterior = null;

        while (atual != null && atual.getMusica().getIdMusica() != idMusica){
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null){
            System.out.println("Música co ID " + idMusica + " não encontrado na lista.");
            return;
        }

        if (anterior == null){
            primeiro = primeiro.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }
    }
}
