package br.estados;

public class EstadoPerdido implements IEstado{
    @Override
    public void ProximoEstado(Entrega entrega) {
        System.out.println("Falha na entrega!!!");
    }

    @Override
    public void Aviso(String mensagem) {
        System.out.println("FALHA NA ENTREGA!!!");
    }
}