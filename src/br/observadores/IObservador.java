package br.observadores;

import br.estados.IEstado;

public interface IObservador {
    public void atualizar(IEstado estado);
}
