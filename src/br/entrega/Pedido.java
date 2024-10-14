package br.entrega;

public class Pedido {
    private String codigoPedido;
    private EstrategiaEntrega estrategiaEntrega;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private String remetente;
    private String destinatario;

    public Pedido(String codigoPedido, EstrategiaEntrega estrategiaEntrega, String enderecoRemetente, String enderecoDestinatario, String remetente, String destinatario) {
        this.codigoPedido = codigoPedido;
        this.estrategiaEntrega = estrategiaEntrega;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public void infoPedido() {
        System.out.println("Código do pedido: " + codigoPedido);
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);
        System.out.println("Remetente: " + remetente);
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Valor do frete: " + estrategiaEntrega.calcularFrete());
    }
    
}
