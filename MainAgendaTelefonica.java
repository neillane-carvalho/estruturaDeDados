public class MainAgendaTelefonica {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.adicionarContato(new Contato("71983899735","Neillane de Carvalho"));
        agenda.adicionarContato(new Contato("71986063129","Tatiane Santos"));

        agenda.listaContatos();

        System.out.println();

        System.out.println("Adiocionando novo contato...");
        agenda.adicionarContato(new Contato("75986897452", "João Almeida"));
        agenda.listaContatos();

        System.out.println();

        System.out.println("Removendo contato...");
        agenda.removerContato("João Almeida");
        System.out.println("Agenda Atualizada:");
        agenda.listaContatos();

        System.out.println();

        System.out.println("Atualizando contato...");
        agenda.atualizarContato("Neillane de Carvalho", "71983899736");
        System.out.println("Agenda Atualizada:");
        agenda.listaContatos();
    }
}
