package br.entrega;

import br.estados.EstadoValidacao;
import br.estados.IEstado;
import br.observadores.IObservador;
import br.observadores.IPublicador;
import br.veiculos.Caminhao;
import br.veiculos.Carro;
import br.veiculos.IVeiculos;
import br.veiculos.Van;
import java.util.ArrayList;
import java.util.List;


public class Entrega implements IPublicador {
    private String codEntrega;
    private IEstrategiaEntrega estrategiaEntrega;
    private IVeiculos veiculo;
    private List<Rota> rotas;
    private IEstado estado = new EstadoValidacao();  
    private List<IObservador> observadores;

    public Entrega(String codEntrega, IEstrategiaEntrega estrategiaEntrega, Pedido pedido) {
        this.codEntrega = codEntrega;
        this.estrategiaEntrega = estrategiaEntrega;
        this.veiculo = escolherVeiculo(pedido.getPeso());
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

    private IVeiculos escolherVeiculo(double peso) {
        if (peso <= 500) {
            return new Carro();
        } else if (peso > 500 && peso <= 2000) {
            return new Van();
        } else{
            return new Caminhao();
        }
    }

    
    public void mostrarInfoEntrega(Pedido pedido) {
        System.out.println("Código da Entrega: " + codEntrega);
        System.out.println("Veículo: " + veiculo.tipoVeiculo());
        System.out.println("Capacidade de Carga:" + veiculo.capacidadeCarga());
        System.out.println("Estratégia de frete: " + estrategiaEntrega.tipoEntrega());
        mostrarRotas();
    }

}
