import java.util.Scanner;

public class MainDuplaEncad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Digite os nomes dos alunos (digite 'fim' para encerrar):");
        String nome;
        while (true) {
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            lista.inserir(nome);
        }

        lista.exibir();

        scanner.close();
    }

}
