public class AlunoDuplaEncad {
    String nome;
    AlunoDuplaEncad proximo;
    AlunoDuplaEncad anterior;

    // Construtor
    public AlunoDuplaEncad(String nome) {
        this.nome = nome;
        this.proximo = null;
        this.anterior = null;
    }
}
