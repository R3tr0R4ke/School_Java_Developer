import java.util.Scanner;

public class menuPiatti 
{
    //Scanner che verra utilizzato per le future scelte
    public static Scanner myScelta = new Scanner(System.in);
    //Variabile utilizzata per l'apertura o chiusare del programma alla prima richiesta
    public static String sceltaAperChiu;

    //Variabile utile per il conteggio clienti
    public static int totClienti = 0;

    //Variabile il cui valore è assegnato randomicamente per ogni cliente
    public static double budgetCliente; 
    //Variabile per il calcolo del budget rimanente del cliente dopo un acquisto
    public static double budgetRimanenteCliente;

    //Scanner utilizzato per la scelta dell'opzione (Compra / Vedi / Aggiungi /Esci)
    public static Scanner myOpzioni = new Scanner(System.in);
    //Variabile utilizzata per la scelta opzione
    public static int opzione;

    //Variabili utili per il contenimento dei piatti, suppongo di avere un massimo di 3 piatti nel menù
    public static String piattoPrimo = "Orechiette";
    public static double prezzoPiatto1 = 7.5;
    public static String piattoSecondo = "Spaghetti";
    public static double prezzoPiatto2 = 5;
    public static String piattoTerzo = "Non disponibile";
    public static double prezzoPiatto3 = 0;
    //Variabili per gli ingredienti dei piatti;
    public static String ingredientePrimo = "Sugo di pomodoro";
    public static String ingredienteSecondo = "Formaggio";
    //Variabili per le disponibilità dei piatti
    public static int disponPiatto1 = 4;
    public static int disponPiatto2 = 10;
    public static int disponPiatto3 = 0;    //Lo pongo a 0 perchè questo piatto almeno che non venga aggiunto nel menu non è disponibile
    public static int disponibilitaPiatto;  //Variabile vuota usata per la selezione del piatto
    public static int aggiornaDispPiatto;

    //Variabile utile al calcolo del budget Rimanente del cliente
    public static double prezzoPiatto;

    //Scanner utile per la scelta del piatto nell'opzione "Compra"
    public static Scanner mySceltaCompra = new Scanner(System.in);
    public static int sceltaCompra;

    //Scanner e variabile da utilizzare per la richiesta di conferma acquisto piatto
    public static Scanner myConfPiatto = new Scanner(System.in);
    public static String confCompraPiatto;
    public static boolean piattoAcquistato = false;

    //Scanner e variabile utile per la richiesta di acquisto per un nuovo piatto o continua del programma
    public static Scanner myRichiestaRiacquisto = new Scanner(System.in);
    public static int richiestaRiacquisto;

    //Variabile che tiene conto delle spese totali dei clienti
    public static double totSpeso;

    //Scanner e variabili utili per la richiesta di inserimento password
    public static Scanner myPasswd = new Scanner(System.in);
    public static String password;
    static boolean passInserita = false;

    //Scanner e variabile utilizzate dopo aver inserito la password nell'opzione 3
    public static Scanner mySceltaAggiorna = new Scanner(System.in);
    public static int sceltaAggiorna;

    //Scanner utile per la modifica del nome e prezzo del terzo piatto
    public static Scanner myAggiuntaPiatto = new Scanner(System.in);
    public static Scanner myModificaPrezzo = new Scanner(System.in);
    public static Scanner myDispPiatto = new Scanner(System.in);

    public static void main (String [] args)
    {
        //Richiamo il metodo per eseguire la prima scelta di apertura o chiusura programma
        primaScelta();
        myScelta.close();
        myOpzioni.close();
        mySceltaCompra.close();
        myConfPiatto.close();
        myRichiestaRiacquisto.close();
        myPasswd.close();
        myAggiuntaPiatto.close();
        myModificaPrezzo.close();
        myDispPiatto.close();
    }

    //Metodo per il menù principale dove viene chiesto di avviare o terminare il programma
    public static void primaScelta()
    {
        //Domando se voglio chiudere o continuare il programma
        System.out.print("Vuoi aprire o chiudere l'app? (Premi s per aprire / n per chiudere): ");
        //Inserisco la mia scelta
        sceltaAperChiu = myScelta.nextLine();

        //Se la mia scelta è si
        if (sceltaAperChiu.equals("S") || sceltaAperChiu.equals("s"))
        {
            //Incremento la variabile cliente per il conteggio
            totClienti++;
            //Assegno un budget casuale al cliente
            budgetCliente = Math.random() * 150;
            //Richiamo il metodo per eseguire la scelta della seconda seconda domanda
            secondaScelta();
        }
        else if(sceltaAperChiu.equals("N") || sceltaAperChiu.equals("n"))
        {
            //Incremento la variabile cliente per il conteggio
            //Comunico in output il totale
            System.out.println("I clienti totali di oggi sono: " + totClienti);
            System.out.println("I clienti hanno speso in totale: " + totSpeso);
            System.out.println("Arrivederci!!!");
        }
        else    //Se l'utente sbaglia l'inserimento di S o N
        {
            //Richiedo di reinserire la scelta
            System.out.println("Input errato!!! Premi S per avviare il programma o inserisci N per chiuedere");
            primaScelta();
        }
    }

    public static void secondaScelta()
    {
        //Chiedo l'operazione che vuoi eseguire
        System.out.println("\nCosa vuoi fare?\n1: Comprare\n2: Vedere\n3:Aggiungere\n4: Uscire");
        System.out.print("Inserisci la tua scelta (1 / 2 / 3 / 4): ");
        //Inserisco in input l'opzione che desidero fare
        opzione = myOpzioni.nextInt();
        //Switch che confronta la scelta inserita per lo script da eseguire
        switch (opzione)
        {
            case 1:
                opzioneCompra();
                break;

            case 2:
                stampoPiatti();
                System.out.println("Sono disponibili N." + disponPiatto1 + " piatti di " + piattoPrimo);
                System.out.println("Sono disponibili N." + disponPiatto2 + " piatti di " + piattoSecondo);
                System.out.println("Sono disponibili N." + disponPiatto3 + " piatti di " + piattoTerzo);
                secondaScelta();
                break;

            case 3:
                System.out.print("Prego inserire la password per continuare: ");
                InserisciPassword();
                break;

            case 4:
                System.out.println("Buona giornata!!!\n");
                primaScelta();
                break;

            default:
                System.out.println("Inserimento errato!!! Inserire:\n1: Comprare\n2: Vedere\n3:Aggiungere\n4: Uscire");
                System.out.print("Inserisci la tua scelta (1 / 2 / 3 / 4): ");
                secondaScelta();
                break;
        }
    }

    public static void opzioneCompra ()
    {
        stampoPiatti();
        System.out.println("Quale piatto vuoi comprare?\n1: " + piattoPrimo + "\n2: " + piattoSecondo + "\n3: " + piattoTerzo + "\n4: Torna indietro");
        System.out.print("Inserisci scelta: ");
        sceltaCompra = mySceltaCompra.nextInt();

        switch (sceltaCompra)
        {
            case 1:
                System.out.println("Hai selezionato " + piattoPrimo);
                System.out.println("Budget disponibile: " + budgetCliente);
                //Assegno i valori del primo piatto in variabili vuote in modo che esse si aggiornino durante il programma
                prezzoPiatto = prezzoPiatto1;
                //TODO: trova una soluzione per le disponibilità piatti, ogni volta che premi 1 qui la disponiblità decrementa e quindi perdo un piatto
                disponibilitaPiatto = disponPiatto1;
                disponPiatto1--;
                //Richiamo il metodo confermaCompra()
                confermaCompra();
                break;

            case 2:
                System.out.println("Hai selezionato " + piattoSecondo);
                System.out.println("Budget disponibile: " + budgetCliente);
                //Assegno i valori del primo piatto in variabili vuote in modo che esse si aggiornino durante il programma
                prezzoPiatto = prezzoPiatto2;
                //TODO: trova una soluzione per le disponibilità piatti, ogni volta che premi 2 qui la disponiblità decrementa e quindi perdo un piatto
                disponibilitaPiatto = disponPiatto2;
                disponPiatto2--;
                //Richiamo il metodo confermaCompra()
                confermaCompra();
                break;

            case 3:
                System.out.println("Hai selezionato " + piattoTerzo);
                System.out.println("Budget disponibile: " + budgetCliente);
                //Assegno i valori del primo piatto in variabili vuote in modo che esse si aggiornino durante il programma
                prezzoPiatto = prezzoPiatto3;
                //TODO: trova una soluzione per le disponibilità piatti, ogni volta che premi 2 qui la disponiblità decrementa e quindi perdo un piatto
                disponibilitaPiatto = disponPiatto3;
                disponPiatto3--;
                //Richiamo il metodo confermaCompra()
                confermaCompra();
                break;

            //Se l'utente vuole tornare indietro e non comprare niente
            case 4:
                System.out.println("Torno indietro... Attendere prego...");
                secondaScelta();
                break;

            //Se l'utente sbaglia l'inserimento del numero
            default:
                //Richiedo di inserire la scelta del piatto
                System.out.println("Inserimento errato, si prega di reinserire la scelta...");
                opzioneCompra();
                break;
        }
    }

    //Metodo creato per la richiesta di conferma acquisto del piatto selezionato
    public static void confermaCompra()
    {
        System.out.print("\nVuoi comprare questo piatto? (s / n): ");
        confCompraPiatto = myConfPiatto.nextLine();
        //Se l'utente digita SI
        if (confCompraPiatto.equals("S") || confCompraPiatto.equals("s"))
        {
            //Controllo che il cliente abbia il budget neccessario per l'acquisto e che i piatti siano disponibili
            if (budgetCliente >= prezzoPiatto  && disponibilitaPiatto > 0)
            {
                System.out.println("Piatto acquistato!!! Prego passare in cassa");
                //Calcolo il budget rimanente del cliente
                budgetRimanenteCliente = budgetCliente - prezzoPiatto;
                //TODO: trova un modo per aggiornare la disponibilità del piatto, questa è temporanea
                //Aggiorno la disponibilità in base al piatto selezionato
                aggiornaDispPiatto = disponibilitaPiatto;
                aggiornaDispPiatto--;

                //TODO: questi print sono dei tester
                /*System.out.println("b cliente: " + budgetCliente);
                System.out.println("b rimanente:" + budgetRimanenteCliente);
                System.out.println(prezzoPiatto);
                System.out.println("npiatto: " + aggiornaDispPiatto);*/
                //Aggiorno il budget del cliente dopo che effettua l'acquisto del piatto
                budgetCliente = budgetRimanenteCliente;
                riacquistoPiatti();
            }
            //Se il budget del cliente non è sufficente o il piatto è finito
            else if (budgetCliente < prezzoPiatto || disponibilitaPiatto == 0)
            {
                //Torno al menu compra/vedi etc...
                System.out.println("Piatto esaurito o saldo insufficente per l'acquisto");
                System.out.println("Torno al menu principale...");
                secondaScelta();
            }
        }
        //Se la risposta è NO, ritorno indietro al metodo opzioneCompra()
        else if(confCompraPiatto.equals("N") || confCompraPiatto.equals("n"))
        {
            System.out.println("Torno indietro...");
            opzioneCompra();
        }
        //Se l'utente sbaglia l'inserimento di S o N
        else    
        {   
            //Richiedo di reinserire la scelta
            System.out.println("Input errato!!! Premi S per conferma acquisto o N per annullare");
            confermaCompra();
        }
    }

    //Metodo richiamato una volta completato l'acquisto di un piatto
    public static void riacquistoPiatti()
    {   
        System.out.println("\nVuoi acquistare un altro piatto o continuare?\n1: Acquista altro\n2: Continua");
        System.out.print("Inserisci scelta: ");
        richiestaRiacquisto = myRichiestaRiacquisto.nextInt();
        //Gestione con uno switch dei casi di input per la navigazione del menu
        switch (richiestaRiacquisto)
        {
            //Se voglio continuare ad acquistare torno alla lista dei piatti, ovvero torno al metodo opzioneCompra()
            case 1:
                //Richiamo il metodo opzioneCompra()
                opzioneCompra();
                break;
            //Se voglio fermarmi con l'acquisto invece 
            case 2:
                //calcolo il totale speso dal cliente   //TODO: non vedo la spesa tot dei clienti quando chiudo il programma con il primo metodo primaScelta()
                totSpeso = budgetCliente - budgetRimanenteCliente;
                //Ritorno al menù delle opzioni compra/vedi etc...
                secondaScelta();
                break;
            //Se l'utente sbaglia l'input richiedo di nuovo
            default:
                System.out.println("Inputo sbagliato, prego reinserire la scelta...");
                riacquistoPiatti();
                break;
        }
    }

    //Metodo per la stampa dei piatti con nome prezzo e ingredienti
    public static void stampoPiatti ()
    {
        System.out.println("\nLa lista dei piatti è la seguente: ");
        System.out.println("1: " + piattoPrimo + " con " + ingredientePrimo + " e " + ingredienteSecondo + "\t\tPrezzo: " + prezzoPiatto1);
        System.out.println("2: " + piattoSecondo + " con " + ingredientePrimo + " e " + ingredienteSecondo + "\t\tPrezzo: " + prezzoPiatto2);
        System.out.println("3: " + piattoTerzo + " con " + ingredientePrimo + " e " + ingredienteSecondo + "\tPrezzo: " + prezzoPiatto3 + "\n");
    }

    public static void aggiornaPiatto()
    {
        System.out.println("Vuoi resettare la disponibilità dei piatti o aggiungere un piatto?\n1: Resetta disponibilità\n2: Aggiungi Piatto");
        System.out.print("Inserisci scelta: ");
        sceltaAggiorna = mySceltaAggiorna.nextInt();

        switch (sceltaAggiorna)
        {
            case 1:
                resettaDispo();
                break;
            
            case 2:
                aggiungiPiatto();
                break;

            default:
                System.out.println("\nInserimento scorretto!!! Reinserisci opzione...");
                aggiornaPiatto();
                break;
        }
    }

    public static void aggiungiPiatto()
    {
        System.out.print("Come vuoi chiamare il nuovo piatto?: ");
        piattoTerzo = myAggiuntaPiatto.nextLine();
        System.out.print("Inserisci il prezzo del piatto: ");
        prezzoPiatto3 = myModificaPrezzo.nextDouble();
        System.out.print("Inserisci disponibilità del piatto: ");
        disponPiatto3 = myDispPiatto.nextInt();
        System.out.println("La lista dei piatti è stata aggiornata, torno al menù secondario");
        secondaScelta();
    }

    //Metodo che resetta la disponibilità dei piatti
    public static void resettaDispo()
    {
        disponPiatto1 = 5;
        disponPiatto2 = 10;
        disponPiatto3 = 0;
    }

    //Metodo per inserimento della password
    public static void InserisciPassword ()
    {
        password = myPasswd.nextLine();
        //Se l'inserimento è corretto
        if (password.equals("password123"))
        {
            System.out.println("Password inserita con successo: ");
            passInserita = true;
            totClienti--;
            stampoPiatti();
            aggiornaPiatto();
        }
        while (passInserita == false)
        {
            System.out.print("Password errata, reinserire password: ");
            InserisciPassword();
        }
    }
}
