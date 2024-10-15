package src.br.observadores;

import src.br.estados.IEstado;

public class Usuario implements IObservador{
    private String nickname;

    public Usuario(String nick) {
        this.nickname = nick;
    }

    @Override
    public void atualizar(IEstado estado) {
        System.out.println("O usuário " + nickname + "foi notificado!");
        System.out.println("Sua entrega está " + estado.toString());
    }
}
