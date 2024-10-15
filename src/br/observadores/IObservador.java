package br.observadores;

import br.estados.IEstado;

public interface IObservador {
    void atualizar(IEstado estado);
}
