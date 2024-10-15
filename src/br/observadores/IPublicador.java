package br.observadores;

public interface IPublicador {
    public void adicionarObservador(IObservador observador);

    public void removerObservador(IObservador observador);

    public void notificarObservadores();
}
