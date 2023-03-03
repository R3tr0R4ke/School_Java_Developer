import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

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
            String query = "select country.code, country.name as Nazione, ifnull(IndepYear, 'Non presente') as IndepYear, " //TODO: ricorda di mettere uno spazio alla fine della riga
                            + "case "  
                                + "when country.SurfaceArea > ? Then 'La superfice è maggiore di 100000' "   //Con il punto interrogativo assegno un valore che assume quando viene settato
                                + "when country.SurfaceArea = ? then 'La superfice è di 100000' " 
                                + "else 'La superfice è minore di 100000' " 
                                + "end as NazioneSuperfice " 
                            + "from world.country limit 10 ";

            PreparedStatement stmt = myConnection.prepareStatement(query);      //statment dinamica, nel caso l'utente vuole inserire un valore in una ricerca
            stmt.setInt(1, 100000);
            stmt.setInt(2, 100000);
            ResultSet rs = stmt.executeQuery();

            //Statement Stm = myConnection.createStatement();     //Statement statica, per uso di query appunto statiche
            //Risultato della query stm statica
            //ResultSet rs = Stm.executeQuery(query);

            while(rs.next())
            {
                String tableFormat = String.format("ID: %s Nazione: %s IndepYear: %s NazioneSuperfice: %s", 
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4));
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