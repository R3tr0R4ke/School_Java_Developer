package School_Java_Developer.ScriptJava.Veicolo;

import java.util.Scanner;

public class Veicolo 
{
    private String marca;
    private String modello;
    private int annoFabbricazione;

    private  Scanner myScannerString = new Scanner(System.in);
    private  Scanner myScannerInt = new Scanner(System.in);

    public Veicolo (String marca, String modello, int annoFabbricazione)
    {
        this.marca = marca;
        this.modello = modello;
        this.annoFabbricazione = annoFabbricazione;
    }

    public void setMarca ()
    {
        marca = myScannerString.nextLine();
    }

    public void setModello ()
    {
        modello = myScannerString.nextLine();
    }

    public void setAnnoFabricazione ()
    {
        annoFabbricazione = myScannerInt.nextInt();
    }

    public String getMarca ()
    {
        return marca;
    }

    public String getModello ()
    {
        return modello;
    }

    public int getAnno ()
    {
        return annoFabbricazione;
    }
}