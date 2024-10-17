package br.veiculos;

public class Caminhao implements IVeiculos {

	@Override
	public String tipoVeiculo() {
		return "Caminhao";
	}

	@Override
	public double capacidadeCarga() {
		return 5000.0;
	}

	@Override
	public double velocidade() {
		return 110.0;
	}

}
