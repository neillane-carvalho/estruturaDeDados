public class Banco {
    private double saldo;

    public Banco(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  double visualizarSaldo(){
        return saldo;
    }

    public  void  deposita(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if (valor <= saldo ){
            saldo -= valor;
            return true;
        } else {
            return  false;
        }
    }

    public void atualizar(double taxa){
        saldo *= (1 + taxa);
    }
}
