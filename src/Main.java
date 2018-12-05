import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;
      
import database.DBConnection;
import database.RAF;

public class Main {
	
	public Main() {
		new InitialScreen();
	}
//	private static boolean netIsAvailable() {
//	    try {
//	        final URL url = new URL("http://www.google.com");
//	        final URLConnection conn = url.openConnection();
//	        conn.connect();
//	        conn.getInputStream().close();
//	        return true;
//	    } catch (MalformedURLException e) {
//	        throw new RuntimeException(e);
//	    } catch (IOException e) {
//	        return false;
//	    }
//	}
//	
//	public Main() {
//		//new SummaryMenu();
//		
//		if(netIsAvailable())
//		{
//			JOptionPane.showMessageDialog(null, "CONNECTION SUCCESSFULL");
//		}
//		else
//		{
//			int input = JOptionPane.showOptionDialog(null, "NETWORK CONNECTION FAILED", "Status", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
//		
//			switch(input) 
//			{
//			case JOptionPane.OK_OPTION:
//				System.out.println("OKOKOKOKOKOKOK");
//				break;
//			case JOptionPane.CANCEL_OPTION:
//				System.out.println("CANCEL");
//				break;
//			}
//		}
//		
		//RANDOM ACCESS FILE
//		RAF raf = new RAF();
//		raf.writeToFile(RAF.FILE_PATH, "Heyyy tayoo!!\n", 2);
//		
//		byte[] data = raf.readFromFile(RAF.FILE_PATH, 0, 100);
//		System.out.println(new String(data));
		
		
		
//		DBConnection con = new DBConnection();
//		
//		//INSERT
//		//String queryInsert = "INSERT INTO master_client VALUES('Bob','Jalan Buntu','8787864','Shirt')";
//		//con.executeQuery(queryInsert);
//		
//		
//		//DELETE
//		//String queryDelete = "DELETE FROM master_client WHERE name = 'Kevin'";
//		//con.executeQuery(queryDelete);
//		
//		
//		//UPDATE
//		String queryUpdate = "UPDATE master_client SET address = 'Simprug' WHERE name = 'Bob'";
//		con.executeQuery(queryUpdate);
//		
//		
//		//SELECT (GET DATA)
//		String query = "SELECT * FROM master_client";
//		
//		ResultSet result = con.executeGet(query);
//		try {
//			while(result.next()) 
//			{
//				System.out.println(result.getString("name"));
//				System.out.println(result.getString("address"));
//				System.out.println(result.getString("phone"));
//				System.out.println(result.getString("item_ordered"));
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	

	public static void main(String[] args) {
		new Main();
	}

}
