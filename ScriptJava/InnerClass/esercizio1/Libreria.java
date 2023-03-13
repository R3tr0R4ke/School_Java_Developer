package School_Java_Developer.ScriptJava.InnerClass.esercizio1;

import java.util.ArrayList;

public class Libreria 
{
    private int numeroLibri;
    private ArrayList<Libro> libri;
    
    //Costruttore libreria
    public Libreria (int numLibri)
    {
        this.numeroLibri = numLibri;
        this.libri = new ArrayList<>();
    }

    public void addLibro (String tipo)
    {
        Libro libro = new Libro(tipo);
        libri.add(libro);
        numeroLibri++;
    }

    public void setNumLibri (int numeroLibri)
    {
        this.numeroLibri = numeroLibri;
    }

    public int getNumLibri()
    {
        return numeroLibri;
    }

    public void setLibri(ArrayList<Libro> libri)
    {
        this.libri = libri;
    }

    public ArrayList<Libro> getLibri()
    {
        return libri;
    }

    public class Libro
    {
        private String genere;

        //Costruttore
        public Libro (String genere)
        {
            this.genere = genere;
        }

        public void setGenere (String genere)
        {
            this.genere = genere;
        }

        public String getGenere ()
        {
            return genere;
        }
    }
}