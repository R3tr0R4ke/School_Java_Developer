package School_Java_Developer.ScriptJava.TryCatch.esercizio1;


public class Calcolatrice 
{
    private int primoNumero;
    private int secondoNumero;
    private int sommaNumeri;
    private int sottraiNumeri;
    private int dividiNumeri;

    public Calcolatrice (int numero)
    {
        this.primoNumero = numero;
        this.secondoNumero = numero;
    }

    public void setPrimoNumero (int numero)
    {
        primoNumero = numero;
    }

    public int getNumPrimo ()
    {
        return primoNumero;
    }

    public void setSecondoNumero (int numero)
    {
        secondoNumero = numero;
    }

    public int getNumSecondo ()
    {
        return secondoNumero;
    }

    public void setSomma(int x, int y)
    {
        sommaNumeri = x + y;
    }

    public int getSomma ()
    {
        return sommaNumeri;
    }

    public void setSottrazione (int x, int y)
    {
        sottraiNumeri = x - y;
    }

    public int getSottrazione ()
    {
        return sottraiNumeri;
    }

    public void setDivisione (int x, int y)
    {
        dividiNumeri = x / y;
    }
    
    public int getDivisione ()
    {
        return dividiNumeri;
    }
}
