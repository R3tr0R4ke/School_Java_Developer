package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.ArrayList;

public class Canidi 
{
    private static ArrayList<String> nomiCanidiList = new ArrayList<>();
    private static int numeroCanidi = 0;

    static Canidi canidi = new Canidi(null, 0);
    
    public Canidi (ArrayList<String> nomiCanidiList, int numeroCanidi)
    {
        Canidi.nomiCanidiList = new ArrayList<String>();
        Canidi.numeroCanidi = numeroCanidi;
    }

    public static void setNomeCanide (String nome)
    {
        Canidi.nomiCanidiList.add(nome);
    }
    //Ritorna il nome di un singolo felino a dato indice
    public static String getNomeCanide (int index)
    {
        return nomiCanidiList.get(index);
    }
    //Ritorna il nome di tutti i felini
    public static ArrayList<String> getNomiCanidi ()
    {
        return nomiCanidiList;
    }

    public static void setNumCanidi ()
    {
        Canidi.numeroCanidi++;
    }

    public static int getNumCanidi ()
    {
        return numeroCanidi;
    }
}
