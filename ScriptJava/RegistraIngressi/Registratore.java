package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.Scanner;

public class Registratore 
{
    private static int totAnimali;

    static Scanner mySceltaAnimale = new Scanner(System.in);
    static Scanner myInserimento = new Scanner(System.in);

    public Registratore (int totAnimali)
    {
        Registratore.totAnimali = totAnimali; 
    } 
    

    public static void stampaTotAnimali ()
    {
        totAnimali = Felini.getNumFelini() + Canidi.getNumCanidi() + Anfibi.getNumAnfibi() + Roditori.getNumRoditori();
        System.out.println("\nIl numero totale di animali è: " + totAnimali);
    }

    public static void inserisciAnimali()
    {
        System.out.print("\nChe animale vuoi inserire?\n1: Felini\n2: Canidi\n3: Anfibi\n4: Roditori\nInserisci scelta: ");
        int sceltaAnimale = mySceltaAnimale.nextInt();

        switch (sceltaAnimale) 
        {
            //Felini
            case 1:
                System.out.print("\nInserisci il nome del felino: ");
                String nomeFelino = myInserimento.nextLine();

                Felini.setNomeFelino(nomeFelino);
                Felini.setNumFelini();
                Main.main(null);
            break;
            //Canidi
            case 2:
                System.out.print("\nInserisci il nome del canide: ");
                String nomeCanide = myInserimento.nextLine();
                Felini.setNomeFelino(nomeCanide);
                Felini.setNumFelini();
                Main.main(null);
            break;
            //Anfibi
            case 3:
                System.out.print("\nInserisci il nome del anfibio: ");
                String nomeAnfibio = myInserimento.nextLine();
                Felini.setNomeFelino(nomeAnfibio);
                Felini.setNumFelini();
                Main.main(null);
            break;
            //Roditore
            case 4:
                System.out.print("\nInserisci il nome del roditore: ");
                String nomeRoditore = myInserimento.nextLine();
                Felini.setNomeFelino(nomeRoditore);
                Felini.setNumFelini();
                Main.main(null);
            break;
            //Inserimento errato, riporto al menù principale
            default:
                System.out.println("\nInserimento erratto... Ti riporto al menù principale...");
                Main.main(null);
            break;
        } 
    }
}