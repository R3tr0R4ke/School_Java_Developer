package School_Java_Developer.ScriptJava.Esercito;

abstract class ForzeSpeciali 
{
    private String specializzazione;

    //Riporta i gradi speciali del soldato, non lo usiamo per ora
    public void gradiSpeciali()
    {

    }

    public int getAnnoInizio (int annoInizio)
    {
        return annoInizio;
    }

    public void setSpecializazzione (String specialità)
    {
        this.specializzazione = specialità;
    }

    public String getSpecializazzione ()
    {
        return specializzazione;
    }
}