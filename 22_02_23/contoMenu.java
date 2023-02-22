import java.util.Scanner;
import java.util.ArrayList;

public class contoMenu
{
    //ArrayList inerenti agli utenti
    public static ArrayList<String> utenteList = new ArrayList<>();
    //ArraList per i panini
    public static ArrayList<String> piattiList = new ArrayList<>();
    public static ArrayList<Double> prezziList = new ArrayList<>();
    public static ArrayList<String> ingredienti1List = new ArrayList<>();
    public static ArrayList<String> ingredienti2List = new ArrayList<>();
    public static ArrayList<Integer> disponibilitàList = new ArrayList<>();
    //Variabile per il credito del cliente
    public static double creditoUtente;
    //Conatore dei cliente
    public static int clienti = 0;
    //Contatore spesa totale
    public static double totSpeso = 0;
    //Variabile per contenere la spesa totale del cliente
    public static double spesaTotCliente = 0;
    //Variabili per la disponibilità di ciascun piatto nel menù
    public static int disponibilità1, disponibilità2, disponibilità3, disponibilità4, disponibilità5;
    //Contatore che conta gli acquisti di un cliente
    public static int volteAcquisto = 0;
    //Contatore inserimenti password
    public static int tentativi = 0;

    public static void main (String [] args)
    {
        //Popolo il menù in modo da poterlo stampare dopo
        popolaMenù();
        //Chiamo il metodo in modo da poter entrare nel menù principale
        menuPrincipale();
    }
    //Metodo per il menù principale, chiede di terminare o continuare il programma in un altro menù
    public static void menuPrincipale()
    {
        Scanner myScelta = new Scanner(System.in);

        System.out.print("\nVuoi terminare il programma o avviare?\n1: Termina\n2: Avvia\nInserisci scelta: ");
        int scelta1 = myScelta.nextInt();
   
        switch (scelta1)
        {
            case 1:
                System.out.println("Il clienti totali di oggi sono: " + clienti);

                
                System.out.println("Le spese totali dei clienti di oggi sono: " + totSpeso);
                System.out.println("\nTermino il programma...\n");
            break;

            case 2:
                registraUtente();
            break;

            default:
                System.out.println("\nInput errato...\n");
                menuPrincipale();
            break;
        }
        myScelta.close();
    }
    //Metodo per inserire il nome utente e che mi porta al menuSecondario
    public static void registraUtente()
    {
        Scanner myNomi = new Scanner(System.in);
        String nome;

        //Chiedo di inserire il nome e lo carico nell'arrayList dei nomi
        System.out.print("\nInserisci il nome utente: ");
        utenteList.add(nome = myNomi.nextLine());
        //Dichiaro che il nome è stato inserito con successo
        System.out.print("\nNome utente inserito con Successo!!!");
        //Incremento di uno la variabile clienti
        clienti ++;
        //Randomizzo il credito dell'utente
        creditoUtente = Math.random() * 50;
        //Richiamo il metodo menuSecondario()
        System.out.print(" Benvenuto" + nome +"!!!\n");
        
        menuSecondario();
    }
    //MenuùSecondario, riporta ad altri menù in base all'input inserito
    public static void menuSecondario()
    {
        Scanner myScelta2 = new Scanner(System.in);

        System.out.print("\nCosa vuoi fare?\n1: Visualizza menù\n2: Ordina\n3: Modifica\n4: Esci\nInserisci scelta: ");
        int scelta2 = myScelta2.nextInt();

        switch (scelta2) 
        {
            //Caso Visualizza
            case 1:
                stampaMenù();
            break;
            //Caso Ordina
            case 2:
                metodoOrdina();
            break;
            //Caso Modifica
            case 3:
                InserisciPassword();
            break;
            //Caso Esci
            case 4:
                //Resetto il credito del cliente se questo decide di uscire
                creditoUtente = 0;
                //Elimino il nome utente e il credito dell'utente dall'array
                resettaArray();
                //Torno al menù principale
                System.out.println("\nTorno al menù principale. Buona giornata!!!");
                menuPrincipale();
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

    public static void modifica()
    {
        Scanner myScelta6 = new Scanner(System.in);



        System.out.print("\nVuoi modificare un piatto o eliminarne uno o aggiungerne uno?\n1: Modifica piatto\n2: Elimina piatto\n3: Aggiungi piatto\n4: Indietro\nInserisci scelta: ");
        int scelta6 = myScelta6.nextInt();

        switch (scelta6) 
        {
            //Modifica piatto
            case 1:
                
            break;
            //Elimina piatto
            case 2:

            break;
            //Aggiungi piatto
            case 3:

            break;
            //Indietro
            case 4:
                System.out.println("\nTorno indietro...");
                menuSecondario();
            break;
            //Inserimento errato
            default:
                System.out.println("\nInserimento errato...");
                modifica();
            break;
        }
        myScelta6.close();
    }

    public static void modificaPiatto()
    {
        Scanner myScelta7 = new Scanner(System.in);

        System.out.print("Cosa vuoi modificare?\n1: Nome piatto\n2: Ingredienti\n3: Prezzo\n4: Indietro\nInserire scelta: ");
        int scelta7 = myScelta7.nextInt();

        switch (scelta7) 
        {
            //Nome piatto
            case 1:

            break;
            //Ingredienti
            case 2:

            break;
            //Prezzo
            case 3:

            break;
            //Indietro
            case 4:
                System.out.println("\nTorno indietro...");
                modifica();
            break;
            //Inserimento errato
            default:
                System.out.println("\nInserimento erratto...");
                modificaPiatto();
            break;
        }

        myScelta7.close();
    }

    public static void modificaNomePiatto()
    {
        System.out.print("Che piatto vuoi modificare?");
    }

    //Metodo per inserimento password, se giusta mi porta al metodo modifica()
    public static void InserisciPassword ()
    {
        Scanner myPasswd = new Scanner(System.in);
        
        do
        {
            System.out.print("\nInserisci password: ");
            String password = myPasswd.nextLine();
            //Se la password è giusta accedo al menù modifica
            if (password.equals("admin123"))
            {
                modifica();
            }
            else    
            {
                //Aumento il contatore tentativi
                System.out.print("\nPassword errata!!! Riprovare: ");
                tentativi++;
            }
        }
        //Se la password ha valore true o si superano i 3 tentativi esco dal ciclo
        while(tentativi != 3);

        System.out.print("\n\nTroppi tentativi...\nTorno indietro...\n");
        //Azzero il contatore per riprovare ad entrare in futuro
        tentativi = 0;
        //Torno al menù secondario
        menuSecondario();
            
        myPasswd.close();
    }
    //Metodo per l'ordinazione di un piatto
    public static void metodoOrdina()
    {
        Scanner myScelta3 = new Scanner(System.in);

        System.out.println("\nQuale piatto vuoi ordinare?");

        for (int i = 0; i < piattiList.size(); i++)
        {
            int j = i;
            System.out.print((j + 1) + ": " + piattiList.get(i) + "\n");
        }
        System.out.print("Inserisci scelta: ");
        int scelta3 = myScelta3.nextInt();

        switch (scelta3) 
        {
            //Piatto 1
            case 1:
                ordinaPiatto1();
            break;
            //Piatto 2
            case 2:
                ordinaPiatto2();
            break;
            //Piatto 3
            case 3:
                ordinaPiatto3();
            break;
            //Piatto 4
            case 4:
                ordinaPiatto4();
            break;
            //Piatto 5
            case 5:
                ordinaPiatto5();
            break;
            //Inserimento errato
            default:
                System.out.print("\nInput errato...\n");
                metodoOrdina();
            break;
        }
        myScelta3.close();
    }
    //Metodo per comprare il primo piatto
    public static void ordinaPiatto1 ()
    {
        Scanner myScelta4 = new Scanner(System.in);

        System.out.println("\nIl piatto costa: " + prezziList.get(0));
        
        System.out.print("\nVuoi ordinare il piatto selezionato? (s / n): ");
        String scelta4 = myScelta4.nextLine();
        //Se la risposta è si
        if (scelta4.equals("s") || scelta4.equals("S"))
        {
            //Controllo che l'utente abbia il credito per acquistare il piatto
            if (creditoUtente > prezziList.get(0) && disponibilità1 > 0)
            {
                System.out.println("\nPiatto acquistato!!!\n");
                //Decremento la disponibilità del piatto
                disponibilità1--;
                //Incremento il contatore per sapere quante cose un cliente ha acquistato
                volteAcquisto++;
                //Calcolo il credito rimanente del cliente, mi serve per rimanere nei controlli altrimenti lo stesso cliente potrebbe acquistare all'infinito
                creditoUtente = creditoUtente - prezziList.get(0);
                //Calcolo la spesa totale del cliente
                spesaTotCliente = prezziList.get(0) * volteAcquisto;

                System.out.print("Vuoi acquistare un altro Piatto? (s / n): ");
                String scelta5 = myScelta4.nextLine();
                //Se la risposta è si
                if (scelta5.equals("s") || scelta5.equals("S"))
                {
                    metodoOrdina();
                }
                //Se la risposta è no
                else if (scelta5.equals("n") || scelta5.equals("N"))
                {
                    System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                    //Calcolo le spese totali dei clienti
                    double totSpeso0 = spesaTotCliente;
                    totSpeso = totSpeso0 + spesaTotCliente;
                    //Azzero la spesa cliente
                    spesaTotCliente = 0;
                    //Resetto il contatore
                    volteAcquisto = 0;
                    //Torno al menù principale
                    menuSecondario();
                }
            }
            else
            {
                System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                menuSecondario();
            }
        }
        else if (scelta4.equals("n") || scelta4.equals("N"))
        {
            //Ritorno al menù secondario
            menuSecondario();
        }
        myScelta4.close();
    }
    //Metodo per comprare il secondo piatto
    public static void ordinaPiatto2()
    {
        Scanner myScelta4 = new Scanner(System.in);
    
        System.out.println("\nIl piatto costa: " + prezziList.get(1));
        
        System.out.print("\nVuoi ordinare il piatto selezionato? (s / n): ");
        String scelta4 = myScelta4.nextLine();
        //Se la risposta è si
        if (scelta4.equals("s") || scelta4.equals("S"))
        {
            //Controllo che l'utente abbia il credito per acquistare il piatto
            if (creditoUtente > prezziList.get(1) && disponibilità2 > 0)
            {
                System.out.println("\nPiatto acquistato!!!\n");
                //Decremento la disponibilità del piatto
                disponibilità2--;
                //Incremento il contatore per sapere quante cose un cliente ha acquistato
                volteAcquisto++;
                //Calcolo il credito rimanente del cliente, mi serve per rimanere nei controlli altrimenti lo stesso cliente potrebbe acquistare all'infinito
                creditoUtente = creditoUtente - prezziList.get(1);
                //Calcolo la spesa totale del cliente
                spesaTotCliente = prezziList.get(1) * volteAcquisto;

                System.out.print("Vuoi acquistare un altro Piatto? (s / n): ");
                String scelta5 = myScelta4.nextLine();

                if (scelta5.equals("s") || scelta5.equals("S"))
                {
                    metodoOrdina();
                }
                else if (scelta5.equals("n") || scelta5.equals("N"))
                {
                    System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                    //Calcolo le spese totali dei clienti
                    double totSpeso0 = spesaTotCliente;
                    totSpeso = totSpeso0 + spesaTotCliente;
                    //Azzero la spesa cliente
                    spesaTotCliente = 0;
                    //Resetto il contatore
                    volteAcquisto = 0;
                    //Torno al menù principale
                    menuSecondario();
                }
            }
            else
            {
                System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                menuSecondario();
            }
        }
        else if (scelta4.equals("n") || scelta4.equals("N"))
        {
            //Ritorno al menù secondario
            menuSecondario();
        }
        myScelta4.close();
    }
    //Metodo per comprare il terzo piatto
    public static void ordinaPiatto3()
    {
        Scanner myScelta4 = new Scanner(System.in);
    
        System.out.println("\nIl piatto costa: " + prezziList.get(2));
        
        System.out.print("\nVuoi ordinare il piatto selezionato? (s / n): ");
        String scelta4 = myScelta4.nextLine();
        //Se la risposta è si
        if (scelta4.equals("s") || scelta4.equals("S"))
        {
            //Controllo che l'utente abbia il credito per acquistare il piatto
            if (creditoUtente > prezziList.get(2) && disponibilità3 > 0)
            {
                System.out.println("\nPiatto acquistato!!!\n");
                //Decremento la disponibilità del piatto
                disponibilità3--;
                //Incremento il contatore per sapere quante cose un cliente ha acquistato
                volteAcquisto++;
                //Calcolo il credito rimanente del cliente, mi serve per rimanere nei controlli altrimenti lo stesso cliente potrebbe acquistare all'infinito
                creditoUtente = creditoUtente - prezziList.get(2);
                //Calcolo la spesa totale del cliente
                spesaTotCliente = prezziList.get(2) * volteAcquisto;

                System.out.print("Vuoi acquistare un altro Piatto? (s / n): ");
                String scelta5 = myScelta4.nextLine();

                if (scelta5.equals("s") || scelta5.equals("S"))
                {
                    metodoOrdina();
                }
                else if (scelta5.equals("n") || scelta5.equals("N"))
                {
                    System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                    //Calcolo le spese totali dei clienti
                    double totSpeso0 = spesaTotCliente;
                    totSpeso = totSpeso0 + spesaTotCliente;
                    //Azzero la spesa cliente
                    spesaTotCliente = 0;
                    //Resetto il contatore
                    volteAcquisto = 0;
                    //Torno al menù principale
                    menuSecondario();
                }
            }
            else
            {
                System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                menuSecondario();
            }
        }
        else if (scelta4.equals("n") || scelta4.equals("N"))
        {
            //Ritorno al menù secondario
            menuSecondario();
        }
        myScelta4.close();
    }
    //Metodo per comprare il quarto piatto
    public static void ordinaPiatto4()
    {
        Scanner myScelta4 = new Scanner(System.in);
    
        System.out.println("\nIl piatto costa: " + prezziList.get(3));
        
        System.out.print("\nVuoi ordinare il piatto selezionato? (s / n): ");
        String scelta4 = myScelta4.nextLine();
        //Se la risposta è si
        if (scelta4.equals("s") || scelta4.equals("S"))
        {
            //Controllo che l'utente abbia il credito per acquistare il piatto
            if (creditoUtente > prezziList.get(3) && disponibilità4 > 0)
            {
                System.out.println("\nPiatto acquistato!!!\n");
                //Decremento la disponibilità del piatto
                disponibilità4--;
                //Incremento il contatore per sapere quante cose un cliente ha acquistato
                volteAcquisto++;
                //Calcolo il credito rimanente del cliente, mi serve per rimanere nei controlli altrimenti lo stesso cliente potrebbe acquistare all'infinito
                creditoUtente = creditoUtente - prezziList.get(3);
                //Calcolo la spesa totale del cliente
                spesaTotCliente = prezziList.get(3) * volteAcquisto;

                System.out.print("Vuoi acquistare un altro Piatto? (s / n): ");
                String scelta5 = myScelta4.nextLine();

                if (scelta5.equals("s") || scelta5.equals("S"))
                {
                    metodoOrdina();
                }
                else if (scelta5.equals("n") || scelta5.equals("N"))
                {
                    System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                    //Calcolo le spese totali dei clienti
                    double totSpeso0 = spesaTotCliente;
                    totSpeso = totSpeso0 + spesaTotCliente;
                    //Azzero la spesa cliente
                    spesaTotCliente = 0;
                    //Resetto il contatore
                    volteAcquisto = 0;
                    //Torno al menù principale
                    menuSecondario();
                }
            }
            else
            {
                System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                menuSecondario();
            }
        }
        else if (scelta4.equals("n") || scelta4.equals("N"))
        {
            //Ritorno al menù secondario
            menuSecondario();
        }
        myScelta4.close();
    }
    //Metodo per comprare il quinto piatto
    public static void ordinaPiatto5()
    {
        Scanner myScelta4 = new Scanner(System.in);
    
        System.out.println("\nIl piatto costa: " + prezziList.get(4));
        
        System.out.print("\nVuoi ordinare il piatto selezionato? (s / n): ");
        String scelta4 = myScelta4.nextLine();
        //Se la risposta è si
        if (scelta4.equals("s") || scelta4.equals("S"))
        {
            //Controllo che l'utente abbia il credito per acquistare il piatto
            if (creditoUtente > prezziList.get(4) && disponibilità5 > 0)
            {
                System.out.println("\nPiatto acquistato!!!\n");
                //Decremento la disponibilità del piatto
                disponibilità5--;
                //Incremento il contatore per sapere quante cose un cliente ha acquistato
                volteAcquisto++;
                //Calcolo il credito rimanente del cliente, mi serve per rimanere nei controlli altrimenti lo stesso cliente potrebbe acquistare all'infinito
                creditoUtente = creditoUtente - prezziList.get(4);
                //Calcolo la spesa totale del cliente
                spesaTotCliente = prezziList.get(4) * volteAcquisto;

                System.out.print("Vuoi acquistare un altro Piatto? (s / n): ");
                String scelta5 = myScelta4.nextLine();

                if (scelta5.equals("s") || scelta5.equals("S"))
                {
                    metodoOrdina();
                }
                else if (scelta5.equals("n") || scelta5.equals("N"))
                {
                    System.out.println("\nPrego puoi passare alla cassa!!!\nTorno al menù principale...");
                    //Calcolo le spese totali dei clienti
                    double totSpeso0 = spesaTotCliente;
                    totSpeso = totSpeso0 + spesaTotCliente;
                    //Azzero la spesa cliente
                    spesaTotCliente = 0;
                    //Resetto il contatore
                    volteAcquisto = 0;
                    //Torno al menù principale
                    menuSecondario();
                }
            }
            else
            {
                System.out.print("Credito insufficente per l'acquisto o disponibilità piatto esaurità\nTorno al menù precedente...\n");
                menuSecondario();
            }
        }
        else if (scelta4.equals("n") || scelta4.equals("N"))
        {
            //Ritorno al menù secondario
            menuSecondario();
        }
        myScelta4.close();
    }
    //Metodo per popolare gli array inerenti al menù
    public static void popolaMenù()
    {
        //Piatto 1
        piattiList.add("Spaghetti");
        prezziList.add(7.5);
        ingredienti1List.add("Tonno");
        ingredienti2List.add("Sugo di pomodoro");
        disponibilità1 = 5;
        //Piatto 2
        piattiList.add("Orecchiette");
        prezziList.add(5.5);
        ingredienti1List.add("Basilico");
        ingredienti2List.add("Sugo di pomodoro");
        disponibilità2 = 10;
        //Piatto 3
        piattiList.add("Panzerotto");
        prezziList.add(3.0);
        ingredienti1List.add("Mozzarella");
        ingredienti2List.add("Prosciutto");
        disponibilità3 = 15;
    }
    //Metodo per stampare a video il menù, utilizzato in menuSecondario
    public static void stampaMenù()
    {
        for (int i = 0; i < piattiList.size(); i++)
        {
            System.out.print("Nome: " + piattiList.get(i) + "\t|\t" + "Ingredienti: " + ingredienti1List.get(i) + ", " + ingredienti2List.get(i) + "\t | \t" + "Prezzo: " + prezziList.get(i) + "\n");
        }
        System.out.println("\nRitorno al menù secondario...");
        menuSecondario();
    }
    //Metodo per resettare l'arrayList utente e credito
    public static void resettaArray()
    {
        for (int i = 0; i < utenteList.size(); i++)
        {
            //Rimuovo il nome inserito e il credito salvato negli arrayList
            utenteList.remove(i);
        }
    }
}