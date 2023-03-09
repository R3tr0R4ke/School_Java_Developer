package School_Java_Developer.ScriptJava.Polimorfismo.Esercizio1;

import java.util.ArrayList;

public class Menu 
{
    ArrayList<Piatto> piattiSalvati = new ArrayList<>();
    
    public void setPiatti (ArrayList<Piatto> piattiSalvati)
    {
        this.piattiSalvati = piattiSalvati;
    }

    public ArrayList<Piatto> getPiatti()
    {
        return piattiSalvati;   
    }

    public void setPiatto(Piatto piatto)
    {
        this.piattiSalvati.add(piatto);
    }

    public Piatto getPiatto(int index)
    {
        return piattiSalvati.get(index);
    }
    
    public void stampaMenu ()
    {
        for (int i = 0; i < piattiSalvati.size(); i++)
        {
            System.out.println("Num Piatto: " + (i+1) + "\t|\tNome: " + piattiSalvati.get(i).getNomePiatto() + "\t|\tPrezzo: " + piattiSalvati.get(i). getPrezzoPiatto() + "\t|\tChef: " + piattiSalvati.get(i).getNomeChef());
        }
    }
}