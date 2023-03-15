package School_Java_Developer.ScriptJava.Esercito;

import java.util.ArrayList;

public class Esercito 
{
    private int numeroSoldati;
    private ArrayList<Soldato> soldatiList;

    public Esercito ()
    {
        this.numeroSoldati = 0;
        this.soldatiList = new ArrayList<>();
    }

    public void aggiungiSoldato (String nome, String annoNascita, boolean apparteForSpec)
    {
        Soldato soldatoObj;
        if (apparteForSpec == true)
        {
            soldatoObj = new SoldatoSpeciale(nome, annoNascita);
        }
        else
        {
            soldatoObj = new Soldato(nome, annoNascita);
        }
        soldatiList.add(soldatoObj);
        numeroSoldati++;
    }

    public int getNumeroSoldati ()
    {
        return numeroSoldati;
    }

    public ArrayList<Soldato> getSoldati ()
    {
        return this.soldatiList;
    }
}