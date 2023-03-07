package School_Java_Developer.ScriptJava.RegistraIngressi;

import java.util.Scanner;

public class Registratore 
{
    private static int totAnimali;

    static Scanner mySceltaAnimale = new Scanner(System.in);
    static Scanner myInserimento = new Scanner(System.in);
    static Scanner myVerso = new Scanner(System.in);

    public Registratore (int totAnimali)
    {
        Registratore.totAnimali = totAnimali; 
    } 
    

    public static void stampaTotAnimali ()
    {
        System.out.println("\nI nomi dei Felini sono: " + Felini.getNomiFelini());
        System.out.println("I felini totali sono: " + Felini.getNumFelini());

        System.out.println("\nI nomi dei Canidi sono: " + Canidi.getNomiCanidi());
        System.out.println("I canidi totali sono: " + Canidi.getNumCanidi());

        System.out.println("\nI nomi degli Anfibi sono: " + Anfibi.getNomiAnfibi());
        System.out.println("Gli anfibi totali sono: " + Anfibi.getNumAnfibi());

        System.out.println("\nI nomi dei Roditori sono: " + Roditori.getNomiRoditori());
        System.out.println("I roditori totali sono: " + Roditori.getNumRoditori());

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
                stampaVersoFelino();

                Main.main(null);
            break;
            //Canidi
            case 2:
                System.out.print("\nInserisci il nome del canide: ");
                String nomeCanide = myInserimento.nextLine();
                Canidi.setNomeCanide(nomeCanide);
                Canidi.setNumCanidi();
                stampaVersoCanide();

                Main.main(null);
            break;
            //Anfibi
            case 3:
                System.out.print("\nInserisci il nome del anfibio: ");
                String nomeAnfibio = myInserimento.nextLine();
                Anfibi.setNomeAnfibio(nomeAnfibio);
                Anfibi.setNumAnfibi();
                stampaVersoAnfibio();

                Main.main(null);
            break;
            //Roditore
            case 4:
                System.out.print("\nInserisci il nome del roditore: ");
                String nomeRoditore = myInserimento.nextLine();
                Roditori.setNomeRoditore(nomeRoditore);
                Roditori.setNumRoditori();
                stampaVersoRoditore();

                Main.main(null);
            break;
            //Inserimento errato, riporto al menù principale
            default:
                System.out.println("\nInserimento erratto... Ti riporto al menù principale...");
                Main.main(null);
            break;
        } 
    }

    public static void stampaVersoAnfibio()
    {
        System.out.print("\nInserisci il verso del Anfibio: ");
        String verso = myVerso.nextLine();

        Anfibi.versoAnimale(verso);
    }

    public static void stampaVersoFelino()
    {
        System.out.print("\nInserisci il verso del Anfibio: ");
        String verso = myVerso.nextLine();

        Felini.versoAnimale(verso);
    }

    public static void stampaVersoCanide()
    {
        System.out.print("\nInserisci il verso del canide: ");
        String verso = myVerso.nextLine();

        Canidi.versoAnimale(verso);
    }

    public static void stampaVersoRoditore()
    {
        System.out.print("\nInserisci il verso del roditore: ");
        String verso = myVerso.nextLine();

        Roditori.versoAnimale(verso);
    }
}