import java.util.Scanner;

public class AccountSystem 
{
    public static Scanner myNome = new Scanner(System.in);
    public static String nomeUtente;
    
    public static Scanner myCognome = new Scanner(System.in);
    public static String cognomeUtente;

    public static Scanner myEta = new Scanner(System.in);
    public static Integer eta;

    public static Scanner myData = new Scanner(System.in);
    public static String dataNascita;

    public static Scanner myPasswd = new Scanner(System.in);    //Scanner per l'utilizzo di password
    public static String password;          //Password da inserire alla crezione
    public static String confPasswd;        //Variabile per la conferma della creazione password
    public static boolean checkPass1 = false;   //booleano per il metodo InserisciPassword()
    public static boolean passInserita = false; //booleano per metodo InserisciPassword()

    //Scanner e variabile per la risposta alla richiesta della modifica dati
    public static Scanner myRisposta = new Scanner(System.in);
    public static String risposta;

    public static Scanner myNewPw = new Scanner(System.in);
    public static String passwordModifica; //Password richiesta quando si vogliono modificare i dati
    public static boolean datiModificati = false;

    public static boolean datiInseriti = false;

    public static void main (String [] args)
    {
        do
        {
            InserimentoDati();
        }
        while (datiInseriti == false);

        if(datiInseriti = true)
        {
            System.out.print("Imposta una password per il tuo account: ");
            InserisciPassword();
        }

        System.out.println("Vuoi modificare i dati inseriti? (s / n): ");
        risposta = myRisposta.nextLine();

        if (risposta.equals("s") || risposta.equals("S"))
        {
            ModificaDati();
        }
        else if (risposta.equals("n") || risposta.equals("N"))
        {
            System.out.println("I dati sono stati salvati, stampa dei dati in corso...");
            System.out.println("Dati modificati con successo!!!");
            System.out.println("Nome: " + nomeUtente);
            System.out.println("Cognome: " + cognomeUtente);
            System.out.println("Età: " + eta);
            System.out.println("Data di nascita: " + dataNascita);
        }
        else
        {
            System.out.println("Input errrato. Inserisci s o n");
        }

        nomeUtente = null;
        password = null;
        dataNascita = null;
        eta = null;
    }


    static void InserimentoDati ()
    {
        System.out.print("Inserisci il nome: ");
        nomeUtente = myNome.nextLine();
        System.out.print("Inserisci il cognome: ");
        cognomeUtente = myCognome.nextLine();
        System.out.print("Inserisci il età: ");
        eta = myEta.nextInt();
        System.out.print("Inserisci la data di nascita (Dd/Mm/Yy): ");
        dataNascita = myData.nextLine();

        datiInseriti = true;
    }

    static void InserisciPassword ()
    {
        password = myPasswd.nextLine();
        System.out.print("Conferma la password inserita: ");
        confPasswd = myPasswd.nextLine();
        
        if (confPasswd.equals(password))
        {
            System.out.println("Password inserita con successo");
            checkPass1 = true;
        }
        while (checkPass1 == false)
        {
            System.out.print("Password errata, reinserire password: ");
            InserisciPassword();
        }
        passInserita = true;
    }

    static void ModificaDati ()
    {
        int i = 0;
        while (passInserita == true && i != 1)
        {
            System.out.print("Inserisci la password dell'account per procedere alla modifica: ");
            passwordModifica = myNewPw.nextLine();
            if (passwordModifica.equals(password))
            {
                do
                {
                    InserimentoDati();
                    datiModificati = true;
                }
                while(datiModificati == false);
                System.out.println("Dati modificati con successo!!!");
                System.out.println("Nome: " + nomeUtente);
                System.out.println("Cognome: " + cognomeUtente);
                System.out.println("Età: " + eta);
                System.out.println("Data di nascita: " + dataNascita);
                passInserita = false;
            }
            else
            {
                System.out.println("WRONG PASSWORD!!!");
                i++;
            }
        }
    }
}