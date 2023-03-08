package School_Java_Developer.ScriptJava.Persone;

public class Pirata extends Persona
{
    private String salutoPirata;

    public Pirata(String nome, String salutoPirata) 
    {
        super(nome);
        this.salutoPirata = salutoPirata;
    }
    
    public void setSalutoPirata ()
    {
        salutoPirata = "Voglio un po di rum";
    }

    public String getSalutoPirata ()
    {
        return salutoPirata;
    }
}