package TestMetaCorso.esercizioJava;

public class PassengerPlane extends Airplane
{
    private int numServizi;

    public PassengerPlane(String nomeAereo, int numPosti, int capacitaCarico, int numServizi) 
    {
        super(nomeAereo, numPosti, capacitaCarico);
        this.numServizi = numServizi;
    }
    
    public void setServiziDispo (int numServizi)
    {
        this.numServizi = numServizi;
    }

    public int getServiziDispo ()
    {
        return numServizi;
    }

    // Metodo toString()
    public String toStringPassenger() 
    {
        return "Passenger [ Nome: " + getNomeAereo() + " | Num Posti: " + getNumPosti() + " | Capacita Carico: " + getCapacitaAereo() + " | Num servizi: " + getServiziDispo() + " ]";
    }
}
