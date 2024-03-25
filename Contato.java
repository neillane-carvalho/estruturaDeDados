public class Contato {
    private String nome;
    private String numero;

    public Contato(String numero, String nome){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Número de telefone: " + numero;
    }


}
