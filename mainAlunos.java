public class mainAlunos {
    public static void main(String[] args) {
        Alunos alunos1 = new Alunos("Maria Helena Carneiro", 2);
        Alunos alunos2 = new Alunos("Pedro oliveira dos santos", 4);
        Alunos alunos3 = new Alunos("Alice de carvalho Silva", 7);

        System.out.println("Relação de Alunos:");
        System.out.println(alunos1.formatarInformacoes());
        System.out.println();
        System.out.println(alunos2.formatarInformacoes());
        System.out.println();
        System.out.println(alunos3.formatarInformacoes());
    }



}
