package School_Java_Developer.ScriptJava.Esercito;

class Soldato extends Esercito
{
    private String nome;
    private int annoNascita;
    private boolean forzaSpeciale = false;

    public Soldato( String nome, int annoNascita, boolean forzaSpeciale) 
    {
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.forzaSpeciale = forzaSpeciale;
    }

}