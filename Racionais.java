public class Racionais {
    private int numerador;
    private int denominador;

    public Racionais(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public Racionais somar(Racionais outro){
        int novoNumerador = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racionais(novoNumerador, novoDenominador);
    }

    public Racionais multiplicacao(Racionais outro){
        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racionais(novoNumerador, novoDenominador);
    }

    public boolean equals(Racionais outro) {
        return this.numerador * outro.denominador == outro.numerador * this.denominador;
    }
}
