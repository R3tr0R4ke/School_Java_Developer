package School_Java_Developer.ScriptJava.Persone;

import java.util.Scanner;

public class Persona 
{
    private String nome;
    private static String saluto = "Ciao";

    private Scanner myNome = new Scanner(System.in);

    public Persona (String nome)
    {
        this.nome = nome;
    }

    public void setNome()
    {
        nome = myNome.nextLine();
    }

    public String getNome()
    {
        return nome;
    }

    public String getSaluto()
    {
        return saluto;
    }
}