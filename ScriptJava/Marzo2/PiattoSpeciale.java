package School_Java_Developer.ScriptJava.Marzo2;

public class PiattoSpeciale 
{
    private String PaninoNormale;
    private String PaninoSesamo;

    public double prezzoBase = 1;

    public double prezzoNormale = 1;
    public double prezzoSesamo = 1.5;
    public double prezzoCarne = 3;
    public double prezzoCarneVegana = 3;
    public double prezzoInsalata = 2.5;
    public double prezzoPomodori = 2;
    public double prezzoPatatine = 2;

    public String carne, carneVegan, insalata, pomodori, patatine;

    public PiattoSpeciale (String panino, String ingrediente1, String ingrediente2)
    {
        this.PaninoNormale = panino;
        this.PaninoSesamo = panino;

        this.carne = ingrediente1;
        this.carneVegan = ingrediente1;

        this.insalata = ingrediente2;
        this.pomodori = ingrediente2;
        this.patatine = ingrediente2;
    }

    public String getPaninoNormale()
    {
        return PaninoNormale;
    }

    public String getPaninoSesamo()
    {
        return PaninoSesamo;
    }

    public void setPaninoNormale(String panNormale)
    {
        this.PaninoNormale = panNormale;
    }

    public void setPaninoSesamo (String panSesamo)
    {
        this.PaninoSesamo = panSesamo;
    }
}