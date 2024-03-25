public class MainListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adcionar(new DadosAluno(1,"Alice", "alice@gmail.com"));
        lista.adcionar(new DadosAluno(2, "Maria", "maria@gmail.com"));
        lista.adcionar(new DadosAluno(3, "Lucas", "lucas@gmail.com"));
        System.out.println("Lista de Contatos:");

        lista.imprimir();

       lista.excluir(2);
        System.out.println("Lista após a exclusão:");

        lista.imprimir();
    }
}
