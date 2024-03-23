public class MainRacionais {
    public static void main(String[] args) {
        Racionais racionais1 = new Racionais(1, 2);
        Racionais racionais2 = new Racionais(2, 3);
        Racionais racionais3 = new Racionais(3, 10);
        Racionais racionais4 = new Racionais(1,2);

        Racionais soma = racionais1.somar(racionais2);
        System.out.println("A soma dos racionais é: "+ soma.getNumerador() + "/"+ soma.getDenominador());

        System.out.println();

        Racionais produto = racionais3.multiplicacao(racionais4);
        System.out.println("O produto dos racionais é: " + produto.getNumerador() + "/" + produto.getDenominador());
        System.out.println();

        boolean igualdade = racionais1.equals(racionais4);
        System.out.println("Os racionais são igauis? " + (igualdade ? "sim":"não"));
    }
}
