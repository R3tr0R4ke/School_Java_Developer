package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.Scanner;

public class Main 
{
    private static Scanner myInput = new Scanner(System.in);

    static boolean termina = false;
    
    public static void main (String [] args)
    {
        do 
        {
            System.out.print("\nCosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
            int sceltaMenuPinrcipale = myInput.nextInt();

            switch (sceltaMenuPinrcipale) 
            {
                case 1:
                    Registratore.stampaTotAnimali();
                    termina = true;
                break;
            
                case 2:
                    Registratore.inserisciAnimali();
                break;
            
                default:
                    System.out.println("\nInserimento errato...");
                    termina = false;
                break;
            }
        }
        while (!termina);
    }
}