package br.veiculos;

public class Carro implements IVeiculos {

    @Override
    public String tipoVeiculo() {
        return "Carro";
    }

    @Override
    public double capacidadeCarga() {
        return 500.0;
    }

    @Override
    public double velocidade() {
        return 110.0;
    }
}
