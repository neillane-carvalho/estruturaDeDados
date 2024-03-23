public class fiboRecur {

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Sequência de Fibonacci (Recursiva):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}
