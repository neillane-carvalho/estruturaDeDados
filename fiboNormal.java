public class fiboNormal {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Sequência de Fibonacci (Não Recursiva):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNaoRecursivo(i) + " ");
        }
    }

    public static int fibonacciNaoRecursivo(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 0, a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
