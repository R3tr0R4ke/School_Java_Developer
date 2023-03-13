package TestMetaCorso.esercizioJava;

import java.util.Scanner;

public class Main 
{
    private static Scanner myScelta = new Scanner(System.in);
    public static void main (String [] args)
    {
        MenuPrincipale();
    }

    public static void MenuPrincipale ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
        int sceltaPrincipale = myScelta.nextInt();

        switch (sceltaPrincipale) 
        {
            //Termina programma
            case 1:
                System.out.println("\nTermino il programma...");
            break;
            //Continua programma
            case 2:
                MenuSecondario();
            break;
            //Inserimento errato
            default:
                System.out.println("\nInserimento errato...");
                MenuPrincipale();
            break;
        }
    }

    public static void MenuSecondario ()
    {
        System.out.print("\nChe operazione vuoi eseguire?\n1: Aggiungi aereo\n2: Rimuovi Aereo\n3: Vedi capacità tot\n4: Stampa Aerei posti\n5: Stampa aerei\nInserisci scelta: ");
        int sceltaSecondario = myScelta.nextInt();

        switch (sceltaSecondario) 
        {
            //Aggiungi aereo
            case 1:
                Airline.aggiungiAereo();
            break;
            //Rimuovi aereo
            case 2:
                //TODO: rimozione aereo
                System.out.println("\nAggiornamento programma coming soon...");
                MenuSecondario();
            break;
            //Capacità totale dei cargo
            case 3:
                Airline.calcoloCapacitaCargo();
            break;
            //Stampo in base alla ricerca dei posti inseriti desiderati
            case 4:
                //TODO: stampa aerei in base a quanti posti vengono inseriti in input dall'utente
                System.out.println("\nAggiornamento programma coming soon...");
                MenuSecondario();
            break;
            //Stampo la lista completa degli aerei
            case 5:
                Airline.stampaAerei();
            break;

            default:
                System.out.println("\nInserimento errato...");
                MenuSecondario();
        }
    }
}