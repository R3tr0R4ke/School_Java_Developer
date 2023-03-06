package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.ArrayList;

public class Felini 
{
    //Dichiaro private l'ArraList e il contatore in modo da poterli utilizzare solo con i getter e setter
    private static ArrayList<String> nomiFeliniList = new ArrayList<>();
    private static int numeroFelini = 0;

    static Felini felini = new Felini(null, 0);
    
    //Dichiaro il costruttore con all'interno l'arrayList che conterrà i nomi e il numero di Felini
    public Felini (ArrayList<String> nomiFeliniList, int numeroFelini)
    {
        Felini.nomiFeliniList = new ArrayList<String>();
        Felini.numeroFelini = numeroFelini;
    }

    //Setter per il nome del felino, lo inserisco tramite il parametro nome
    public static void setNomeFelino (String nome)
    {
        Felini.nomiFeliniList.add(nome);
    }

    //Ritorna il nome di tutti i felini
    public static ArrayList<String> getNomiFelini ()
    {
        return nomiFeliniList;
    }

    //Incremento il contatore dei felini
    public static void setNumFelini ()
    {
        Felini.numeroFelini++;
    }

    //Ritorno il numero dei felini quando richiamo questo metodo
    public static int getNumFelini ()
    {
        return numeroFelini;
    }
}