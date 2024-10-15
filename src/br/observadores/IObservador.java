package src.br.observadores;

import src.br.estados.IEstado;

public interface IObservador {
    public void atualizar(IEstado estado);
}
