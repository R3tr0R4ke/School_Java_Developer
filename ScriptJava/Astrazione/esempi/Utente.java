package RepoGithub.School_Java_Developer.ScriptJava.Astrazione.esempi;

class Utente 
{    
    private int anniExp;
    private String nome;
    private String cognome;
    private int eta;

    public Utente (int anniExp, String nome, String cognome, int eta)
    {
        this.anniExp = anniExp;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public void setAnniExp(int anniExp) 
    {
        this.anniExp = anniExp;
    }

    public int getAnniExp() 
    {
        return anniExp;
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }
    
    public void setCognome(String cognome) 
    {
        this.cognome = cognome;
    }

    public String getCognome() 
    {
        return cognome;
    }
    
    public void setEta(int eta) 
    {
        this.eta = eta;
    }

    public int getEta() 
    {
        return eta;
    }
}