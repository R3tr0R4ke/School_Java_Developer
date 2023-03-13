package TestMetaCorso.esercizioJava;

public class CargoPlane extends Airplane
{
    private int caricoExtra;

    public CargoPlane(String nomeAereo, int numPosti, int capacitaCarico, int caricoExtra) 
    {
        super(nomeAereo, numPosti, capacitaCarico);
        this.caricoExtra = caricoExtra;
    }
    
    public void setCaricoExtra (int carico)
    {
        this.caricoExtra = carico;
    }

    public int getCaricoExtra ()
    {
        return caricoExtra;
    }

    // Metodo toString()
    public String toStringCargo() 
    {
        return "Passenger [ Nome: " + getNomeAereo() + " | Num Posti: " + getNumPosti() + " | Capacita Carico: " + getCapacitaAereo() + " | Cap Extra: " + getCaricoExtra() + " ]";
    }
}