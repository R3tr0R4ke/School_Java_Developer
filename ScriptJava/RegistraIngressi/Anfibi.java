package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.ArrayList;

public class Anfibi 
{
    private static ArrayList<String> nomiAnfibiList = new ArrayList<>();
    private static int numeroAnfibi = 0;

    static Anfibi anfibi = new Anfibi(null, 0);
    
    public Anfibi (ArrayList<String> nomiAnfibiList, int numeroAnfibi)
    {
        Anfibi.nomiAnfibiList = new ArrayList<String>();
        Anfibi.numeroAnfibi = numeroAnfibi;
    }

    public static void setNomeAnfibio (String nome)
    {
        Anfibi.nomiAnfibiList.add(nome);
    }
    //Ritorna il nome di un singolo felino a dato indice
    public static String getNomeAnfibio (int index)
    {
        return nomiAnfibiList.get(index);
    }
    //Ritorna il nome di tutti i felini
    public static ArrayList<String> getNomiAnfibi ()
    {
        return nomiAnfibiList;
    }

    public static void setNumAnfibi ()
    {
        Anfibi.numeroAnfibi++;
    }

    public static int getNumAnfibi ()
    {
        return numeroAnfibi;
    }    
}
