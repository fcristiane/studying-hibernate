import java.util.Date;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sun.security.ntlm.Client;

import edu.univas.si4.entity.Cliente;
import edu.univas.si4.entity.Pedido;


public class TesteHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("loja");
		
		EntityManager entityManager = factory.createEntityManager();
		
		Cliente cliente = entityManager.find(Cliente.class, 504);
		System.out.println("Nome do cliente: "+ cliente.getNome());
		Set<Pedido> pedidos = cliente.getPedidos();
		
		for (Pedido pedido : pedidos){
			System.out.println("Data do pedido: " + pedido.getData());
		}
		
		
		
		/*Pedido pedido = entityManager.find(Pedido.class, 200);
		System.out.println(pedido.getCod());
		
		System.out.println("Buscando cliente");
		
		Cliente cliente = pedido.getCliente();
		System.out.println("Nome do Cliente: "+ cliente.getNome());
		*/
		
		
		cliente = new Cliente();
		cliente.setEmail("cris@gmail.com");
		cliente.setNome("Cristiane Ferreira");
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		
		
		/*Pedido pedido = new Pedido();
		Cliente cliente = pedido.getCliente();
		System.out.println("Nome: "+ cliente.getNome());
		pedido.setCod(200);
		pedido.setCodCliente(504);
		pedido.setData(new Date());
		
		entityManager.getTransaction().begin();
		entityManager.persist(pedido);
		entityManager.getTransaction().commit();
		*/
		
		
//		entityManager.close();
		factory.close();
		
		System.out.println("Done");
	}

}
