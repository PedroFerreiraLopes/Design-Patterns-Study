package src.br.entrega;

import java.util.ArrayList;
import java.util.List;

import src.br.estados.EstadoValidacao;
import src.br.estados.IEstado;
import src.br.observadores.IObservador;
import src.br.observadores.IPublicador;
import src.br.veiculos.IVeiculos;

public class Entrega implements IPublicador{
    private String codEntrega;
    private EstrategiaEntrega estrategiaEntrega;
    private IVeiculos veiculo;
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
