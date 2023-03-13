package School_Java_Developer.ScriptJava.TryCatch.esercizio2;

import java.util.ArrayList;

public class Gestore 
{
    //Metodo che aggiunge i valori di un array in un arrayList
    public static void aggiungiAdArrayList(Object obj, ArrayList<String[]> arrayList) 
    {
        String[] array = convertiInArray(obj);
        if (array != null) 
        {
            arrayList.add(array);
        }
    }
    //Inserisco i valori di un oggetto in un array
    public static String [] convertiInArray(Object obj)
    {
        String[] array = null;

        Macchina macchinaObj = (Macchina) obj;
        
        array = new String[3];
        array[0] = "Nome: " + macchinaObj.getNome();
        array[1] = "Modello: " + macchinaObj.getModello();
        array[2] = "Anno: " + macchinaObj.getAnno();
        
        return array;
    }
    //Metodo utilizzato in stampaArraList
    public static void stampaArray(String[] array) 
    {
        if (array != null) 
        {
            for (String str : array) 
            {
                System.out.println(str);
            }
        }
    }
    //Mi stampa gli arrayList con i valori convertiti in String
    public static void stampaArrayList(ArrayList<String[]> arrayList) 
    {
        for (String[] array : arrayList) 
        {
            stampaArray(array);
            System.out.print("\n");
        }
    }
    //Metodo che converte un intero in stringa utilizzando i wrapper
    public static String intToString(int value) 
    {
        return Integer.toString(value);
    }
}