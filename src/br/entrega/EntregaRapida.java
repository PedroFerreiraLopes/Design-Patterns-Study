package br.entrega;

public class EntregaRapida implements IEstrategiaEntrega {
    @Override
    public double calcularFrete(double peso) {
        return 10.0 * peso;
    }

	@Override
	public String tipoEntrega() {
		return "Entrega Rápida";
	}    
}
