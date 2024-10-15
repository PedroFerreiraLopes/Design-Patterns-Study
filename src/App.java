import br.entrega.Entrega;
import br.entrega.EntregaNormal;
import br.entrega.EntregaRapida;
import br.entrega.Pedido;
import br.estados.EstadoAtraso;
import br.observadores.Empresa;
import br.observadores.Usuario;
import br.veiculos.IVeiculos;
import br.veiculos.Van;

public class App {
    public static void main(String[] args) throws Exception {
	
    	// Usuários
    	Usuario usuario1 = new Usuario("Fulano");
    	Usuario usuario2 = new Usuario("Sicrano");
    	
    	//Pedidos
    	Pedido pedido1 = usuario1.criarPedido("1", new EntregaNormal(), "Rua A", "Rua B", "maria", "fulano", 200.0);
    	pedido1.infoPedido();
    	
    	System.out.println("--------------------------------------------------------");
    	
    	Pedido pedido2 = usuario2.criarPedido("2", new EntregaRapida(), "Rua C", "Rua D", "Sofia", "Sicrano", 2000.0);
    	pedido2.infoPedido();
    	
    	System.out.println("--------------------------------------------------------");
    	
    	//Empresa
    	Empresa empresa = new Empresa();
    	
    	//Veículos
    	IVeiculos veiculo1 = new Van();
    	
    	//Entregas
    	Entrega entrega = new Entrega("1", new EntregaNormal(), veiculo1, pedido1);
    	
    	entrega.adicionarObservador(empresa);
        entrega.adicionarObservador(usuario1);
        
        entrega.setEstado(new EstadoAtraso());

        entrega.notificarObservadores();
    }
}
