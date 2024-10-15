package src.br.estados;

import src.br.entrega.Entrega;

public interface IEstado {
    void ProximoEstado(Entrega entrega);

    void Aviso(String mensagem);
}
