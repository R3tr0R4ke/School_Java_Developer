package School_Java_Developer.ScriptJava.JDBC.EsercizioCittà;

public class Main 
{
    public static void main (String [] args)
    {
        
        ConnectionView connessione = new ConnectionView("jdbc:mysql://localhost:3306/world", "root", "root");
        
        connessione.CreaConnessione();
        
    }
}