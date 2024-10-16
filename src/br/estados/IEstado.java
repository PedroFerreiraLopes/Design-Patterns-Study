package br.estados;

import br.entrega.Entrega;

public interface IEstado {
    void ProximoEstado(Entrega entrega);

    void Aviso(String mensagem);

    // Create a simple toString() method for each
    @Override
    String toString();
}
