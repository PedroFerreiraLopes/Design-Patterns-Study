import br.entrega.EntregaNormal;
import br.entrega.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        //testing Pedido
        Pedido pedido1 = new Pedido("1", new EntregaNormal(), "Rua A", "Rua B", "João", "Maria", 10.0);
        pedido1.infoPedido();
    }
}
