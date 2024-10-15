package src.br.estados;

import src.br.entrega.Entrega;

public class EstadoEmRota implements IEstado {
    @Override
    public void ProximoEstado(Entrega entrega) {
        entrega.setEstado(new EstadoEntrege());
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("Produto em trânsito!");
    }
}
