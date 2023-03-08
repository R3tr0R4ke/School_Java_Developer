package School_Java_Developer.ScriptJava.JDBC.EsercizioCittà;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ConnectionView 
{
    private String myUrl;
    private String myUser;
    private String myPassword;

    public ConnectionView(String url, String user, String password) {
        myUrl = url;
        myUser = user;
        myPassword = password;
    }

    public Connection CreaConnessione() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);

            System.out.println(conn == null ? "Connessione non riuscita\n" : "Connessione avvenuta\n" );

            String query = "SELECT * FROM world.citta_italiane_view ";
            PreparedStatement stm = conn.prepareStatement(
                query,
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(query);

            //Recupero i metadati
            ResultSetMetaData metaData = rs.getMetaData();
            int numColonne = metaData.getColumnCount();

            //Stampo i dati della view
            while(rs.next())
            {
                for (int i = 1; i <= numColonne; i++)
                {
                    Object value = rs.getObject(i);
                    String nomeColonna = metaData.getColumnName(i);
                    String tipoColonna = metaData.getColumnTypeName(i);

                    System.out.println(nomeColonna + " (" + tipoColonna + "): " + value);
                }
                System.out.print("\n");
            }

            return conn;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}