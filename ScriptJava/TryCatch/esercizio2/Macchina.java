package School_Java_Developer.ScriptJava.TryCatch.esercizio2;

public class Macchina 
{
    private String nome;
    private String modello;
    private int anno;

    public Macchina (String nome, String modello, int anno)
    {
        this.nome = nome;
        this.modello = modello;
        this.anno = anno;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome ()
    {
        return nome;
    }

    public void setModello (String modello)
    {
        this.modello = modello;
    }

    public String getModello ()
    {
        return modello;
    }

    public void setAnno (int anno)
    {
        this.anno = anno;
    }

    public int getAnno ()
    {
        return anno;
    }
}