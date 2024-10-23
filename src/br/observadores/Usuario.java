package br.observadores;

import br.entrega.IEstrategiaEntrega;
import br.entrega.Pedido;
import br.estados.IEstado;

public class Usuario implements IObservador{
    private String nickname;

    public Usuario(String nick) {
        this.nickname = nick;
    }

    @Override
    public void atualizar(IEstado estado) {
        System.out.println("O usuário " + nickname + " foi notificado!");
        System.out.println("Sua entrega está " + estado.NomeEstado());
    }
    
    public Pedido criarPedido(String codigoPedido, IEstrategiaEntrega estrategiaEntrega, String enderecoRemetente,
                              String enderecoDestinatario, String remetente, String destinatario, double peso) {
        return new Pedido(codigoPedido, estrategiaEntrega, enderecoRemetente, enderecoDestinatario, remetente, destinatario, peso, this);
    }
}
