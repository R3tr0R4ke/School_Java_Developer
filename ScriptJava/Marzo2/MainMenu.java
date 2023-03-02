package School_Java_Developer.ScriptJava.Marzo2;

import java.util.Scanner;

public class MainMenu
{
    private static Scanner myInput = new Scanner(System.in);

    private static double spesaTot;
    private static double spesaPanino;

    private static PiattoSpeciale panino = new PiattoSpeciale(null, null, null);

    public static void main (String [] args)
    {
        System.out.println("\nBenvenuto/a nel menù. Assembla il tuo panino qui");

        MenuPrincipale();
    }

    public static void MenuPrincipale ()
    {
        System.out.print("\nScegli che tipo di panino vuoi...\n1: Normale\n2: Sesamo\nInserisci scelta: ");
        int sceltaPanino = myInput.nextInt();

        switch (sceltaPanino) 
        {
            //Normale
            case 1:
                panino.setPaninoNormale("Normale");
                spesaPanino = panino.prezzoBase + panino.prezzoNormale;
                //System.out.println(spesaTot);
                //System.out.print(panino.getPaninoNormale());
                MenuIngredienti1();
            break;
            //Sesamo
            case 2:
                panino.setPaninoSesamo("Sesamo");
                spesaPanino = panino.prezzoBase + panino.prezzoSesamo;
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
                spesaPanino = spesaPanino + panino.prezzoCarne;
                //System.out.println(spesaTot);
                //System.out.print(panino.carne);
                MenuIngredienti2();
            break;

            case 2:
                panino.carneVegan = "Carne Vegana";
                spesaPanino = spesaPanino + panino.prezzoCarneVegana;
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
                spesaPanino = spesaPanino + panino.prezzoInsalata;
                //System.out.println(spesaTot);
                StampaRiassunto();
            break;
        
            case 2:
                panino.pomodori = "Pomodori";
                spesaPanino = spesaPanino + panino.prezzoPomodori;
                StampaRiassunto();
            break;

            case 3:
                panino.patatine = "Patatine";
                spesaPanino = spesaPanino + panino.prezzoPatatine;
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
        System.out.println("\nIl tuo panino è stato assemblato.\nIl prezzo del tuo panino è di: " + spesaPanino);
        spesaTot = spesaTot + spesaPanino;
        System.out.println("\nLa spesa totale del cliente è di: " + spesaTot);

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
                spesaPanino = 0;
                MenuPrincipale();
            break;

            default:
                System.out.println("Inserimento errato...");
                StampaRiassunto();
            break;
        }
    }
}