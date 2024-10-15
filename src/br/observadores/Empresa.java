package br.observadores;

import br.estados.EstadoAtraso;
import br.estados.EstadoPerdido;
import br.estados.IEstado;

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
