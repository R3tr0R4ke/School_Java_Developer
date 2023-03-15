package School_Java_Developer.ScriptJava.Utenti_interfacce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    private static Scanner myInput = new Scanner(System.in);
    private static Scanner myNomi = new Scanner(System.in);
    private static Scanner myPassword = new Scanner(System.in);

    private static ArrayList<UtenteFiglio> utentiList = new ArrayList<>();

    public static void main (String [] args)
    {
        MenuPrincipale();
    }

    public static void MenuPrincipale ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Registra\n2: Login\n3: Termina\nInserisci scelta: ");
        int sceltaPrincipale = myInput.nextInt();

        if (sceltaPrincipale == 1)
        {
            registra();            
        }
        else if (sceltaPrincipale == 2)
        {
            accedi();
        }
        else if (sceltaPrincipale < 1 || sceltaPrincipale > 2)
        {
            System.out.println("\nTermino il programma...");
        }
    }

    public static void registra ()
    {
        UtenteFiglio utenteObj = new UtenteFiglio(null, null);

        System.out.print("\nInserisci nuovo username: ");
        String nomeUser = myNomi.nextLine();
        utenteObj.setUsername(nomeUser);

        System.out.print("Inserisci nuova password: ");
        String passUser = myPassword.nextLine();
        utenteObj.setPassword(passUser);

        utenteObj.register(nomeUser, passUser);
        utentiList.add(utenteObj);

        MenuPrincipale();
    }

    public static void accedi ()
    {
        
        System.out.print("\nInserisci nome account: ");
        String nomeAccount = myNomi.nextLine();

        if (utentiList.contains(nomeAccount))
        {
            boolean passwordInserita = false;

            do
            {
                System.out.print("Inserisci password: ");
                String passwordAcount = myPassword.nextLine();

                if (utentiList.contains(passwordAcount))
                {
                    System.out.println("\nProva");
                    //TODO: IMPLEMENTAZIONE METODO CHE VERIFICA SE SEI ADMIN
                    passwordInserita = true;
                }
                else
                {
                    passwordInserita = false;
                }
            }            
            while (passwordInserita == true);
        }
        else
        {
            System.out.println("\nUtente non esistente...");
            MenuPrincipale();
        }
    }
}