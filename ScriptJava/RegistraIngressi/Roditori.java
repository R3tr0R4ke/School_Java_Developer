package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.ArrayList;

public class Roditori 
{
    private static ArrayList<String> nomiRoditoriList = new ArrayList<>();
    private static int numeroRoditori = 0;

    static Roditori roditori = new Roditori(null, 0);
    
    public Roditori (ArrayList<String> nomiRoditoriList, int numeroRoditori)
    {
        Roditori.nomiRoditoriList = new ArrayList<String>();
        Roditori.numeroRoditori = numeroRoditori;
    }

    public static void setNomeRoditore (String nome)
    {
        Roditori.nomiRoditoriList.add(nome);
    }
    
    //Ritorna il nome di tutti i felini
    public static ArrayList<String> getNomiRoditori ()
    {
        return nomiRoditoriList;
    }

    public static void setNumRoditori ()
    {
        Roditori.numeroRoditori++;
    }

    public static int getNumRoditori ()
    {
        return numeroRoditori;
    }
}