package br.entrega;

public class EntregaRapida implements EstrategiaEntrega {
    @Override
    public double calcularFrete() {
        return 10.0;
    }    
}
