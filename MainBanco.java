public class MainBanco {
    public static void main(String[] args) {
        Banco conta = new Banco(1500);

        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.deposita(500);

        System.out.println();
        System.out.println("Depositando...");
        System.out.println("Saldo após depósito de R$500: " + conta.getSaldo());

        System.out.println();
        System.out.println("Sacando...");
        boolean tentativaDeSaque = conta.sacar(200);
        if (tentativaDeSaque){
            System.out.println("Saque de 200 reais bem sucedido. Novo saldo: " + conta.getSaldo());
        }else {
            System.out.println("Saldo insuficiente para saque. Saldo atual: " + conta.getSaldo());
        }

        System.out.println();
        System.out.println("Sacando...");
        tentativaDeSaque = conta.sacar(2000);
        if (tentativaDeSaque){
            System.out.println("Saque de 2000 reais bem sucedido. Novo saldo: " + conta.getSaldo());
        }else {
            System.out.println("Saldo insuficiente para saque. Saldo atual: " + conta.getSaldo());
        }
        System.out.println();
        System.out.println("Atualizando...");
        conta.atualizar(0.5);
        System.out.println("Conta sofreu uma atualização de salda com taxa de 5%. Saldo atua: " + conta.visualizarSaldo());
    }




}
