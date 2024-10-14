package br.estados;

public class EstadoEntrege implements IEstado {
    @Override
    public void ProximoEstado(Entrega entrega) {
        System.out.println("Produto entregue ao destino final!");
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("Produto entregue ao destino final!");
    }
}
