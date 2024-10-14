package br.entrega;

import java.util.List;

import br.estados.EstadoValidacao;
import br.estados.IEstado;

public class Entrega {
    private String codEntrega;
    private EstrategiaEntrega estrategiaEntrega;
    //TODO: Implementar veiculo
    private List<Rota> rotas;
    private IEstado estado = new EstadoValidacao();
}
