package School_Java_Developer.ScriptJava.Veicolo;

import java.util.Scanner;

public class Main 
{
    
    static Auto autoObj1 = new Auto(null, null, 0, 0, null, 0);
    static Auto autoObj2 = new Auto(null, null, 0, 0, null, 0);

    static Moto motoObj1 = new Moto(null, null, 0, 0, null, 0);
    static Moto motoObj2 = new Moto(null, null, 0, 0, null, 0);

    private static Scanner myMenu = new Scanner(System.in);
    private static Scanner myDecisioni = new Scanner(System.in);

    public static void main (String [] args)
    {
        menuPrincipale();
    }

    public static void menuPrincipale ()
    {
        System.out.print("Cosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
        int sceltaMenuPrinc = myMenu.nextInt();

        if (sceltaMenuPrinc == 1)
        {
            stampaVeicoli();
            System.out.println("\nTermino il programma...");
        }
        else if (sceltaMenuPrinc == 2)
        {
            menuInserimenti();
        }
        else if (sceltaMenuPrinc > 2 || sceltaMenuPrinc < 1)
        {
            System.out.println("\nInserimento errato...");
            menuPrincipale();
        }
    }

    public static void menuInserimenti ()
    {
        System.out.print("\nCosa vuoi inserire?\n1: Auto\n2: Moto\nInserisci scelta: ");
        int sceltaVeicolo = myMenu.nextInt();

        if (sceltaVeicolo == 1)
        {
            inserisciAuto1();
            System.out.print("Vuoi inserire un'altra auto? (si / no): ");
            String decisioneAuto = myDecisioni.nextLine();

            if (decisioneAuto.equalsIgnoreCase("Si"))
            {
                inserisciAuto2();
            }
            else if (decisioneAuto.equalsIgnoreCase("No"))
            {
                System.out.println("\nTorno al menù principale...");
                menuPrincipale();
            }
        }
        else if (sceltaVeicolo == 2)
        {
            inserisciMoto1();

            System.out.print("\nVuoi inserire un'altra moto? (si / no): ");
            String decisioneMoto = myDecisioni.nextLine();

            if (decisioneMoto.equalsIgnoreCase("Si"))
            {
                inserisciMoto2();
            }
            else if (decisioneMoto.equalsIgnoreCase("No"))
            {
                System.out.println("\nTorno al menù principale...");
                menuPrincipale();
            }
        }
        else if (sceltaVeicolo > 2 || sceltaVeicolo < 1)
        {
            System.out.println("\nInserimento errato...");
            menuInserimenti();
        }
    }

    public static void inserisciAuto1 ()
    {
        System.out.print("\nInserisci marca: ");
        autoObj1.setMarca();
        System.out.print("Inserisci modello: ");
        autoObj1.setModello();
        System.out.print("Inserisci anno fabricazione: ");
        autoObj1.setAnnoFabricazione();
        System.out.print("Inserisci numero porte: ");
        autoObj1.setNumPorte();
        System.out.print("Inserisci tipo Carburante: ");
        autoObj1.setCarburante();
        System.out.print("Inserisci consumo medio: ");
        autoObj1.setConsumo();
    }

    public static void inserisciAuto2 ()
    {
        System.out.print("\nInserisci marca: ");
        autoObj2.setMarca();        
        System.out.print("Inserisci modello: ");
        autoObj2.setModello();
        System.out.print("Inserisci anno fabricazione: ");
        autoObj2.setAnnoFabricazione();
        System.out.print("Inserisci numero porte: ");
        autoObj2.setNumPorte();
        System.out.print("Inserisci tipo Carburante: ");
        autoObj2.setCarburante();
        System.out.print("Inserisci consumo medio: ");
        autoObj2.setConsumo();
        menuPrincipale();
    }

    public static void inserisciMoto1 ()
    {
        System.out.print("\nInserisci marca: ");
        motoObj1.setMarca();
        System.out.print("Inserisci modello: ");
        motoObj1.setModello();
        System.out.print("Inserisci anno fabricazione: ");
        motoObj1.setAnnoFabricazione();
        System.out.print("Inserisci numero porte: ");
        motoObj1.setCilindrata();
        System.out.print("Inserisci tipo Carburante: ");
        motoObj1.setTipologia();
        System.out.print("Inserisci consumo medio: ");
        motoObj1.setPotenza();
    }

    public static void inserisciMoto2 ()
    {
        System.out.print("\nInserisci marca: ");
        motoObj2.setMarca();
        System.out.print("Inserisci modello: ");
        motoObj2.setModello();
        System.out.print("Inserisci anno fabricazione: ");
        motoObj2.setAnnoFabricazione();
        System.out.print("Inserisci numero porte: ");
        motoObj2.setCilindrata();
        System.out.print("Inserisci tipo Carburante: ");
        motoObj2.setTipologia();
        System.out.print("Inserisci consumo medio: ");
        motoObj2.setPotenza();
        menuPrincipale();
    }

    public static void stampaVeicoli()
    {
        System.out.println("\nCaratteristiche primo veicolo:\nMarca: " + autoObj1.getMarca() + "\nModello: " + autoObj1.getModello() + "\nAnno: " + autoObj1.getAnno() + "\nPorte: " + autoObj1.getNumPorte() + "\nTipo Carburante: " + autoObj1.getTipoCarburante() + "Consumo Medio: " + autoObj1.getConsumoMedio());
        System.out.println("\nCaratteristiche primo veicolo:\nMarca: " + autoObj2.getMarca() + "\nModello: " + autoObj2.getModello() + "\nAnno: " + autoObj2.getAnno() + "\nPorte: " + autoObj2.getNumPorte() + "\nTipo Carburante: " + autoObj2.getTipoCarburante() + "Consumo Medio: " + autoObj2.getConsumoMedio());

        System.out.println("\nCaratteristiche primo veicolo:\nMarca: " + motoObj1.getMarca() + "\nModello: " + motoObj1.getModello() + "\nAnno: " + motoObj1.getAnno() + "\nCilindrata: " + motoObj1.getCilindrata() + "\nTipologia: " + motoObj1.getTipologia() + "Potenza: " + motoObj1.getPotenza());
        System.out.println("\nCaratteristiche primo veicolo:\nMarca: " + motoObj2.getMarca() + "\nModello: " + motoObj2.getModello() + "\nAnno: " + motoObj2.getAnno() + "\nCilindrata: " + motoObj2.getCilindrata() + "\nTipologia: " + motoObj2.getTipologia() + "Potenza: " + motoObj2.getPotenza());
    }
}