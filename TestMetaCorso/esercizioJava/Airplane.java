package TestMetaCorso.esercizioJava;

public class Airplane 
{
    private String nomeArereo;
    private int numPosti;
    private int capacitaCarico;

    public Airplane (String nomeAereo, int numPosti, int capacitaCarico)
    {
        this.nomeArereo = nomeAereo;
        this.numPosti = numPosti;
        this.capacitaCarico = capacitaCarico;
    }

    public void setNomeAereo(String nome)
    {
        this.nomeArereo = nome;
    }

    public String getNomeAereo ()
    {
            return nomeArereo;
    }

    public void setNumPosti(int numPosti)
    {
        this.numPosti = numPosti;
    }

    public int getNumPosti ()
    {
            return numPosti;
    }

    public void setCapacitaAereo (int capacita)
    {
        this.capacitaCarico = capacita;
    }

    public int getCapacitaAereo ()
    {
            return capacitaCarico;
    }
}