import java.util.ArrayList;
import java.util.Scanner;

public class Utente 
{
    //Variabili per inserire i nomi utenti e raltive password negli ArrayList
    public static String nome;
    public static String password;
    //ArraList relativi ai nomi utenti e password
    public static ArrayList<String> utentiList = new ArrayList<>();
    public static ArrayList<String> passwordList = new ArrayList<>();

    //Dichiaro gli scanner per gli inserimenti in input 
    static Scanner myNome = new Scanner(System.in);
    static Scanner myPassword = new Scanner(System.in);
    static Scanner myScelta = new Scanner(System.in);

    public static void main (String [] args)
    {
        //Richiamo il metodo per eseguire i primi inserimenti di nome e password e navigare nel menu tramite ricorsione
        inserimenti();
        //Chiudo gli scanner
        myNome.close();
        myPassword.close();
        myScelta.close();
    }
    //Metodo per inserire nomi e password nei rispettivi arrayList
    public static void inserimenti ()
    {
        //Richiedo di inserire il nome in input
        System.out.print("Inserire nome: ");
        Utente.nome = myNome.nextLine();
        //Richiedo di inserire la password in input
        System.out.print("Inserire password: ");
        Utente.password = myPassword.nextLine();
        //Aggiungo il nome inserito in input nell'arrayList utentiList
        utentiList.add(Utente.nome);
        //Aggiungo la password inserita in input nell'arraList passwordList
        passwordList.add(Utente.password);
        //Richiamo il metodo per andare al menu per terminare o continuare il programma
        sceltaMenu();
    }
    //Metodo per la navigazione nel menù che termina o continua il programma
    public static void sceltaMenu()
    {
        System.out.print("\nVuoi continuare a inserire dati?\n1: Continua\n2: Termina\nInserisci scelta: ");
        int scelta = myScelta.nextInt();

        switch (scelta) 
        {
            //Continua programma
            case 1:
                System.out.println("\nContinuo il programma...\n");
                //Ritorno all'inizio del ciclo do-while
                inserimenti();
                break;
            //Termina programma
            case 2:
                //Richiamo il metodo per stampare tutti i nomi utente e password inserite
                stampaAccount();
                System.out.println("\nTermino il programma...\n");
            break;
            //Inserimento scelta in input errato
            default:
                System.out.println("\nInserimento errato...\n");
                sceltaMenu();
            break;
        }
    }
    //Metodo per stampare tutti i nomi e le password acocunt inserite
    public static void stampaAccount ()
    {
        //Per ogni nome presente nell'arraList utentList
        for (String nome : utentiList)
        {
            //Stampo il nome
            System.out.println("\nNome account: " + nome);
            //Per ogni password presente
            for (String password : passwordList)
            {
                System.out.println("Password account: " + password);
            }
        }
    }

}
