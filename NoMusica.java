public class NoMusica {
    private Musica musica;
    NoMusica proximo;

    public NoMusica(Musica musica){
        this.musica = musica;
        this.proximo = null;
    }

    public Musica getMusica() {
        return musica;
    }

    public NoMusica getProximo() {
        return proximo;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public void setProximo(NoMusica proximo) {
        this.proximo = proximo;
    }
}
