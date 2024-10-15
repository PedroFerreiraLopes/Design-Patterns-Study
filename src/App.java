import java.util.ArrayList;
import java.util.List;

import br.entrega.Entrega;
import br.entrega.EntregaNormal;
import br.entrega.EstrategiaEntrega;
import br.entrega.Pedido;
import br.entrega.Rota;
import br.veiculos.IVeiculos;
import br.veiculos.Van;

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
        String[] paradas = {"São Paulo-SP", "Campinas-SP", "Ribeirão Preto-SP"};
        Rota rota1 = new Rota(paradas, 300.0, 4.5);
        rotas.add(rota1);
        
        Entrega entrega = new Entrega("ENT123", new EntregaNormal(), van, rotas);
        entrega.mostrarInfoEntrega();
        
    }
}
