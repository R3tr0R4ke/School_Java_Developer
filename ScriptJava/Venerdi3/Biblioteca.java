package School_Java_Developer.ScriptJava.Venerdi3;

import java.util.Scanner;

public class Biblioteca {
    
    private String nomeLibro;
    
    public int numCopie;

    public int copiePrestate;

    private Scanner input = new Scanner(System.in);

    public Biblioteca (String nome, int numCopie, int copiePrestate)
    {
        this.nomeLibro = nome;
        this.numCopie = numCopie;
        this.copiePrestate = copiePrestate;
    }

    public void setLibro (String nomeLibro)
    {
        this.nomeLibro = nomeLibro;
    }

    public String getLibro ()
    {
        return nomeLibro;
    }

    public void setNomeLibro ()
    {
        nomeLibro = input.nextLine();
    }

    public void setDisponibilita ()
    {
        numCopie = input.nextInt();
    }

    public void prestaLibro ()
    {
        numCopie --;
        copiePrestate ++;
    }

    public void rimuoviLibro ()
    {
        nomeLibro = null;
        numCopie = 0;
        copiePrestate = 0;
    }
}