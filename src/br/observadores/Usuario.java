package br.observadores;

import br.entrega.EstrategiaEntrega;
import br.entrega.Pedido;
import br.estados.IEstado;

public class Usuario implements IObservador{
    private String nickname;

    public Usuario(String nick) {
        this.nickname = nick;
    }

    @Override
    public void atualizar(IEstado estado) {
        System.out.println("O usuário " + nickname + "foi notificado!");
        System.out.println("Sua entrega está " + estado.toString());
    }
    
    public Pedido criarPedido(String codigoPedido, EstrategiaEntrega estrategiaEntrega, String enderecoRemetente,
                              String enderecoDestinatario, String remetente, String destinatario, double peso) {
        return new Pedido(codigoPedido, estrategiaEntrega, enderecoRemetente, enderecoDestinatario, remetente, destinatario, peso, this);
    }
}
