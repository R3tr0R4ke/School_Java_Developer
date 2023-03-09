package School_Java_Developer.ScriptJava.Polimorfismo.Esercizio1;

/*Andiamo a creare una classe MENU che può creare vari oggetti che sono definiti come piatti con tre ARGOMENTI l'uno ( Ingredienti, Prezzo, Chef ).
Andiamo a creare una classe ORDINAZIONE che può diventare qualsiasi tipo di piatto, 
ma con la sola caratteristica del prezzo del piatto per creare un calcolo unitario del totale che possa essere richiamato dalla classe ORDINAZIONE*/

import java.util.Scanner;

public class Main 
{
    private static Scanner myScelta = new Scanner(System.in);

    static Piatto piattoPrimo = new Piatto("Lasagne", 4.5, "Antonio");
    static Piatto piattoSecondo = new Piatto("Spaghetti", 3.0, "Marcello");
    static Piatto piattoTerzo = new Piatto("Polpette", 7.5, "Pino");
    static Piatto piattoQuarto = new Piatto("Gnocchi", 4.0, "Eustacio");

    private static Menu myMenu = new Menu();
    private static Ordinazione incassoTot = new Ordinazione(0);

    public static void main (String [] args)
    {
        myMenu.setPiatto(piattoPrimo);
        myMenu.setPiatto(piattoSecondo);
        myMenu.setPiatto(piattoTerzo);
        myMenu.setPiatto(piattoQuarto);

        MenuPrincipale();
    }
    
    private static void MenuPrincipale ()
    {
        System.out.print("\nCosa vuoi fare?\n1: Termina\n2: Continua\nInserisci scelta: ");
        int sceltaPrima = myScelta.nextInt();

        switch (sceltaPrima) 
        {
            //Termina
            case 1:
                System.out.println("\nL'incasso totale è di: " + incassoTot.getIncasso());
                System.out.println("\nTermino il programma...");
            break;
            //Continua
            case 2:
                MenuSecondario();
            break;
            //Inserimento errato
            default:
                System.out.println("\nInserimento errato...");
                MenuPrincipale();
            break;
        }
    }

    private static void MenuSecondario()
    {
        System.out.print("\nChe operazione vuoi eseguire?\n1: Visualizza menù\n2: Ordina\n3: Indietro\nInserisci scelta: ");
        int sceltaSeconda = myScelta.nextInt();

        switch (sceltaSeconda) 
        {
            //Stampa menù
            case 1:
                myMenu.stampaMenu();
                MenuSecondario();
            break;
            //Ordina
            case 2:
                System.out.print("\nChe piatto vuoi ordinare?\n1: "+ piattoPrimo.getNomePiatto() +"\n2: " + piattoSecondo.getNomePiatto() + "\n3: " + piattoTerzo.getNomePiatto() + "\n4: " + piattoQuarto.getNomePiatto() + "\nInserisci scelta: ");
                int sceltaPiatto = myScelta.nextInt();
                Ordinazione ordine = new Ordinazione(myMenu.getPiatto(sceltaPiatto - 1).getPrezzoPiatto());
                incassoTot.setIncasso(ordine.getPrezzoPiatto());
                System.out.println("\nOrdine effetuato!!!");
                MenuSecondario();
            break;
            //Indietro
            case 3:
               System.out.println("\nTorno indietro...");
               MenuPrincipale();
            break;
            //Inserimento errato...
            default:
                System.out.println("\nInserimento errato...");
                MenuSecondario();
            break;
        }
    }
}
