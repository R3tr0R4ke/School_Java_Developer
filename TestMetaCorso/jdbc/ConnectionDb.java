package TestMetaCorso.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Scanner;

public class ConnectionDb 
{
    private String myUrl;
    private String myUser;
    private String myPassword;

    private Scanner myScanner = new Scanner(System.in);
    private Scanner myInt = new Scanner(System.in);
    private Scanner myScelta = new Scanner(System.in);

    public ConnectionDb(String url, String user, String password) {
        myUrl = url;
        myUser = user;
        myPassword = password;
    }

    public Connection CreaConnessione() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(myUrl, myUser, myPassword);

            System.out.println(conn == null ? "Connessione non riuscita\n" : "Connessione avvenuta\n" );
            
            //Tabella autori
            String table1 = 
                            "create table Autori " + 
                            "(NomePk varchar(30), " +
                            "AnnoNascita year not null, " +
                            "AnnoMorte year, " +
                            "Nazione varchar(30) not null, " +
                            "primary key (NomePk))";
            Statement stm1 = conn.createStatement();    //Statement statico tabella autori
            stm1.executeUpdate(table1);
            System.out.println("Creazione della tabella Autori");

            //tabella libri
            String table2 = 
                            "create table Libro " +
                            "(Titolo varchar(250) not null, " +
                            "AutoreFk varchar(30), " +
                            "AnnoPubblicazione year not null, " +
                            "primary key (Titolo), " +
                            "foreign key (AutoreFk) references autori (NomePk));";
            Statement stm2 = conn.createStatement();
            stm2.executeUpdate(table2);
            System.out.println("Creazione delle tabella libri");

            //Query che visualizza la tabella autory dal db biblioteca
            String inseriAutori = "SELECT * FROM biblioteca.autori;";
            //Dichiaro e Setto lo statement
            PreparedStatement stmAutori = conn.prepareStatement(inseriAutori, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rsAutori = stmAutori.executeQuery(inseriAutori);

            boolean terminaInserimentoAutori = false;

            do
            {
                System.out.print("\nInserisci nome autore: ");
                String nomeAutore = myScanner.nextLine();
            
                boolean nomeEsistente = false;
                rsAutori.beforeFirst();

                while (rsAutori.next())
                {
                    String nomeVisto = rsAutori.getString("NomePk");

                    //Controllo che il nome (+ eventuale congome) non sia stato già inserito
                    if (nomeVisto.equalsIgnoreCase(nomeAutore))
                    {
                        nomeEsistente = true;
                        break;
                    } 
                }

                if (nomeEsistente)
                {
                    System.out.println("\nL'autore esiste già nella tabella");
                }
                else
                {
                    System.out.print("\nInserisci anno di nascita: ");
                    int annoNascita = myInt.nextInt();
                    System.out.print("\nInserisci anno di morte: ");
                    int annoMorte = myInt.nextInt();
                    System.out.print("\nInserisci nazione autore: ");
                    String nazione = myScanner.nextLine();

                    //Aggiungi i valori alla tabella Autori del db "biblioteca"
                    rsAutori.moveToInsertRow();
                    rsAutori.updateString("NomePk", nomeAutore);
                    rsAutori.updateInt("AnnoNascita", annoNascita);
                    rsAutori.updateInt("AnnoMorte", annoMorte);
                    rsAutori.updateString("Nazione", nazione);
                    rsAutori.insertRow();
                    rsAutori.moveToCurrentRow();

                    System.out.println("Autore/trice aggiunto!!!.");
                }

                System.out.print("\nVuoi inserire un altro autore? (si /no): ");
                String sceltaAutore = myScelta.nextLine();

                if (sceltaAutore.equalsIgnoreCase("Si"))
                {
                    terminaInserimentoAutori = false;
                }
                else if (sceltaAutore.equalsIgnoreCase("No"))
                {
                    terminaInserimentoAutori = true;
                }
            }
            while (terminaInserimentoAutori == false);

            //Query che visualizza la tabella autory dal db biblioteca
            String inseriLibri = "SELECT * FROM biblioteca.libro;";
            //Dichiaro e Setto lo statement
            PreparedStatement stmLibri = conn.prepareStatement(inseriLibri, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rsLibri = stmLibri.executeQuery(inseriLibri);

            boolean terminaInserimentoLibri = false;

            do
            {
                System.out.print("\nInserisci nome libro: ");
                String nomeLibro = myScanner.nextLine();
            
                boolean libroEsistente = false;
                rsAutori.beforeFirst();

                while (rsLibri.next())
                {
                    String libroVisto = rsLibri.getString("Titolo");

                    //Controllo che il nome (+ eventuale congome) non sia stato già inserito
                    if (libroVisto.equalsIgnoreCase(nomeLibro))
                    {
                        libroEsistente = true;
                        break;
                    } 
                }

                if (libroEsistente)
                {
                    System.out.println("\nIl libro esiste già nella tabella");
                }
                else
                {
                    System.out.print("\nInserisci autore: ");
                    String auotoreLibro = myScanner.nextLine();
                    System.out.print("\nInserisci anno publicazione: ");
                    int annoPublicazione = myInt.nextInt();

                    //Aggiungi i valori alla tabella Autori del db "biblioteca"
                    rsLibri.moveToInsertRow();
                    rsLibri.updateString("Titolo", nomeLibro);
                    rsLibri.updateString("AutoreFk", auotoreLibro);
                    rsLibri.updateInt("AnnoPubblicazione", annoPublicazione);
                    rsLibri.insertRow();
                    rsLibri.moveToCurrentRow();
                }

                System.out.print("\nVuoi inserire un altro libro? (si /no): ");
                String sceltaLibro = myScelta.nextLine();

                if (sceltaLibro.equalsIgnoreCase("Si"))
                {
                    terminaInserimentoLibri = false;
                }
                else if (sceltaLibro.equalsIgnoreCase("No"))
                {
                    terminaInserimentoLibri = true;
                }
            }
            while (terminaInserimentoLibri == false);

            System.out.print("Cosa vuoi fare?\n1: Stampa Autori\n2: Stampa Libri\nInserisci scelta: ");
            int sceltaStampa = myInt.nextInt();

            
            if (sceltaStampa == 1)
            {
                //Statement stmtStampa = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                //ResultSet.CONCUR_UPDATABLE);
                //String queryAutori = "Select NomePk from Autori;";
                //ResultSet rsStampaAutori = stmtStampa.executeQuery(queryAutori);
                //TODO: FINIRE STAMPA AUTORI
            }
            else if (sceltaStampa == 2)
            {
                //TODO: FINIRE STAMPA LIBRI
            }
            
            return conn;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}