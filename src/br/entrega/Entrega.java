package br.entrega;

import java.util.List;

import br.estados.EstadoValidacao;
import br.estados.IEstado;
import br.veiculos.IVeiculos;
import br.veiculos.Van;

public class Entrega {
    private String codEntrega;
    private EstrategiaEntrega estrategiaEntrega;
    private IVeiculos veiculo;
    private List<Rota> rotas;
    private IEstado estado = new EstadoValidacao();
    
    
    public Entrega(String codEntrega, EstrategiaEntrega estrategiaEntrega, IVeiculos veiculo, List<Rota> rotas) {
    	 this.codEntrega = codEntrega;
         this.estrategiaEntrega = estrategiaEntrega;
         this.veiculo = veiculo;
         this.rotas = rotas;
         
    }
    

    // Método para adicionar uma rota
    public void adicionarRota(Rota rota) {
        this.rotas.add(rota);
    }

   
    public void mostrarRotas() {
        for (Rota rota : rotas) {
            System.out.println("Paradas: " + String.join(", ", rota.getParadas()));
            System.out.println("Distância: " + rota.getDistancia() + " km");
            System.out.println("Tempo estimado: " + rota.getTempo() + " horas");
            System.out.println("-----------------------------------");
        }
    }
	
	public void mostrarInfoEntrega() {
		System.out.println("Código de Entrega:" + codEntrega);
        System.out.println("Veículo: " + veiculo.tipoVeiculo());
        System.out.println("Frete: " + estrategiaEntrega.calcularFrete());
        mostrarRotas();
    }
    
    

}
