package DBS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class MySQL {
	private static final String host = "SimonPC";
	private static final String port = "3306";
	private static final String database = "belegschaft";
	private static final String username = "Simon";
	private static final String password = "CVH";
	
	private static Connection con;
	
	public static boolean isConnected() {
		return (con == null ? false : true);
	}
	public static void connect() throws ClassNotFoundException {
		if(!isConnected()) {
			try {
				
			Class.forName("com.mysql.cj.jdbc.driver");
			
				con = DriverManager.getConnection("jdbc:mysql://" + host + ":"+port+"/"+database, username, password);
				System.out.println("[MySQL] Verbunden");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void disconnect() {
		if(isConnected()) {
			try {
				con.close();
				System.out.println("[MySQL] Verbindung Geschlossen");
			} catch (SQLException e) {
				e.printStackTrace();
			
			}
		}
	}
	public static void update(String qry) {
		try {
			PreparedStatement ps = con.prepareStatement(qry);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
}
