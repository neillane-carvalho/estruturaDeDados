public class ListaSimplesEncad {
    private No2 primeiro;
    private No2 ultimo;

    // Construtor
    public ListaSimplesEncad() {
        this.primeiro = null;
        this.ultimo = null;
    }

    // Método para inserir um nó na lista
    public void inserir(int valor) {
        No2 novoNoh = new No2(valor);
        if (primeiro == null) {
            primeiro = novoNoh;
            ultimo = novoNoh;
        } else {
            ultimo.proximo = novoNoh;
            ultimo = novoNoh;
        }
    }

    // Método para verificar se um número é primo
    private boolean ehPrimo(int numero) {
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

    // Método para exibir os números da lista
    public void exibir() {
        No2 atual = primeiro;
        System.out.println("Números na lista simplesmente encadeada:");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Método principal para inserir números primos na lista simplesmente encadeada
    public void inserirNumerosPrimos(int[] numeros) {
        for (int numero : numeros) {
            if (ehPrimo(numero)) {
                inserir(numero);
            }
        }
    }


}
