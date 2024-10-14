package br.estados;

public class EstadoEntrege implements IEstado {
    @Override
    public void ProximoEstado(Entrega2 entrega) {
        System.out.println("Produto entregue ao destino final!");
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("Produto entregue ao destino final!");
    }
}
