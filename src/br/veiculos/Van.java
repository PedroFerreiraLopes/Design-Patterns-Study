package src.br.veiculos;

public class Van implements IVeiculos{
    @Override
    public String tipoVeiculo() {
        return "Van";
    }

    @Override
    public double capacidadeCarga() {
        return 2000.0;
    }

    @Override
    public double velocidade() {
        return 90.0;
    }
}
