package br.estados;

import br.entrega.Entrega;

public interface IEstado {
    void ProximoEstado(Entrega entrega);

    void Aviso(String mensagem);
}
