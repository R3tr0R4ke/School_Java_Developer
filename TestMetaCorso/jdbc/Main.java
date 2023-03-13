package TestMetaCorso.jdbc;


/*Sfruttando JDBC creare uno script JAVA che vada a creare 
il database “biblioteca” inserendo le tabelle con i vincoli 
recuperati dallo schema relazionale creato in precedenza nel punto a. */

public class Main 
{
    public static void main (String [] args)
    {
        ConnectionDb connessione = new ConnectionDb("jdbc:mysql://localhost:3306/biblioteca", "root", "root");
        
        connessione.CreaConnessione();
    }
}