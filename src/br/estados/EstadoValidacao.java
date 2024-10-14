package br.estados;

public class EstadoValidacao implements IEstado {
    @Override
    public void ProximoEstado(Entrega2 entrega) {
        entrega.setEstado(new EstadoEmArmazem());
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("O pedido ainda está sendo confirmado, aguarde.");
    }

}
