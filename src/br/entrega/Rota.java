package br.entrega;

public class Rota {
    //lista de paradas da entrega no estilo Cidade-UF
    private String[] paradas;
    private double distancia;
    private double tempo;

    public Rota(String[] paradas, double distancia, double tempo) {
        this.paradas = paradas;
        this.distancia = distancia;
        this.tempo = tempo;
    }

	public String[] getParadas() {
		return paradas;
	}

	public double getDistancia() {
		return distancia;
	}

	public double getTempo() {
		return tempo;
	}

}
