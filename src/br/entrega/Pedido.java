package br.entrega;

import br.observadores.Usuario;

public class Pedido {
    private String codigoPedido;
    private EstrategiaEntrega estrategiaEntrega;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private String remetente;
    private String destinatario;
    private double peso;

    public Pedido(String codigoPedido, EstrategiaEntrega estrategiaEntrega, String enderecoRemetente, String enderecoDestinatario, String remetente, String destinatario, double peso, Usuario usuario) {
        this.codigoPedido = codigoPedido;
        this.estrategiaEntrega = estrategiaEntrega;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public void infoPedido() {
        System.out.println("Código do pedido: " + codigoPedido);
        System.out.println("Remetente: " + remetente + " - Endereço: " + enderecoRemetente );
        System.out.println("Destinatário: " + destinatario + " - Endereço: " + enderecoDestinatario);
        System.out.println("Valor do frete: " + estrategiaEntrega.calcularFrete());
        System.out.println("Peso: " + peso);

    }
    
}
