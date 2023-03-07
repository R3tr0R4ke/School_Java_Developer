package School_Java_Developer.ScriptJava.Veicolo;

import java.util.Scanner;

public class Auto extends Veicolo
{
    private int numPorte;
    private String tipoCarburante;
    private int consumoMedioCarbu;

    private Scanner myPorte = new Scanner(System.in);
    private Scanner myCarburante = new Scanner(System.in);
    private Scanner myConsumo = new Scanner(System.in);

    public Auto(String marca, String modello, int annoFabbricazione, int numPorte, String tipoCarburante, int consumoMedioCarbu) 
    {
        super(marca, modello, annoFabbricazione);
        this.numPorte = numPorte;
        this.tipoCarburante = tipoCarburante;
        this.consumoMedioCarbu = consumoMedioCarbu;
    }
    
    public void setNumPorte ()
    {
        numPorte = myPorte.nextInt();
    }

    public void setCarburante ()
    {
        tipoCarburante = myCarburante.nextLine();
    }

    public void setConsumo ()
    {
        consumoMedioCarbu = myConsumo.nextInt();
    }

    public int getNumPorte ()
    {
        return numPorte;
    }

    public String getTipoCarburante ()
    {
        return tipoCarburante;
    }

    public int getConsumoMedio ()
    {
        return consumoMedioCarbu;
    }
}
