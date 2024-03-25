public class MainHotWheels {
    public static void main(String[] args) {
        ColecaoCarrinhosHotWheels colecao = new ColecaoCarrinhosHotWheels();

        colecao.adicionarCarrinho(new CarrinhoHotWheels("Ferrari F40", 1990, "Vermelho"));
        colecao.adicionarCarrinho(new CarrinhoHotWheels("Nissan Skyline GT-R R34", 1999, "Azul"));
        colecao.adicionarCarrinho(new CarrinhoHotWheels("Porsche 911 GT3 RS", 2016, "Laranja"));

        colecao.listarCarrinhos();

        colecao.removerCarrinho("Nissan Skyline GT-R R34");

        System.out.println("\nCarrinhos na coleção após remoção:");
        colecao.listarCarrinhos();
    }
}
