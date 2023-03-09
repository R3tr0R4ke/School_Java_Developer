package School_Java_Developer.ScriptJava.Polimorfismo.Esercizio1;

public class Ordinazione  
{
    private double prezzoPiatto;
    private double incasso;

    public Ordinazione (double prezzoPiatto)
    {
        this.prezzoPiatto = prezzoPiatto;
    }

    public void setPrezzoPiatto (double prezzo)
    {
        this.prezzoPiatto = prezzo;
    }

    public double getPrezzoPiatto()
    {
        return prezzoPiatto;
    }

    public void setIncasso(double prezzo)
    {
        this.incasso = this.incasso + prezzo;
    }

    public double getIncasso()
    {
        return incasso;
    }
}