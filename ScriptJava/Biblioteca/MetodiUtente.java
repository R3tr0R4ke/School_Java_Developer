package School_Java_Developer.ScriptJava.Biblioteca;

import java.util.Scanner;

public class MetodiUtente 
{
    private static Scanner myInput = new Scanner(System.in);
    private static Scanner myRegLog = new Scanner(System.in);
    private static Scanner myPassword = new Scanner(System.in);

    public static void cercaAccount ()
    {
        System.out.print("\nInserisci nome account: ");
        String nomeCercato = myInput.nextLine();
        boolean trovatoUtente = Utente.cercaNomeUtente(Main.utenteObj, nomeCercato);
        
        if (trovatoUtente) 
        {
            
            boolean loginSuccess = false;
            int tentativiPassword = 3;
            do 
            {
                System.out.print("Inserisci password utente: ");
                String passwordCercato = myPassword.nextLine();
                boolean trovatoPassword = Utente.cercaPasswordUtente(Main.utenteObj, passwordCercato);

                if (trovatoPassword)
                {
                    System.out.print("\nLOGIN AVVENUTO CON SUCCESSO");
                    //Chiedi se sei admin richiamando il metodo dalla classe MetodiAdmin
                    MetodiAdmin.adminCheck();
                    loginSuccess = true;
                }
                else
                {
                    System.out.println("Password non corretta! Reinserire password corretta: ");
                    tentativiPassword--;
                }
            }
            while(!loginSuccess && tentativiPassword != 0);
        } 
        else 
        {
            System.out.println("Nome non trovato! Reinserire nome account corretto: "); 
            cercaAccount();
        }
    }

    public static void menuRegLogin ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Registrati\n2: Login\n3: Termina\nInserisci scelta: ");
        int primaScelta = myRegLog.nextInt();
        //Registro l'utente
        if (primaScelta == 1)
        {
            Utente.InserisciNome(Main.utenteObj);
            Utente.InserisciPassword(Main.utenteObj);
            menuRegLogin();
        }
        else if (primaScelta == 2)
        {
            MetodiUtente.cercaAccount();
        }
        else if (primaScelta == 3)
        {
            System.out.println("\nTERMINO IL PROGRAMMA...");    
        }
        else if (primaScelta > 3 || primaScelta < 1)
        {
            System.out.println("\nInserimento erratto...");
            menuRegLogin();
        }
    } 
}