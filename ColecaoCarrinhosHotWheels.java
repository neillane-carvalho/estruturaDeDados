import java.util.ArrayList;
import java.util.List;

public class ColecaoCarrinhosHotWheels {
    private List<CarrinhoHotWheels> carrinhos;

    public ColecaoCarrinhosHotWheels() {
        this.carrinhos = new ArrayList<>();
    }

    public void adicionarCarrinho(CarrinhoHotWheels carrinho) {
        carrinhos.add(carrinho);
    }

    public void removerCarrinho(String modelo) {
        carrinhos.removeIf(c -> c.getModelo().equals(modelo));
    }

    public void listarCarrinhos() {
        System.out.println("Carrinhos na coleção:");
        for (CarrinhoHotWheels carrinho : carrinhos) {
            System.out.println(carrinho);
        }
    }
}
