package src.br.estados;

import src.br.entrega.Entrega;

public class EstadoAtraso implements IEstado {
    @Override
    public void ProximoEstado(Entrega entrega) {
        entrega.setEstado(new EstadoEntrege());
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("Produtos com atraso. Desculpe o incômodo");
    }
}
