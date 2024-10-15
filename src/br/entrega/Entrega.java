package br.entrega;

import java.util.ArrayList;
import java.util.List;

import br.estados.EstadoValidacao;
import br.estados.IEstado;
import br.observadores.IObservador;
import br.observadores.IPublicador;

public class Entrega implements IPublicador{
    private String codEntrega;
    private EstrategiaEntrega estrategiaEntrega;
    //TODO: Implementar veiculo
    private List<Rota> rotas;
    private IEstado estado = new EstadoValidacao();
    private List<IObservador> observadores;

    public Entrega(IEstado estado) {
        this.estado = estado;
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

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }
}
