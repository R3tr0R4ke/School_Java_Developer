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
                    System.out.println("\nI nomi dei Felini sono: " + Felini.getNomiFelini());
                    System.out.println("I felini totali sono: " + Felini.getNumFelini());

                    System.out.println("\nI nomi dei Canidi sono: " + Canidi.getNomiCanidi());
                    System.out.println("I canidi totali sono: " + Canidi.getNumCanidi());

                    System.out.println("\nI nomi degli Anfibi sono: " + Anfibi.getNomiAnfibi());
                    System.out.println("Gli anfibi totali sono: " + Anfibi.getNumAnfibi());

                    System.out.println("\nI nomi dei Roditori sono: " + Roditori.getNomiRoditori());
                    System.out.println("I roditori totali sono: " + Roditori.getNumRoditori());

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