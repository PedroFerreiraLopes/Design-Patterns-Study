package src.br.veiculos;

public class Veiculos {
    private IVeiculos veiculo;

    public Veiculos(IVeiculos veiculo) {
        this.veiculo = veiculo;
    }

    public String tipoVeiculo() {
        return veiculo.tipoVeiculo();
    }

    public double capacidadeCarga() {
        return veiculo.capacidadeCarga();
    }

    public double velocidade() {
        return veiculo.velocidade();
    }
}
