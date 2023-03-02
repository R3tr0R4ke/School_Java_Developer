package School_Java_Developer.ScriptJava.Marzo2;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

public class MainMenu
{
    private static Scanner myInput = new Scanner(System.in);

    private static double spesaTot;

    private static PiattoSpeciale panino = new PiattoSpeciale(null, null, null);

    public static void main (String [] args)
    {
        MenuPrincipale();
    }

    public static void MenuPrincipale ()
    {
        System.out.println("\nBenvenuto/a nel menù. Assembla il tuo panino qui");

        System.out.print("\nScegli che tipo di panino vuoi...\n1: Normale\n2: Sesamo\nInserisci scelta: ");
        int sceltaPanino = myInput.nextInt();

        switch (sceltaPanino) 
        {
            //Normale
            case 1:
                panino.setPaninoNormale("Normale");
                spesaTot = panino.prezzoBase + panino.prezzoNormale;
                //System.out.println(spesaTot);
                //System.out.print(panino.getPaninoNormale());
                MenuIngredienti1();
            break;
            //Sesamo
            case 2:
                panino.setPaninoSesamo("Sesamo");
                spesaTot = panino.prezzoBase + panino.prezzoSesamo;
                //System.out.println(spesaTot);
                //System.out.println(panino.getPaninoSesamo());
                MenuIngredienti1();
            break;
            //Inserimento errato
            default:
                System.out.print("Inserimento errato...");
                MenuPrincipale();
            break;
        }
    }

    

    public static void MenuIngredienti1 ()
    {
        System.out.print("\nScegli tra...\n1: Carne\n2: Carne Vegana\nInserisci scelta: ");
        int sceltaIngrPrimo = myInput.nextInt();

        switch (sceltaIngrPrimo) 
        {
            //Carne
            case 1:
                panino.carne = "Carne";
                spesaTot = spesaTot + panino.prezzoCarne;
                //System.out.println(spesaTot);
                //System.out.print(panino.carne);
                MenuIngredienti2();
            break;

            case 2:
                panino.carneVegan = "Carne Vegana";
                spesaTot = spesaTot + panino.prezzoCarneVegana;
                MenuIngredienti2();
            default:
                System.out.println("Inserimento errato...");
                MenuIngredienti1();
            break;
        }
    }

    public static void MenuIngredienti2 ()
    {
        System.out.print("\nScegli tra...\n1: Insalata\n2: Pomodori\n3: Patatine\nInserisci scelta: ");
        int sceltaIngrSecodno = myInput.nextInt();

        switch (sceltaIngrSecodno) 
        {
            case 1:
                panino.insalata = "Insalata";
                spesaTot = spesaTot + panino.prezzoInsalata;
                //System.out.println(spesaTot);
                StampaRiassunto();
            break;
        
            case 2:
                panino.pomodori = "Pomodori";
                spesaTot = spesaTot + panino.prezzoPomodori;
                StampaRiassunto();
            break;

            case 3:
                panino.patatine = "Patatine";
                spesaTot = spesaTot + panino.prezzoPatatine;
                StampaRiassunto();
            break;

            default:
                System.out.println("Inserimento errato...");
                MenuIngredienti2();
            break;
        }
    }

    public static void StampaRiassunto ()
    {
        System.out.println("\nIl tuo panino è stato assemblato.\nIl prezzo del tuo panino è di: " + spesaTot);

        System.out.print("\nCosa vuoi fare?\n1: Termina programma\n2: Continua\nInserisci scelta: ");
        int sceltaFinale = myInput.nextInt();

        switch (sceltaFinale) 
        {
            case 1:
                System.out.println("\nBUONA GIORNATA!!!");
            break;
        
            case 2:
                System.out.println("\nTorno al menu principale...");
                //TODO: RESETTA SPESA PANINO E LASCIA SPESATOT
                //TODO: esempio per una spesa singola di reset panino spesaTot = 0;
                MenuPrincipale();
            break;

            default:
                System.out.println("Inserimento errato...");
                StampaRiassunto();
            break;
        }
    }
}