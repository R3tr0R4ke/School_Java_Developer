package School_Java_Developer.ScriptJava.TryCatch.esercizio1;

import java.util.Scanner;

/*Creare una classe menu e una classe calcolatrice che permetta 3 operazioni, 
e che salvi in un array fino a 4 risultati e gestire su i suoi imput l'errore di creazione e il limite array */

public class Menu 
{
    private static final int dimArray = 4;
    private static int[] contieniRislutati = new int[dimArray];

    private static Scanner myScelta = new Scanner(System.in);
    private static Scanner myInt = new Scanner(System.in);

    private static Calcolatrice num1 = new Calcolatrice(0);
    private static Calcolatrice num2 = new Calcolatrice(0);

    private static int numero1;
    private static int numero2;

    public static void main (String [] args)
    {
        MenuPrincipale();
    }

    public static void MenuPrincipale()
    {
        System.out.print("\nCosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
        int sceltaPrima = myScelta.nextInt();

        switch (sceltaPrima) 
        {
            //Termina
            case 1:
                System.out.println("I risultati sono: " + contieniRislutati);
                System.out.println("\nTermino il programma...");
            break;
            //Continua
            case 2:
                Inserimenti();
            break;
            //Inserimento errato
            default:
                System.out.println("\nInserimento errato...");
                MenuPrincipale();
            break;
        }
    }

    public static void Inserimenti()
    {
        boolean errore = false;

        do
        {
            System.out.print("Inserire il primo numero: ");
            try 
            {
                numero1 = myInt.nextInt();
            } 
            catch (Exception e) 
            {
                System.out.println("Errore rilevato...");
                numero1 = 0;
                numero1 = myInt.nextInt();
            }
            
        }
        while (errore);
    }
}
