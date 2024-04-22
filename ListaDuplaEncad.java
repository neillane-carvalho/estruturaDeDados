public class ListaDuplaEncad {
    private No2 primeiro;
    private No2 ultimo;

    public ListaDuplaEncad(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(int valor) {
        No2 novoNoh = new No2(valor);
        if (primeiro == null) {
            primeiro = novoNoh;
            ultimo = novoNoh;
        } else {
            ultimo.proximo = novoNoh;
            novoNoh.anterior = ultimo;
            ultimo = novoNoh;
        }
    }

    // Método para exibir os números da lista
    public void exibir() {
        No2 atual = primeiro;
        System.out.println("Números na lista duplamente encadeada:");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Método principal para inserir números não primos na lista duplamente encadeada
    public void inserirNumerosNaoPrimos(int[] numeros) {
        for (int numero : numeros) {
            if (!ehPrimo(numero)) {
                inserir(numero);
            }
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
}
