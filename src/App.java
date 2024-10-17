import br.entrega.Entrega;
import br.entrega.EntregaNormal;
import br.entrega.EntregaRapida;
import br.entrega.Pedido;
import br.estados.EstadoAtraso;
import br.estados.EstadoEmArmazem;
import br.observadores.Empresa;
import br.observadores.Usuario;

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
    	
    	
    	//Entregas
    	Entrega entrega1 = new Entrega("1", new EntregaNormal(), pedido1);
		entrega1.mostrarInfoEntrega(pedido1);
		entrega1.mostrarRotas();

    	System.out.println("--------------------------------------------------------");

		Entrega entrega2 = new Entrega("2", new EntregaRapida(), pedido2);
		entrega2.mostrarInfoEntrega(pedido2);
		entrega2.mostrarRotas();

    	System.out.println("--------------------------------------------------------");
    	
    	//definir observers
    	entrega1.adicionarObservador(empresa);
        entrega1.adicionarObservador(usuario1);

        entrega1.setEstado(new EstadoAtraso());
        entrega1.notificarObservadores();
        
        System.out.println("--------------------------------------------------------");
        
    	entrega1.adicionarObservador(empresa);
        entrega1.adicionarObservador(usuario2);
        
        entrega1.setEstado(new EstadoEmArmazem());
        entrega1.notificarObservadores();
        
    }
}
