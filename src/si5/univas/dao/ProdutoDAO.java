package si5.univas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import si5.univas.model.Cliente;
import si5.univas.model.Produto;

public class ProdutoDAO {

	private Connection connection;
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public ProdutoDAO() throws DAOException {
		this.connection = ConnectionFactory.createConnection();
	}
	
	private int nextCode() throws DAOException {
		
		try {
			String sql = "SELECT nextval('seq_produto')";
			ResultSet result = connection.createStatement().executeQuery(sql);

			if(result.next()) {
				return result.getInt(1);
			}
			
			throw new DAOException("N�o foi poss�vel pegar o valor da sequ�ncia");
		} catch (SQLException exception) {
			throw new DAOException(exception);
		}
	}
	
	public void insertProduto(Produto produto)throws DAOException{
		
		try {
			// Buscando o pr�ximo valor da sequ�ncia e atribuindo ao objeto
			produto.setCod(nextCode());
			
			String sql = "INSERT INTO produto (nome,qtd) VALUES (?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,produto.getNome());
			statement.setInt(2,produto.getQtd());
			
			statement.executeUpdate();
		} catch (SQLException exception) {
			throw new DAOException(exception);
		}
	}
<<<<<<< HEAD
=======
	
	
	public ArrayList<Produto> pesquisarProduto() throws SQLException{
		
		String sql = "SELECT * FROM produto;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		ResultSet result = statement.executeQuery();
		
		while(result.next()){
			Produto produtos = new Produto();
			
			produtos.setCod(result.getInt("cod"));
			produtos.setNome(result.getString("nome"));
			produtos.setQtd(result.getInt("qtd"));
			
			listaProdutos.add(produtos);
		}
		return listaProdutos;
	}
	

>>>>>>> 55bbe1c30dc83b3cbf3a472192ba432870660376
	
	
	public ArrayList<Produto> pesquisarProduto() throws SQLException{
		
		String sql = "SELECT * FROM produto;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		ResultSet result = statement.executeQuery();
		
		while(result.next()){
			Produto produtos = new Produto();
			
			produtos.setCod(result.getInt("cod"));
			produtos.setNome(result.getString("nome"));
			produtos.setQtd(result.getInt("qtd"));
			
			listaProdutos.add(produtos);
		}
		return listaProdutos;
	}
}
