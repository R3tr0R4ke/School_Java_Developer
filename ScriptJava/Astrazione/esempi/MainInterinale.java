package RepoGithub.School_Java_Developer.ScriptJava.Astrazione.esempi;

import java.util.ArrayList;
import java.util.Scanner;

public class MainInterinale 
{
    private static Scanner myInt = new Scanner(System.in);
    private static Scanner myNomi = new Scanner(System.in);

    private static ArrayList<Utente> utentiList = new ArrayList<>();
    private static ArrayList<PosizioneLavoro> posizioniList = new ArrayList<>();   

    public static void main (String [] args)
    {
        MenuPrincipale();
    }

    public static void MenuPrincipale ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
        int sceltaPrincipale = myInt.nextInt();

        if (sceltaPrincipale == 1)
        {
            System.out.println("\nTermino il programma...");
        }
        else if (sceltaPrincipale == 2)
        {
            Registrazione();
        }
        else if (sceltaPrincipale < 1 || sceltaPrincipale > 2)
        {
            System.out.println("\nInserimento errato...");
            MenuPrincipale();
        }
    }

    public static void Registrazione ()
    {
        Utente utenteObj = new Utente(0, null, null, 0);

        System.out.print("\nInserisci nome utente: ");
        String nomeUtente = myNomi.nextLine();
        utenteObj.setNome(nomeUtente);

        System.out.print("Inserisci cognome utente: ");
        String cognomeUtente = myNomi.nextLine();
        utenteObj.setCognome(cognomeUtente);

        System.out.print("Inserisci età: ");
        int etaUtente = myInt.nextInt();
        utenteObj.setEta(etaUtente);

        System.out.print("Inserisci anni esperienza: ");
        int anniExpUtente = myInt.nextInt();
        utenteObj.setAnniExp(anniExpUtente);

        utentiList.add(utenteObj);

        System.out.print("\nSei admin? (si / no): ");
        String sceltaAdmin = myNomi.nextLine();

        if (sceltaAdmin.equalsIgnoreCase("Si"))
        {
            InserimentoPassword();
        }
        else if (sceltaAdmin.equalsIgnoreCase("No"))
        {
            MenuUtente();
        }
    }

    public static void InserimentoPassword ()
    {
        System.out.print("\nInserisci password: ");
        String passInserita = myNomi.nextLine();
        String passCheck = Admin.getPassword();

        if (passInserita.equals(passCheck))
        {
            MenuAdmin();
        }
        else
        {
            System.out.println("\nPassword errata, non sei un admin...");
            MenuUtente();
        }
    }

    public static void MenuAdmin ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Crea posizione\n2: Esci\nInserisci scelta: ");
        int sceltaMenuAdmin = myInt.nextInt();

        if (sceltaMenuAdmin == 1)
        {
            boolean termina = false;
 
            do
            {
                System.out.print("\nInserisci nome posizione: ");
                String nomePosizione = myNomi.nextLine();

                System.out.print("Inserisci durata posizione: ");
                int durataPosizione = myInt.nextInt();

                PosizioneLavoro posizioneObj = Admin.creaPosizioneLavoro(nomePosizione, durataPosizione);

                posizioniList.add(posizioneObj);

                System.out.print("\nVuoi inserire un'altra posizione? (si / no)\nInserisci scelta: ");
                String scelta = myNomi.nextLine();

                if (scelta.equalsIgnoreCase("Si"))
                {
                    termina = false;
                }
                else if (scelta.equalsIgnoreCase("No"))
                {
                    termina = true;
                }
            }
            while (termina == false);

            MenuAdmin();
        }
        else if (sceltaMenuAdmin == 2)
        {
            System.out.println("\nTorno indietro...");
            MenuPrincipale();
        }
        else if (sceltaMenuAdmin < 1 || sceltaMenuAdmin > 2)
        {
            System.out.println("\nInserimento errato...");
            MenuAdmin();
        }
    }

    public static void MenuUtente ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Vedi lavoro\n2: Vedi durata lavoro\n3: Esci\nInserisci scelta: ");
        int sceltaUtente = myInt.nextInt();

        if (sceltaUtente == 1)
        {
            //TODO: CREA ARRAYLIST POSIZIONI LAVORO E STAMPALO
            for(PosizioneLavoro nomeLavoro : posizioniList)
            {
                System.out.println("\nNome posizione di lavoro: " + ((PosizioneLavoro) posizioniList).getNomeLavoro());
            }
            
            MenuUtente();
        }
        else if (sceltaUtente == 2)
        {
            //TODO: CREA ARRAYLIST POSIZIONI LAVORO E STAMPALO
            for(PosizioneLavoro durataLavoro : posizioniList)
            {
                System.out.println("\nNome posizione di lavoro: " + ((PosizioneLavoro) posizioniList).getDurataLavoro());
            }
            MenuUtente();
        }
        else if (sceltaUtente == 3)
        {
            System.out.println("\nTorno indietro...");
            MenuPrincipale();
        }
        else if (sceltaUtente < 1 || sceltaUtente > 3)
        {
            System.out.println("\nInserimento errato...");
            MenuUtente();
        }
    }
}