package Esercizio010323;

import java.util.Random;
import java.util.UUID;

public class Utente 
{
    private static String nomeUtente;
    private static String passwordUtente; 
    private static double budgetUtente;
    private UUID id;

    public Utente (String nome, String password)
    {
        this.nomeUtente = nome;
        this.passwordUtente = password;
        this.id = UUID.randomUUID();
        this.budgetUtente = generaBudget();
    }

    public String getNomeUtente () 
    {
        return nomeUtente;
    }

    public boolean verificaPassword (String password) 
    {
        return this.passwordUtente.equals(password);
    }

    public double generaBudget()
    {
        Random rand = new Random();
        return rand.nextDouble() * 100;
    }    
}


