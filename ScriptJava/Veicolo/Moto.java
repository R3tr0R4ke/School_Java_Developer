package School_Java_Developer.ScriptJava.Veicolo;

import java.util.Scanner;

public class Moto extends Veicolo 
{
    private int cilindrata;
    private String tipologia;
    private int potenza;

    private Scanner myCilindrata = new Scanner(System.in);
    private Scanner myTipologia = new Scanner(System.in);
    private Scanner myPotenza = new Scanner(System.in);

    public Moto(String marca, String modello, int annoFabbricazione, int cilindrata, String tipologia, int potenza) 
    {
        super(marca, modello, annoFabbricazione);
        this.cilindrata = cilindrata;
        this.tipologia = tipologia;
        this.potenza = potenza;
    }
    
    public void setCilindrata ()
    {
        cilindrata = myCilindrata.nextInt();
    }

    public void setTipologia ()
    {
        tipologia = myTipologia.nextLine();
    }

    public void setPotenza ()
    {
        potenza = myPotenza.nextInt();
    }

    public int getCilindrata ()
    {
        return cilindrata;
    }

    public String getTipologia ()
    {
        return tipologia;
    }

    public int getPotenza ()
    {
        return potenza;
    }
}