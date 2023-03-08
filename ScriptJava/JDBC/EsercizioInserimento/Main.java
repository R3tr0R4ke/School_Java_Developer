package School_Java_Developer.ScriptJava.JDBC.EsercizioInserimento;

/*Esercizio:
Aggiungere tramite JDBC 10 città italiane non presenti nella tabella city di world con anche inserendo i corrispettivi dati. 
Da svolgere senza le query ma usando i metodi del ResultSet (JDBC). */

public class Main 
{
    public static void main (String [] args)
    {
        ConnectionView connessione = new ConnectionView("jdbc:mysql://localhost:3306/world", "root", "root");
        
        connessione.CreaConnessione();
    }
}