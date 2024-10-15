package src.br.veiculos;

public class Moto implements IVeiculos {

	@Override
	public String tipoVeiculo() {
		return "Moto";
	}

	@Override
	public double capacidadeCarga() {
		return 400.0;
	}

	@Override
	public double velocidade() {
		return 110.0;
	}

}
