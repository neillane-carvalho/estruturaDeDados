public class MainLivros {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Intrissica", 1989);
        Livro livro2 = new Livro("Senhor dos Aneis", "Novo Século", 1977);
        Livro livro3 = new Livro("Orgulho e preconceito", "Martin Claret", 1820);
        Livro livro4 = new Livro("Futuristico", "Futura", 2050);

        System.out.println("Informações sobre os livros:");
        System.out.println("Livro 1:");
        System.out.println(livro1.formatarInfomacoes());
        System.out.println("É válido? " + (livro1.validarAnoPublicacao() ? "sim":" não"));
        System.out.println("Idade do Livro: " + livro1.calcularIdadeLivro() + " anos");

        System.out.println();

        System.out.println("Livro 2:");
        System.out.println(livro2.formatarInfomacoes());
        System.out.println("É válido? " + (livro2.validarAnoPublicacao() ? "Sim" : "Não"));
        System.out.println("Idade do livro: " + livro2.calcularIdadeLivro() + " anos");

        System.out.println();

        System.out.println("Livro 3:");
        System.out.println(livro3.formatarInfomacoes());
        System.out.println("É válido? " + (livro3.validarAnoPublicacao() ? "Sim" : "Não"));
        System.out.println("Idade do livro: " + livro3.calcularIdadeLivro() + " anos");

        System.out.println();
        System.out.println("livro 4:");
        System.out.println(livro4.formatarInfomacoes());
        System.out.println("É válido? " + (livro4.validarAnoPublicacao() ? "Sim" : "Não"));
        System.out.println("Idade do livro: " + livro4.calcularIdadeLivro() + " anos");
    }
}
