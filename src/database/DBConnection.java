package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//HOW TO CONNECT TO MYSQL DATABASE
public class DBConnection {

	private static final String DATABASE_URL = "jdbc:mysql://kev-1.duckdns.org:3306/";
	private static final String DATABASE_NAME = "myjoeshop";
	private static final String USERNAME = "myjoeshop";
	private static final String PASSWORD = "#MyJoeShop123";
	
	Connection con;
	Statement st;
	
	public DBConnection() 
	{
		
		String dbPath = DATABASE_URL + DATABASE_NAME;
		try {
			con = DriverManager.getConnection(dbPath,USERNAME,PASSWORD);
			st = con.createStatement(1004,1008);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//DML = DATA MANIPULATION LANGUAGE (INSERT / UPDATE / DELETE)
	public void executeQuery(String query) 
	{
		try {
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//GET DATA
	public ResultSet executeGet(String query) 
	{
		ResultSet rs;
		
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return rs;
		
	}
}
