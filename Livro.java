public class Livro {
    private String titulo;
    private String editora;
    private int anoPublicacao;

    public Livro(String titulo, String editora, int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean validarAnoPublicacao(){
        int anoAtual = java.time.Year.now().getValue();
        return anoPublicacao <= anoAtual;
    }

    public String formatarInfomacoes(){
        return "Título: " + titulo + ", Editora: " + editora + ", Ano de Publicação: " + anoPublicacao;
    }

    public int calcularIdadeLivro(){
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoPublicacao;
    }
}
