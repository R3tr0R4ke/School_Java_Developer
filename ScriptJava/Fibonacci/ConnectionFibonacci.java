import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class ConnectionFibonacci {
    // TODO: Singleton

    // Connessione db fibonacci
    // URL database fibonacci
    // Driver manager
    // Password database
    // Statement statico con query
    // Esecuzione query con risultato
    // Funzione che collega con il MainFibonacci

    private String myUrl;
    private String myUser;
    private String myPassword;

    public ConnectionFibonacci(String url, String user, String password) {
        myUrl = url;
        myUser = user;
        myPassword = password;
    }

    public Connection CreaConnessione() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);

            System.out.println(conn == null ? "Connessione non riuscita" : "Connessione avvenuta" );

            return conn;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}