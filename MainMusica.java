public class MainMusica {
    public static void main(String[] args) {
        ListaEncadeadaMusica lista = new ListaEncadeadaMusica();

        lista.adcionar(new Musica(01,"Macetando", "Ivete Sangalo"));
        lista.adcionar(new Musica(02,"Feeling Good", "Nina Simone"));
        lista.adcionar(new Musica(03, "Envolver", "Anitta"));

        System.out.println("Lista original:");
        lista.imprimir();

        System.out.println();

        System.out.println("Lista após a exclusão:");
        lista.excluir(02);

        lista.imprimir();
    }

}
