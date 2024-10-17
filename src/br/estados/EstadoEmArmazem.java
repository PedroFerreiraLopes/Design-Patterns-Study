package br.estados;

import br.entrega.Entrega;

public class EstadoEmArmazem implements IEstado {
    @Override
    public void ProximoEstado(Entrega entrega) {
        entrega.setEstado(new EstadoEmRota());
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("Produtos em Armazém. Aguardando envio");
    }
    
    @Override
    public String toString() {
        return "Guardado em armazém";
    }

	@Override
	public String NomeEstado() {
		return "Em Armazém";
	}
}
