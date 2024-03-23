public class Contato { // Classe que representa um contato
    private int idAluno;
    private String nome;
    private String email;

    public Contato(int idAluno, String nome, String email){
        this.idAluno = idAluno;
        this.nome = nome;
        this.email = email;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
    return "ID: " + idAluno + ", Nome: "+nome+", Email: "+email;
    }
}
