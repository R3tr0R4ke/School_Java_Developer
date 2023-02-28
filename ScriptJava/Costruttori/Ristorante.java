import java.security.PublicKey;
import java.util.Scanner;

import Costruttori.Piatto;
import Costruttori.Utenti;
import Costruttori.Conto;

public class Ristorante 
{
    //Creazione menù ristorante (5 max)
    static Piatto lasagne = new Piatto("Lasagne", 10.5, "Pasta");
    static Piatto spaghetti = new Piatto("Spaghetti", 7.6, "Pasta");
    static Piatto pizza = new Piatto("4 formaggi", 8.3, "Pizza");
    static Piatto zuppa = new Piatto("Zucca", 5, "Zuppa");

    static Utenti nuovoUtente = new Utenti(null, 0, 0, 0);

    static int clientiEntrati = 0;

    static int disponibilitaPiatto1 = 10;
    static int disponibilitaPiatto2 = 7;
    static int disponibilitaPiatto3 = 5;
    static int disponibilitaPiatto4 = 3;

    public static void main (String [] args)
    {
       menuPrincipale();  
    }

    public static void menuPrincipale ()
    {
        Scanner myScelta = new Scanner(System.in);

            System.out.print("\nVuoi terminare il programma o avviare?\n1: Termina\n2: Avvia\nInserisci scelta: ");
            int scelta1 = myScelta.nextInt();

            switch (scelta1)
            {
                case 1:
                //TODO: FINISCI QUESTO PUNTO
                    System.out.println("Il clienti totali di oggi sono: " + clientiEntrati);

                    //System.out.println("Le spese totali dei clienti di oggi sono: " + totSpeso);
                    System.out.println("\nTermino il programma...\n");
                break;

                case 2:
                    //Da qui vado alla registrazione e poi menù secondario
                    registrazione();
                break;
                //Inserimento errato
                default:
                    System.out.println("\nInput errato... Reinserire scelta");
                    menuPrincipale();
                break;
            }
    }

    public static void registrazione ()
    {
        Scanner myNomi = new Scanner(System.in);

        //Chiedo di inserire il nome 
        System.out.print("\nInserisci il nome utente: ");
        String nome = myNomi.nextLine();
        //Assegno il nome all'oggetto
        nuovoUtente.nomeUtente = nome;
        //Incremento di 1 la variabile clientiEntrati
        clientiEntrati++;

        System.out.println("\nBenvenuto " + nuovoUtente.nomeUtente + "!!!");
        //Randomizzo il budget
        nuovoUtente.creaBudget();
        //Stampo il budget
        System.out.println("Il tuo budget è di: " + nuovoUtente.budgetUtente);
        //Richiamo il metodo per andare al menù secondario
        menuSecondario();

        myNomi.close();
    }

    public static void menuSecondario()
    {
        Scanner myScelta2 = new Scanner(System.in);

        System.out.print("\nCosa vuoi fare?\n1: Visualizza menù\n2: Ordina\n3: Modifica\n4: Esci\nInserisci scelta: ");
        int scelta2 = myScelta2.nextInt();

        switch (scelta2) 
        {
            //Caso Visualizza
            case 1:
                //Stampo il menù
                stampaMenu();
                //Ritorno alla richiesta di scelta
                menuSecondario();
            break;
            //Caso Ordina
            case 2:
                metodoOrdina();
            break;
            //Caso Modifica
            case 3:
                //TODO DA FINIRE 
                System.out.print("AGGIORNAMENTO COMING SOON...");
            break;
            //Caso Esci
            case 4:
                //TODO: termina questo punto
                //Resetto il credito del cliente se questo decide di uscire
                //creditoUtente = 0;
                //Elimino il nome utente e il credito dell'utente dall'array
                
                //Torno al menù principale
                //System.out.println("\nTorno al menù principale. Buona giornata!!!");
                //menuPrincipale();
            break;
            //Caso inserimento errato
            default:
                //Ritorno al menuSecondario
                System.out.println("\nInserimento errato...");
                menuSecondario();
            break;
        }
        myScelta2.close();
    }

    public static void metodoOrdina()
    {
        //Mostro il menù prima di chiedere gli ordini
        stampaMenu();

        Scanner myScelta3 = new Scanner(System.in);

        System.out.print("\nQuale piatto vuoi ordinare?\n1: Lasagne\n2: Spaghetti\n3: Pizza\n4: Zuppa\n5: Torna indietro\nInserisci scelta: ");
        int scelta3 = myScelta3.nextInt();

        switch (scelta3) 
        {
            //Lasagna
            case 1:
                System.out.println("\nIl piatto costa: " + lasagne.prezzoPiatto);

                Scanner myScelta4 = new Scanner(System.in);

                System.out.print("\nVuoi ordinare il piatto selezionato? (si / no): ");
                String scelta4 = myScelta4.nextLine();
                
                if (scelta4.equalsIgnoreCase("Si"))
                {
                    //TODO: TROVA UN MODO PER RENDERE UNIVOCI PREZZO NOME E DISPONIBILITA dato che ora si assume il valore dell'ultima variabile dichiara in new oggetto Piatto
                    //Controllo che l'utente abbia il credito per acquistare il piatto
                    if (nuovoUtente.budgetUtente > lasagne.prezzoPiatto && disponibilitaPiatto1 > 0)
                    {
                        System.out.println("\nPiatto acquistato!!!\n");
                        //Decremento la disponibilità del piatto  
                        disponibilitaPiatto1--;
                        //System.out.println(nuovoUtente.numAcquisti);

                        //Incremento il contatore per sapere quante cose un cliente ha acquistato
                        nuovoUtente.numAcquisti++;  
                        //System.out.println(nuovoUtente.numAcquisti);
                        nuovoUtente.budgetUtente = nuovoUtente.budgetUtente - lasagne.prezzoPiatto;
                        //System.out.println(nuovoUtente.budgetUtente);

                        //Calcolo la spesa totale del cliente
                        nuovoUtente.spesaTotCliente = lasagne.prezzoPiatto * nuovoUtente.numAcquisti;

                        //Assegno le spese totali momentanee alla variabile conotoMomentaneo
                        Conto.contoMomentaneo = nuovoUtente.spesaTotCliente;

                        System.out.print("Vuoi acquistare un altro Piatto? (si / no): ");
                        String scelta5 = myScelta4.nextLine();

                        if (scelta5.equalsIgnoreCase("si"))
                        {
                            metodoOrdina();
                        }
                        else if (scelta5.equalsIgnoreCase("no"))
                        {
                            System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                            
                            Conto.contoTotale = Conto.contoMomentaneo;

                            //Azzero la spesa cliente
                            nuovoUtente.spesaTotCliente = 0;

                            //Resetto il contatore
                            nuovoUtente.numAcquisti = 0;
                            menuPrincipale();
                        }
                    }
                    else 
                    {
                        System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                        menuSecondario();
                    }
                }
                else if (scelta4.equalsIgnoreCase("no"))
                {
                    //Ritorno al menù secondario
                    menuSecondario();
                }  
            break;
            //Spaghetti
            case 2:
                System.out.println("\nIl piatto costa: " + spaghetti.prezzoPiatto);

                Scanner myScelta5 = new Scanner(System.in);

                System.out.print("\nVuoi ordinare il piatto selezionato? (si / no): ");
                String scelta5 = myScelta5.nextLine();
                
                if (scelta5.equalsIgnoreCase("Si"))
                {
                    //TODO: TROVA UN MODO PER RENDERE UNIVOCI PREZZO NOME E DISPONIBILITA dato che ora si assume il valore dell'ultima variabile dichiara in new oggetto Piatto
                    //Controllo che l'utente abbia il credito per acquistare il piatto
                    if (nuovoUtente.budgetUtente > spaghetti.prezzoPiatto && disponibilitaPiatto2 > 0)
                    {
                        System.out.println("\nPiatto acquistato!!!\n");
                        //Decremento la disponibilità del piatto  
                        disponibilitaPiatto2--;
                        //System.out.println(nuovoUtente.numAcquisti);

                        //Incremento il contatore per sapere quante cose un cliente ha acquistato
                        nuovoUtente.numAcquisti++;  
                        //System.out.println(nuovoUtente.numAcquisti);
                        nuovoUtente.budgetUtente = nuovoUtente.budgetUtente - lasagne.prezzoPiatto;
                        //System.out.println(nuovoUtente.budgetUtente);

                        //Calcolo la spesa totale del cliente
                        nuovoUtente.spesaTotCliente = lasagne.prezzoPiatto * nuovoUtente.numAcquisti;

                        //Assegno le spese totali momentanee alla variabile conotoMomentaneo
                        Conto.contoMomentaneo = nuovoUtente.spesaTotCliente;

                        System.out.print("Vuoi acquistare un altro Piatto? (si / no): ");
                        String scelta6 = myScelta5.nextLine();

                        if (scelta6.equalsIgnoreCase("si"))
                        {
                            metodoOrdina();
                        }
                        else if (scelta6.equalsIgnoreCase("no"))
                        {
                            System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                            
                            Conto.contoTotale = Conto.contoMomentaneo;

                            //Azzero la spesa cliente
                            nuovoUtente.spesaTotCliente = 0;

                            //Resetto il contatore
                            nuovoUtente.numAcquisti = 0;
                            menuPrincipale();
                        }
                    }
                    else 
                    {
                        System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                        menuSecondario();
                    }
                }
                else if (scelta5.equalsIgnoreCase("no"))
                {
                    //Ritorno al menù secondario
                    menuSecondario();
                }
            break;
            //Pizza
            case 3:
                System.out.println("\nIl piatto costa: " + pizza.prezzoPiatto);

                Scanner myScelta6 = new Scanner(System.in);

                System.out.print("\nVuoi ordinare il piatto selezionato? (si / no): ");
                String scelta6 = myScelta6.nextLine();
                
                if (scelta6.equalsIgnoreCase("Si"))
                {
                    //TODO: TROVA UN MODO PER RENDERE UNIVOCI PREZZO NOME E DISPONIBILITA dato che ora si assume il valore dell'ultima variabile dichiara in new oggetto Piatto
                    //Controllo che l'utente abbia il credito per acquistare il piatto
                    if (nuovoUtente.budgetUtente > pizza.prezzoPiatto && disponibilitaPiatto3 > 0)
                    {
                        System.out.println("\nPiatto acquistato!!!\n");
                        //Decremento la disponibilità del piatto  
                        disponibilitaPiatto3--;
                        //System.out.println(nuovoUtente.numAcquisti);

                        //Incremento il contatore per sapere quante cose un cliente ha acquistato
                        nuovoUtente.numAcquisti++;  
                        //System.out.println(nuovoUtente.numAcquisti);
                        nuovoUtente.budgetUtente = nuovoUtente.budgetUtente - lasagne.prezzoPiatto;
                        //System.out.println(nuovoUtente.budgetUtente);

                        //Calcolo la spesa totale del cliente
                        nuovoUtente.spesaTotCliente = lasagne.prezzoPiatto * nuovoUtente.numAcquisti;

                        //Assegno le spese totali momentanee alla variabile conotoMomentaneo
                        Conto.contoMomentaneo = nuovoUtente.spesaTotCliente;

                        System.out.print("Vuoi acquistare un altro Piatto? (si / no): ");
                        String scelta7 = myScelta6.nextLine();

                        if (scelta7.equalsIgnoreCase("si"))
                        {
                            metodoOrdina();
                        }
                        else if (scelta7.equalsIgnoreCase("no"))
                        {
                            System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
        
                            Conto.contoTotale = Conto.contoMomentaneo;
                            //Azzero la spesa cliente
                            nuovoUtente.spesaTotCliente = 0;
                            //Resetto il contatore
                            nuovoUtente.numAcquisti = 0;
                            menuPrincipale();
                        }
                    }
                    else 
                    {
                        System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                        menuSecondario();
                    }
                }
                else if (scelta6.equalsIgnoreCase("no"))
                {
                    //Ritorno al menù secondario
                    menuSecondario();
                }
            break;
            //Zuppa
            case 4:
                System.out.println("\nIl piatto costa: " + zuppa.prezzoPiatto);

                Scanner myScelta7 = new Scanner(System.in);

                System.out.print("\nVuoi ordinare il piatto selezionato? (si / no): ");
                String scelta7 = myScelta7.nextLine();
                
                if (scelta7.equalsIgnoreCase("Si"))
                {
                    //TODO: TROVA UN MODO PER RENDERE UNIVOCI PREZZO NOME E DISPONIBILITA dato che ora si assume il valore dell'ultima variabile dichiara in new oggetto Piatto
                    //Controllo che l'utente abbia il credito per acquistare il piatto
                    if (nuovoUtente.budgetUtente > zuppa.prezzoPiatto && disponibilitaPiatto4 > 0)
                    {
                        System.out.println("\nPiatto acquistato!!!\n");
                        //Decremento la disponibilità del piatto  
                        disponibilitaPiatto4--;
                        //System.out.println(nuovoUtente.numAcquisti);

                        //Incremento il contatore per sapere quante cose un cliente ha acquistato
                        nuovoUtente.numAcquisti++;  
                        //System.out.println(nuovoUtente.numAcquisti);
                        nuovoUtente.budgetUtente = nuovoUtente.budgetUtente - lasagne.prezzoPiatto;
                        //System.out.println(nuovoUtente.budgetUtente);

                        //Calcolo la spesa totale del cliente
                        nuovoUtente.spesaTotCliente = lasagne.prezzoPiatto * nuovoUtente.numAcquisti;

                        //Assegno le spese totali momentanee alla variabile conotoMomentaneo
                        Conto.contoMomentaneo = nuovoUtente.spesaTotCliente;

                        System.out.print("Vuoi acquistare un altro Piatto? (si / no): ");
                        String scelta8 = myScelta7.nextLine();

                        if (scelta8.equalsIgnoreCase("si"))
                        {
                            metodoOrdina();
                        }
                        else if (scelta8.equalsIgnoreCase("no"))
                        {
                            System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                            
                            Conto.contoTotale = Conto.contoMomentaneo;

                            //Azzero la spesa cliente
                            nuovoUtente.spesaTotCliente = 0;

                            //Resetto il contatore
                            nuovoUtente.numAcquisti = 0;
                            menuPrincipale();
                        }
                    }
                    else 
                    {
                        System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                        menuSecondario();
                    }
                }
                else if (scelta7.equalsIgnoreCase("no"))
                {
                    //Ritorno al menù secondario
                    menuSecondario();
                }
            break;
            //Torna indietro
            case 5:
                menuSecondario();
            break;
            //Inserimento errato
            default:
                System.out.print("\nInput errato...\n");
                metodoOrdina();
            break;
        }
        myScelta3.close();
    }
    //Metodo per stampare il menù del ristorante
    private static void stampaMenu () 
    {
        System.out.print("\nNome Piatto: " + lasagne.nomePiatto + "\t\tPrezzo: " + lasagne.prezzoPiatto + "\tTipo Piatto: " + lasagne.tipoPiatto);
        System.out.print("\nNome Piatto: " + spaghetti.nomePiatto + "\t\tPrezzo: " + spaghetti.prezzoPiatto + "\tTipo Piatto: " + spaghetti.tipoPiatto);
        System.out.print("\nNome Piatto: " + pizza.nomePiatto + "\t\tPrezzo: " + pizza.prezzoPiatto + "\tTipo Piatto: " + pizza.tipoPiatto);
        System.out.println("\nNome Piatto: " + zuppa.nomePiatto + "\t\tPrezzo: " + zuppa.prezzoPiatto + "\tTipo Piatto: " + zuppa.tipoPiatto);

    }

    
}
