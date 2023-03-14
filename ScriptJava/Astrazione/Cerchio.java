package School_Java_Developer.ScriptJava.Astrazione;

class Cerchio extends Shape
{
    //Variabile utile per il calcolo di area e circoferenza del cerchio
    private double raggio;

    public Cerchio (double raggio)
    {
        this.raggio = raggio;
    }

    @Override
    double getArea() 
    {
        //Calcolo dell'area 
        return Math.PI * raggio * raggio;
    }

    @Override
    double getPerimetro() 
    {
        //Calcolo del perimetro
        return Math.PI * raggio * 2;
    }
}   