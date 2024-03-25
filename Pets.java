import java.util.Date;

public class Pets {
    private String nome;
    private  String numeroTutor;
    private Date dataDeNascimento;
    private String raca;

    public Pets(String nome, String numeroTutor, Date dataDeNascimento, String raca){
        this.nome = nome;
        this.numeroTutor = numeroTutor;
        this.dataDeNascimento = dataDeNascimento;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTutor() {
        return numeroTutor;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroTutor(String numeroTutor) {
        this.numeroTutor = numeroTutor;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Pet nome: " + nome + ", raça: " + raca + ", data de nascimento: " + dataDeNascimento + ", número de telefone do tutor: " + numeroTutor;
    }
}
