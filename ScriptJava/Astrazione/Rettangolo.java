package School_Java_Developer.ScriptJava.Astrazione;

class Rettangolo extends Shape
{
    //Variabili utili per il calcolo di area e perimetro del rettangolo
    private double base;
    private double altezza;

    public Rettangolo (double base, double altezza)
    {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    double getArea() 
    {
        //Calcolo dell'area
        return base * altezza;
    }

    @Override
    double getPerimetro() 
    {
        //Calcolo della base
        return (base + altezza) * 2;
    }
    
}
