package cn.jiangzuo.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Common {
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	
	
	public Common() {}
	
	public Common(String address,String username,String password) {
		
		try {
			
			Class.forName("com.mysql.jc.jdbc.Driver");
			this.setConnection(DriverManager.getConnection(address, username, password));
			this.setStatement(this.getConnection().createStatement());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	public PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}
	public void setPreparedStatement(String sql) {
		try {
			this.preparedStatement = this.getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet findAll(String sql) throws Exception {
		ResultSet result=this.getStatement().executeQuery(sql);
		return result;
	}
	
	public int delete(String sql) throws Exception {
		return this.getStatement().executeUpdate(sql);
	}
	

}
