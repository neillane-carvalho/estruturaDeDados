public class Musica {
    private int idMusica;
    private String nome;
    private String cantor;

    public Musica(int idMusica, String nome, String cantor){
        this.cantor = cantor;
        this.idMusica = idMusica;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public String getCantor() {
        return cantor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String toString(){

        return "ID: " + idMusica + ", Nome: " + nome + ", Cantor(a): " + cantor;
    }

}
