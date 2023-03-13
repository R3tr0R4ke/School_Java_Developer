package School_Java_Developer.ScriptJava.InnerClass.esercizio1;

import java.util.Scanner;

public class Main 
{
    private static Scanner myScelta = new Scanner(System.in);
    private static Scanner myString = new Scanner(System.in);

    private static Utente nuovoUtente = new Utente(null, null, 0);

    public static void main (String [] args)
    {
        MenuPrincipale();
    }

    public static void MenuPrincipale ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
        int scelta1 = myScelta.nextInt();

        switch (scelta1) 
        {
            //Termina
            case 1:
                System.out.print("\nTermino il programma...");  
            break;
            //Continua
            case 2:
                
            break;
            //Inserimento errato
            default:
                System.out.println("\nInserimento errato...");
                MenuPrincipale();
            break;
        }
    }

    public static void registraUtente()
    {
        

        System.out.print("\nInserisci nome utente: ");
        String nomeUtente = myString.nextLine();
        nuovoUtente.setNomeUtente(nomeUtente);

        System.out.print("Inserisci password: ");
        String passwordUtente = myString.nextLine();
        nuovoUtente.setPassword(passwordUtente);

        nuovoUtente.setId(1);
    }

    public static void loginUtente ()
    {
        System.out.print("\nInserisci nome utente: ");
        String nomeLogin = myString.nextLine();

        if (nomeLogin.equals(nuovoUtente.getNomeUtente()))
        {
            System.out.print("\nInserisci password utente: ");
            String passwordLogin = myString.nextLine();

            if (passwordLogin.equals(nuovoUtente.getPassword()))
            {
                MenuSecondario();
            }
            else
            {
                System.out.println("Password errata...\nTorno al menu");
                MenuPrincipale();
            }
        }
        else
        {
            System.out.println("\nNome utente errato...\nTorno al menu...");
            MenuPrincipale();
        }
    }

    public static void MenuSecondario ()
    {
        System.out.print("Cosa vuoi fare?\n1: Prendi libro\n2: Indietro\nInserisci scelta");
    }
}