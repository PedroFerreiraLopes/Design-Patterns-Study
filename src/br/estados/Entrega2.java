package br.estados;
// DUMMY CLASS
// !!! CHANGE TO ANOTHER PACKAGE LATER !!!
public class Entrega2 {
    private IEstado estado = new EstadoValidacao();

    public Entrega2(IEstado estado) {
        this.estado = estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }
}
