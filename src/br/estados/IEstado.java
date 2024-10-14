package br.estados;

public interface IEstado {
    void ProximoEstado(Entrega entrega);

    void Aviso(String mensagem);
}
