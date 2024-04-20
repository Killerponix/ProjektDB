import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {
    private final String host = "SimonPC";
    private final String port = "3306";
    private final String database = "belegschaft";
    private final String username = "Simon";
    private final String password = "CVH";

    private Connection con;

    public boolean isConnected() {
        return (con == null ? false : true);
    }

    public void connect() {
        if (!isConnected()) {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
                System.out.println("[MySQL] Verbunden");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                con.close();
                System.out.println("[MySQL] Verbindung Geschlossen");
            } catch (SQLException e) {
                System.out.println("rein");
                e.printStackTrace();


            }
        }
    }

    public void update(String qry) {
        try {
            Statement ps = con.createStatement();
            ResultSet res = ps.executeQuery(qry);
            int ang_nr;
            int salary;
            Date d1, d2;
            System.out.println("AngestelltenNR. " + "Gehalt" + "Von" + "Bis");
            while (res.next()) {
                ang_nr = res.getInt(1);
                salary = res.getInt(2);
                d1 = res.getDate(3);
                d2 = res.getDate(4);
                boolean exist = true;
                System.out.println(ang_nr + " " + salary + " " + d1 + " " + d2);
            }
            ;
            ps.close();
            res.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
