package br.estados;
// DUMMY CLASS
// !!! CHANGE TO ANOTHER PACKAGE LATER !!!
public class Entrega {
    private IEstado estado = new EstadoValidacao();

    public Entrega(IEstado estado) {
        this.estado = estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }
}
