package br.estados;

public class EstadoEmArmazem implements IEstado {
    @Override
    public void ProximoEstado(Entrega2 entrega) {
        entrega.setEstado(new EstadoEmRota());
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("Produtos em Armazem. Aguardando envio");
    }
}
