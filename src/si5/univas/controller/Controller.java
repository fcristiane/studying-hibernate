package si5.univas.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import si5.univas.dao.ClienteDAO;
import si5.univas.dao.ConnectionFactory;
import si5.univas.dao.DAOException;
<<<<<<< HEAD
import si5.univas.dao.ItemDAO;
import si5.univas.dao.PedidoDAO;
import si5.univas.dao.ProdutoDAO;
import si5.univas.model.Cliente;
import si5.univas.model.Item;
=======
import si5.univas.dao.PedidoDAO;
import si5.univas.dao.ProdutoDAO;
import si5.univas.model.Cliente;
>>>>>>> 55bbe1c30dc83b3cbf3a472192ba432870660376
import si5.univas.model.Pedido;
import si5.univas.model.Produto;
import si5.univas.view.Cadastros;
import si5.univas.view.ConsultaClienteView;
import si5.univas.view.ConsultaProdutoView;
import si5.univas.view.Consultas;
import si5.univas.view.Estoque;
import si5.univas.view.Inicial;
import si5.univas.view.TelaCadastroCliente;
import si5.univas.view.TelaCadastroPedido;
import si5.univas.view.TelaCadastroProduto;

public class Controller {
	
	Inicial inicial = new Inicial(this);
	Cadastros cadastros = new Cadastros(this);
	Consultas consultas = new Consultas(this);
	Estoque estoque = new Estoque(this);
	TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente(this);
	TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto(this);
	TelaCadastroPedido telaCadastroPedido = new TelaCadastroPedido(this);
	ConsultaClienteView consultaCliente = new ConsultaClienteView (this);
	ConsultaProdutoView consultaProduto = new ConsultaProdutoView(this);

	public void iniciar() throws SQLException, DAOException, ParseException{
		inicial.tela();
		
		telaCadastroCliente.tela();
		telaCadastroCliente.setVisible(false);
		
		telaCadastroProduto.tela();
		telaCadastroProduto.setVisible(false);
		
		cadastros.tela();
		cadastros.setVisible(false);
		
		consultas.tela();
		consultas.setVisible(false);
	
		consultaCliente.tela();
		consultaCliente.setVisible(false);
		
		consultaProduto.tela();
		consultaProduto.setVisible(false);
		
		telaCadastroPedido.tela();
		telaCadastroProduto.setVisible(false);
		
		estoque.tela();
		estoque.setVisible(false);
	}
	
	public void exit(){
		int resposta;
		resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?");
		if(resposta == JOptionPane.YES_OPTION){
			System.exit(0);
		}else{
			return;
		}	
	}
	
	public void cliente(){
		cadastros.setVisible(false);
		telaCadastroCliente.setVisible(true);
	}
	
	public void voltarCadastro(){
		telaCadastroCliente.setVisible(false);
		telaCadastroProduto.setVisible(false);
		cadastros.setVisible(true);
	}
	
	public void produto(){
		cadastros.setVisible(false);
		telaCadastroProduto.setVisible(true);
	}
	
	public void voltarInicial(){
		cadastros.setVisible(false);
		consultas.setVisible(false);
		inicial.setVisible(true);
	}
	
	public void cadastros(){
		cadastros.setVisible(true);
		inicial.setVisible(false);
	}
	
	public void pedidos(){
		inicial.setVisible(false);
		telaCadastroPedido.setVisible(true);
	}
	
	public void cadastroCliente(Cliente cliente) throws DAOException{
		
		Connection connection = ConnectionFactory.createConnection();
		
		// Inserir o Cliente
		ClienteDAO clienteDAO = new ClienteDAO(connection);		
		clienteDAO.insertCliente(cliente);
	}
	
	public void cadastroProduto(Produto produto) throws DAOException{
		
		Connection connection = ConnectionFactory.createConnection();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		produtoDAO.insertProduto(produto);
	}
	
	public void voltaInicial(){
		telaCadastroPedido.setVisible(false);
		estoque.setVisible(false);
		inicial.setVisible(true);
	}
	
	public void consultas(){
		inicial.setVisible(false);
		consultas.setVisible(true);
	}
	
	public void consultaCliente(){
		consultas.setVisible(true);
		consultaCliente.setVisible(true);
	}
	
	public void consultaProduto(){
		consultas.setVisible(true);
		consultaProduto.setVisible(true);
	}
	
	public void estoque(){
		inicial.setVisible(false);
		estoque.setVisible(true);
	}
	
	public ArrayList<Cliente> pesquisaCliente() throws SQLException, DAOException{
		ClienteDAO cliente = new ClienteDAO();
		return cliente.pesquisarClientes();
	
	public ArrayList<Produto> pesquisaProduto() throws SQLException, DAOException{
		ProdutoDAO produto = new ProdutoDAO();
		return produto.pesquisarProduto();
	
	public ArrayList<Produto> pesquisaProduto() throws SQLException, DAOException{
		ProdutoDAO produto = new ProdutoDAO();
		return produto.pesquisarProduto();

	public void cadastrarPedido(Cliente cliente, Pedido pedido) throws DAOException{
		PedidoDAO pedidoDAO = new PedidoDAO();
		pedidoDAO.insertPedido(pedido, cliente);
	}

	public void cadastrarItem(Cliente cliente,ArrayList<Item> item) throws DAOException{
		ItemDAO itemDAO = new ItemDAO();
	}
		
	
	
}
