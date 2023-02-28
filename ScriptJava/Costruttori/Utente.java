import java.util.Scanner;

public class Utente
{
    public static Scanner myNome = new Scanner(System.in);
    public static String nome;

    public static Scanner inserimentoCognome = new Scanner(System.in);
    public static String cognome;

    public static String ruolo;

    public static Boolean fine;

    public static Scanner risposta = new Scanner(System.in);
    public static String rispScelta;

    public static Utente myName = new Utente();
    public static Utente mySurname = new Utente();
    public static Utente myRole = new Utente();

    public static void main(String [] args)
    {
        Scanner userChoice = new Scanner(System.in);

        do
        {
            
            
            System.out.print("Sei un [1]CLIENTE, [2] CHEF, [3]CHEF CAPO, [4]MAGAZZINIERE? Scegli: ");
            int numChoice = userChoice.nextInt();

            switch(numChoice)
            {
                case 1:
                    cliente(1);
                break;

                case 2:
                    chef(2, 2);
                break;

                case 3:
                    chefCapo(3, 3, 3);
                break;

                case 4:
                    magazziniere(4, 4, 4, 4);
                break;
            }
            System.out.println("\nVuoi terminare? Digita 'Ok' o 'No'");
            rispScelta=risposta.nextLine();

            if (rispScelta.equalsIgnoreCase("Ok"))
            {
                fine = true;
            } 
            else if (rispScelta.equalsIgnoreCase("No")) 
            {
                for (int i = 0; i < 5; i++)
                {
                    System.out.println("Sei un [1]CLIENTE, [2] CHEF, [3]CHEF CAPO, [4]MAGAZZINIERE? Digita.");
                    numChoice=userChoice.nextInt();

                    switch(numChoice)
                    {
                        case 1:
                        cliente(1);
                        break;
                        case 2:
                        chef(2, 2);
                        break;
                        case 3:
                        chefCapo(3, 3, 3);
                        break;
                        case 4:
                        magazziniere(4, 4, 4, 4);
                        break;
                    }
                }
            }
        }
        while (fine != true);

        userChoice.close();
    }

    public static void cliente (int x)
    {
        System.out.print("\nInserisci nome: ");
        myName.nome = myNome.nextLine();

        System.out.print("Inserisci cognome: ");
        mySurname.cognome = inserimentoCognome.nextLine();

        myRole.ruolo = "Cliente";
        System.out.println("\nCodice ruolo: " + myRole.ruolo + "\nNome inserito: " + myName.nome + "\nCognome inserito: " + mySurname.cognome);
    }

    public static void chef (int x, int y)
    {
        System.out.print("\nInserisci nome: ");
        myName.nome = myNome.nextLine();

        System.out.print("Inserisci cognome: ");
        mySurname.cognome = inserimentoCognome.nextLine();

        myRole.ruolo = "Chef";
        System.out.println("\nCodice ruolo: " + myRole.ruolo + "\nNome inserito: " + myName.nome + "\nCognome inserito: " + mySurname.cognome);        
    }

    public static void chefCapo (int x, int y, int z)
    {
        System.out.print("\nInserisci nome");
        myName.nome = myNome.nextLine();

        System.out.print("\nInserisci cognome");
        mySurname.cognome = inserimentoCognome.nextLine();

        myRole.ruolo = "Chef Capo";
        System.out.println("\nCodice ruolo: " + myRole.ruolo + "\nNome inserito: " + myName.nome + "\nCognome inserito: " + mySurname.cognome);
    }

    public static void magazziniere (int x, int y, int z, int o)
    {
        System.out.print("\nInserisci nome: ");
        myName.nome = myNome.nextLine();

        System.out.print("Inserisci cognome: ");
        mySurname.cognome = inserimentoCognome.nextLine();

        myRole.ruolo = "Magazziniere";
        System.out.println("\nCodice ruolo: " + myRole.ruolo + "\nNome inserito: " + myName.nome + "\nCognome inserito: " + mySurname.cognome);
    }
}
