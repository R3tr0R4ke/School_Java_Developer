package School_Java_Developer.ScriptJava.Marzo2;

public class PiattoSpeciale 
{
    private static String PaninoNormale;
    private static String PaninoSesamo;

    public static double prezzoBase = 1;

    public static double prezzoNormale = 1;
    public static double prezzoSesamo = 1.5;
    public static double prezzoCarne = 3;
    public static double prezzoCarneVegana = 3;
    public static double prezzoInsalata = 2.5;
    public static double prezzoPomodori = 2;
    public static double prezzoPatatine = 2;

    public static String carne, carneVegan, insalata, pomodori, patatine;

    public PiattoSpeciale (String panino, String ingrediente1, String ingrediente2)
    {
        PiattoSpeciale.PaninoNormale = panino;
        PiattoSpeciale.PaninoSesamo = panino;

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
        PiattoSpeciale.PaninoNormale = panNormale;
    }

    public void setPaninoSesamo (String panSesamo)
    {
        PiattoSpeciale.PaninoSesamo = panSesamo;
    }
}