package br.estados;

import java.util.ArrayList;
import java.util.List;

import br.observadores.IObservador;

// DUMMY CLASS
// !!! CHANGE TO ANOTHER PACKAGE LATER !!!
public class Entrega2 {
    private IEstado estado = new EstadoValidacao();
    private List<IObservador> observadores;

    public Entrega2(IEstado estado) {
        this.estado = estado;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(IObservador observador) {
        observadores.add(observador);
    }

    public void removerObservador(IObservador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (IObservador observador : observadores) {
            observador.atualizar(estado); // TALVEZ !?
        }
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }
}
