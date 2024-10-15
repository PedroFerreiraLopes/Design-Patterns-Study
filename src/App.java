package src;

import java.util.ArrayList;
import java.util.List;

import src.br.entrega.Entrega;
import src.br.entrega.EntregaNormal;
import src.br.entrega.Pedido;
import src.br.entrega.Rota;
import src.br.veiculos.IVeiculos;
import src.br.veiculos.Van;

public class App {
    public static void main(String[] args) throws Exception {
        //testing Pedido
        Pedido pedido1 = new Pedido("1", new EntregaNormal(), "Rua A", "Rua B", "João", "Maria", 10.0);
        pedido1.infoPedido();
        
        System.out.println("------------------------------------------------------");
        
        //testing Entrega
        IVeiculos van = new Van();
        
        // Criação de uma lista de rotas
        List<Rota> rotas = new ArrayList<>();
        
        // Adição de uma nova rota
        String[] paradas = {"São Paulo-SP", "Santo André-SP", "Mauá-SP"};
        Rota rota1 = new Rota(paradas, 300.0, 4.5);
        rotas.add(rota1);
        
        Entrega entrega = new Entrega("ENT123", new EntregaNormal(), van, rotas);
        entrega.mostrarInfoEntrega();
        
    }
}
