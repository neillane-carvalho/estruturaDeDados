public class CarrinhoHotWheels {
    private String modelo;
    private int anoFabricacao;
    private String cor;

    public CarrinhoHotWheels(String modelo, int anoFabricacao, String cor) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + ", Cor: " + cor;
    }
}
