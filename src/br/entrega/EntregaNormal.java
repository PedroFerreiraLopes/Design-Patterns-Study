package br.entrega;

public class EntregaNormal implements IEstrategiaEntrega {

	@Override
	public double calcularFrete(double peso) {
		return 5.0 * peso;
	}
	
	@Override
	public String tipoEntrega() {
		return "Entrega Normal";
	}
    
    
}
