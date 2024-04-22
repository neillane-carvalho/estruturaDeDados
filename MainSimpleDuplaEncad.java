import java.util.Scanner;

public class MainSimpleDuplaEncad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimplesEncad listaPrimos = new ListaSimplesEncad();
        ListaDuplaEncad listaNaoPrimos = new ListaDuplaEncad();

        System.out.println("Digite os números (digite 'fim' para encerrar):");
        String entrada;
        while (true) {
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            int numero = Integer.parseInt(entrada);
            if (ehPrimo(numero)) {
                listaPrimos.inserir(numero);
            } else {
                listaNaoPrimos.inserir(numero);
            }
        }

        // Exibe os números da lista simplesmente encadeada
        listaPrimos.exibir();
        // Exibe os números da lista duplamente encadeada
        listaNaoPrimos.exibir();

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}

