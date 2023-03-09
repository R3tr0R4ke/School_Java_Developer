package School_Java_Developer.ScriptJava.Polimorfismo.Esercizio1;

public class Piatto extends Ordinazione 
{
    private String nomePiatto;
    private String chef;

    public Piatto(String nomePiatto, double prezzoPiatto, String chef) 
    {
        super(prezzoPiatto);
        this.nomePiatto = nomePiatto;
        this.chef = chef;
    }

    public void setNomePiatto (String nome)
    {
        this.nomePiatto = nome;
    }
    
    public String getNomePiatto()
    {
        return nomePiatto;
    }

    public void setNomeChef(String nomeChef)
    {
        this.chef = nomeChef;
    }

    public String getNomeChef ()
    {
        return chef;
    }
}