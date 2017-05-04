package edu.univas.si4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.univas.si4.entity.Order;

public class OrderDAO {

	private Connection connection;
	
	public OrderDAO() throws DAOException {
		connection = ConnectionFactory.createConnection();
	}
	
	public OrderDAO(Connection connection) {
		this.connection = connection;
	}
	
	private int nextCode() throws DAOException {
		try {
			String sql = "SELECT nextval('seq_pedido')";
			ResultSet result = connection.createStatement().executeQuery(sql);

			if(result.next()) {
				return result.getInt(1);
			}
			
			throw new DAOException("N�o foi poss�vel pegar o valor da sequ�ncia");
		} catch (SQLException exception) {
			throw new DAOException(exception);
		}
	}
	
	public void insert(Order order) throws DAOException {
		try {
			// Buscando o pr�ximo valor da sequ�ncia e atribuindo ao objeto
			order.setCode(nextCode());
			
			String sql = "INSERT INTO pedido (cod, data) VALUES (?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, order.getCode());
			statement.setTimestamp(2, new java.sql.Timestamp(order.getRegisterDate().getTime()));
			
			statement.executeUpdate();
		} catch (SQLException exception) {
			throw new DAOException(exception);
		}
	}
	
}
