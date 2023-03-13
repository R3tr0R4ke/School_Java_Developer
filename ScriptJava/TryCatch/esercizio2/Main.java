package School_Java_Developer.ScriptJava.TryCatch.esercizio2;

import java.util.ArrayList;

/*Creiamo una classe gestore che ci permetta di convertire una serie di variabili proprietarie di un oggetto che viene compilato dal utente e di stamparle tutte come stringhe in un unico array, 
otrechè inserirli tutti all'iterno di un specifico arraylist potendo cosi ripetere l'operazione più volte */

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<String[]> arrayList = new ArrayList<>();
        
        Macchina myObj1 = new Macchina("Pino", "Tonno", 1998);
        Gestore.aggiungiAdArrayList(myObj1, arrayList);
        
        Macchina myObj2 = new Macchina("Crispino", "Antonello", 1740);
        Gestore.aggiungiAdArrayList(myObj2, arrayList);

        Gestore.stampaArrayList(arrayList);
    }
}