public class Main00 {
    public static void main(String[] args) {
        ListaEncadeada00 lista = new ListaEncadeada00();

        lista.adcionar(3);
        lista.adcionar(7);
        lista.adcionar(12);
        System.out.println("Lista original:");

        lista.imprimir();

       lista.excluir(7);
        System.out.println("Lista após eclusão:");

        lista.imprimir();
    }
}
