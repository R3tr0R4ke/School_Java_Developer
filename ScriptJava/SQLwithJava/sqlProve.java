import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlProve {

    public static void main (String [] args)
    {
        //-----------------------------TEST JDBC-----------------------------
        String url = "jdbc:mysql://localhost:3306/world";
        //Driver li prende in automatico DriverManager
        //String driver = "com.mysql.jdbc.Driver";      //nome del driver di MySql ovvero il connector

        //Dichiaro la connessione
        //Connection myConnection = null;    
        //Si potrebbe utilizzare anche questo sotto ma meglio farlo in un try catch 
        //DriverManager.getConnection(url, user:"root", password:"root");

        try
        {
            Connection myConnection = null;
            myConnection = DriverManager.getConnection(url, "root", "root");
        
            if(myConnection == null)
            {
                System.out.println("Connessione non stabilita");
            }
            else
            {
                System.out.println("Connessione avvenuta con successo");
            }
            //Prova query in db world
            String query = "SELECT * FROM city LIMIT 5";
            Statement Stm = myConnection.createStatement();
            ResultSet rs = Stm.executeQuery(query);

            while(rs.next())
            {
                
                String tableFormat = String.format("ID: %s Name: %s CountryCode: %s District: %s Population: %s", 
                rs.getString(1),
                rs.getString(2),
                rs.getString(3), 
                rs.getString(4),
                rs.getString(5));
                System.out.println(tableFormat);

                /*
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
                System.out.print(rs.getString(4));
                System.out.print(rs.getString(5 + "\n"));
                */
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //-----------------------------FINE TEST JDBC-----------------------------

    }
}