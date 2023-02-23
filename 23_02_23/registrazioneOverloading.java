import java.util.Scanner;

public class registrazioneOverloading 
{
    //Variabili per i livelli dell'utente
    public static String Livello1 = "Utente normale";
    public static String Livello2 = "Admin";
    public static String Livello3 = "CAPO";
    //TODO: modifica il programma in modo da poter riloggare e provare a loggare da capo, può essercene solo uno
    public static int capo = 1;

    public static void main(String [] args)
    {
        //Chiamo il metodo menù
        menuPrincipale();
    }

    public static void menuPrincipale()
    {
        //Scanner per la prima scelta
        Scanner myScelta = new Scanner(System.in);

        System.out.print("Cosa vuoi fare?\n1: Registrati\n2: Esci\nInserisci scelta: ");
        int scelta = myScelta.nextInt();
        //Scanner per gli input
        Scanner myInput = new Scanner(System.in);

        switch (scelta) 
        {
            //Registrati
            case 1:
                System.out.print("\nInserisci nome utente: ");
                String nomeUt = myInput.nextLine();
                
                System.out.print("Inserisci password: ");
                String password = myInput.nextLine();

                registra(nomeUt, password);
            break;
            //Termina
            case 2:
                System.out.print("\nTermino il programma...\n");
            break;
            //Inserimento sbagliato
            default:
                System.out.println("\nInserimento errato...\n");
                menuPrincipale();
            break;
        }
        //Chiudo gli scanner
        myInput.close();
        myScelta.close();
    }

    //Utente normale
    public static void registra(String nome, String psw)
    {
        Scanner myPSW = new Scanner(System.in);
        //Se la password inserita ha almeno 4 caratteri
        if (psw.length() >= 4)
        {
            System.out.print("\nCiao " + nome + "\n");
            //Richiedo di inserire la password admin
            System.out.print("Inserisci la password admin: ");
            String passwordAdmin = myPSW.nextLine();
            //Richiamo il metodo tramite overloading
            registra(nome, psw, passwordAdmin);
        }
        //Altrimenti se la password non ha più di 4 caratteri
        else
        {
            System.out.println("\nLa password deve essere più lunga di 4 caratteri...\nRitorno al menù...\n");
            menuPrincipale();
        }
        myPSW.close();
    }

    //Admin
    public static void registra(String nome, String psw, String pswAdmin)
    {
        Scanner myPsw2 = new Scanner(System.in);
        //Se la password è uguale ad "admin123"
        if (pswAdmin.equals("admin123"))
        {
            System.out.println("\nCiao ADMIN\n");
            //Inserisco la passwordCapo
            System.out.print("Inserisci password: ");
            String passwordCapo = myPsw2.nextLine();
            //Chiamo il metodo tramite overloading
            registra(nome, pswAdmin, pswAdmin, passwordCapo);
        }
        //Altrimenti se la password non è uguale ad "admin123"
        else
        {
            System.out.print("\nLa password inserita non è corretta, hai i seguenti privilegi: " + Livello1);
        }
        myPsw2.close();
    }

    //Metodo capo
    public static void registra(String nome, String psw, String pswAdmin, String pswCapo)
    {
        Scanner myPsw3 = new Scanner(System.in);
        //Se la password è uguale ad "test123"
        if (pswCapo.equals("test123"))
        {
            System.out.println("\nCiao" + Livello3 + "\n");
        }
        //Altrimenti se la password non è uguale ad "test123"
        else
        {
            System.out.print("\nLa password inserita non è corretta, hai i seguenti privilegi: " + Livello2);
        }
        myPsw3.close();
    }
}
