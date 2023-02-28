public class Utenti 
{
    public static String nomeUtente;
    public static double budgetUtente;
    public static int numAcquisti;
    public static double spesaTotCliente;

    public Utenti (String nome, double budget, int acquisti, double spesaCliente)
    {
        nomeUtente = nome;
        budgetUtente = budget;
        numAcquisti = acquisti;
        spesaTotCliente = spesaCliente;
    }

    public static double creaBudget ()
    {
        return budgetUtente =  (Math.random() * 50);
    }
}
