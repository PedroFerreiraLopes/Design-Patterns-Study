package br.entrega;

import java.util.ArrayList;
import java.util.List;

import br.estados.EstadoValidacao;
import br.estados.IEstado;
import br.observadores.IObservador;
import br.observadores.IPublicador;
import br.veiculos.IVeiculos;


public class Entrega implements IPublicador {
    private String codEntrega;
    private EstrategiaEntrega estrategiaEntrega;
    private IVeiculos veiculo;
    private List<Rota> rotas;
    private IEstado estado = new EstadoValidacao();  
    private List<IObservador> observadores;
    

    public Entrega(String codEntrega, EstrategiaEntrega estrategiaEntrega, IVeiculos veiculo, Pedido pedido) {
        this.codEntrega = codEntrega;
        this.estrategiaEntrega = estrategiaEntrega;
        this.veiculo = veiculo;
        this.rotas = new ArrayList<>();
        this.observadores = new ArrayList<>();
        
    }

    @Override
    public void adicionarObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (IObservador observador : observadores) {
            observador.atualizar(estado);
        }
    }

    public void setEstado(IEstado novoEstado) {
        this.estado = novoEstado;
        notificarObservadores(); 
    }

    public void adicionarRota(Rota rota) {
        this.rotas.add(rota);
    }

    public void removerRota(Rota rota) {
        this.rotas.remove(rota);
    }

    public void mostrarRotas() {
        for (Rota rota : rotas) {
            System.out.println("Paradas: " + String.join(", ", rota.getParadas()));
            System.out.println("Distância: " + rota.getDistancia() + " km");
            System.out.println("Tempo estimado: " + rota.getTempo() + " horas");
            System.out.println("-----------------------------------");
        }
    }

    public double calcularDistanciaTotal() {
        double distanciaTotal = 0;
        for (Rota rota : rotas) {
            distanciaTotal += rota.getDistancia();
        }
        return distanciaTotal;
    }

    public double calcularTempoTotal() {
        double tempoTotal = 0;
        for (Rota rota : rotas) {
            tempoTotal += rota.getTempo();
        }
        return tempoTotal;
    }
    
    
    public void mostrarInfoEntrega() {
        System.out.println("Código da Entrega: " + codEntrega);
        System.out.println("Veículo: " + veiculo.tipoVeiculo());
        System.out.println("Estratégia de frete: " + estrategiaEntrega.calcularFrete());
        System.out.println("Distância total: " + calcularDistanciaTotal() + " km");
        System.out.println("Tempo total estimado: " + calcularTempoTotal() + " horas");
        mostrarRotas();
    }

}
