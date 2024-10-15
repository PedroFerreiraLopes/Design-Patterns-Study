package src.br.observadores;

import src.br.estados.EstadoAtraso;
import src.br.estados.EstadoPerdido;
import src.br.estados.IEstado;

public class Empresa implements IObservador{
    private String nome = "Generic Logistics";

    @Override
    public void atualizar(IEstado estado) {
        if (estado instanceof EstadoPerdido) {
            System.out.println("AVISO! Empresa " + nome);
            System.out.println("Uma entrega está perdida!");   
        }
        else if (estado instanceof EstadoAtraso) {
            System.out.println("AVISO! Empresa " + nome);
            System.out.println("Uma entrega está atrasada!");   
        }
    }
}
