package br.estados;

import br.entrega.Entrega;

public class EstadoValidacao implements IEstado {
    @Override
    public void ProximoEstado(Entrega entrega) {
        entrega.setEstado(new EstadoEmArmazem());
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("O pedido ainda está sendo confirmado, aguarde.");
    }

    
    @Override
    public String toString() {
        return "Em confirmação";
    }
}
