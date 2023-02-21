import java.util.ArrayList;
import java.util.Scanner;

public class accountArray {
    public static void main(String[] args) 
    {
        //Dichiaro gli array list che conterrannò i dati utente
        ArrayList<String> nomeList = new ArrayList<>();
        ArrayList<String> cognomeList = new ArrayList<>();
        ArrayList<Integer> etaList = new ArrayList<>();
        ArrayList<String> passwordList = new ArrayList<>();

        //Dicharo gli scanner che mi serviranno per la navigazione in menù e per gli inserimenti in input
        Scanner myScelta = new Scanner(System.in);
        Scanner myNome = new Scanner(System.in);
        Scanner myRicerca = new Scanner(System.in);
        Scanner myPassword = new Scanner(System.in);
        Scanner myModificaDato = new Scanner(System.in);

        //Variabile utile per terminare il programma quando ha valore true
        boolean termina = false;

        do 
        {
            //Richiedo l'operazione che si vuole eseguire
            System.out.print("\nCosa vuoi fare? Premere uno dei seguenti tasti...\n1: Terminare\n2: Registra\n3: Visualizza\n4: Modifica: \nInserisci scelta: ");
            //Inserisco scelta dell'operazione da eseguire
            int scelta = myScelta.nextInt();

            switch (scelta)
            {
                //Se la scelta è la prima
                case 1:
                    //Stampo "Termina programma" e setto termina a true per uscire dal programma
                    System.out.println("\nTermino programma...");
                    termina = true;
                break;

                //Se la scelta è la seconda                    
                case 2:
                    System.out.print("\nInserisci il nome: ");
                    //Inserisco il nome
                    String nome = myNome.nextLine();
                    System.out.print("Inserisci il cognome: ");
                    //Inserisco il congnome
                    String cognome = myNome.nextLine();
                    System.out.print("Inserisci l'età: ");
                    //Inserisco età
                    int eta = myNome.nextInt();
                    myNome.nextLine();
                    System.out.print("Inserisci la password: ");
                    //Imposto la password
                    String password = myNome.nextLine();
                    //Aggiungo i valori come elemnti ai rispetti arrayList
                    nomeList.add(nome);
                    cognomeList.add(cognome);
                    etaList.add(eta);
                    passwordList.add(password);
                break;

                case 3:
                        System.out.print("\nInserisci il nome o cognome da cercare: ");
                        //Inserisco nome o cognome da cercare
                        String cerca = myRicerca.nextLine();
                        //Effettuo la ricerca per il nome o cognome inserito
                        for (int i = 0; i < passwordList.size(); i++) 
                        {
                            //Se trovo il nome o cognome cercato
                            if (cerca.equals(nomeList.get(i)) || cerca.equals(cognomeList.get(i))) 
                            {
                                //Stampo i dati dell'account trovato
                                System.out.println("Nome: " + nomeList.get(i) + " | " +  "Cognome: " +  cognomeList.get(i) + " | " + "Età: " + etaList.get(i));
                            }
                            else
                            {
                                System.out.println("Account non trovato");
                            }
                            //Torno al menu principale una volta uscito dall'if-else
                        }
                    break;
                    
                    //Se la scelta del menu principale è la quarta
                    case 4:
                        System.out.print("\nInserisci il nome o cognome account da cercare: ");
                        //Inserisco nome o cognome da cercare
                        String cercaAccount = myRicerca.nextLine();
                        //Effettuo la ricerca per il nome o cognome inserito
                        for (int i = 0; i < nomeList.size(); i++) 
                        {
                            //Se trovo il nome o cognome cercato
                            if (cercaAccount.equals(nomeList.get(i)) || cercaAccount.equals(cognomeList.get(i))) 
                            {
                                //Dichiaro una variabile per uscire dal prossimo ciclo
                                Boolean sceltaInserita = false;
                                //Stampo i dati dell'account trovato
                                System.out.println("Nome: " + nomeList.get(i) + " | " +  "Cognome: " +  cognomeList.get(i) + " | " + "Età: " + etaList.get(i));

                                do
                                {
                                    System.out.println("\nVuoi modificare l'account o eliminare dati?\n1: Modifica\n2: Elimina\n3: Indietro\nInserisci scelta: ");
                                    //Inserisco la decisione sull'operazione da eseguire
                                    int scelta3 = myScelta.nextInt();

                                    switch (scelta3)
                                    {
                                        //Caso 1 = Operazione modifica
                                        case 1:
                                            //Richiedo la password dell'account trovato
                                            System.out.println("Inserisci password account: ");
                                            String passwordAccount = myPassword.nextLine();
                                            //Creo le variabili che utilizzo per attribuire le nuov modifiche
                                            String nuovoNome;
                                            String nuovoCognome;
                                            int nuovaEta;
                                            //Creo un boolean per uscire dal prossimo menù se impostato a true
                                            boolean modificaInserita = false;

                                            //Controllo che la password si uguale a quella dell'account
                                            if (passwordAccount.equals(passwordList.get(i)))
                                            {
                                                do 
                                                {                                                  
                                                    System.out.print("Cosa vuoi modificare?\n1: Nome\n2: Cognome\n3: Età\n4: Slogga\nInserisci scelta: ");
                                                    //Inserisco decisione della operazione da eseguire
                                                    int scelta4 = myScelta.nextInt();

                                                    switch (scelta4) 
                                                    {
                                                        //Nome
                                                        case 1:
                                                            System.out.print("\nInserisci nuovo nome: ");
                                                            //Modifico il nome dell'account
                                                            nomeList.set(i, nuovoNome = myModificaDato.nextLine());
                                                            System.out.println("Modifica eseguita!!!\n");
                                                            break;
                                                        //Cognome
                                                        case 2:
                                                            System.out.print("\nInserisci nuovo cognome: ");
                                                            //Modifico il cognome dell'account
                                                            cognomeList.set(i, nuovoCognome = myModificaDato.nextLine());
                                                            System.out.println("Modifica eseguita!!!\n");
                                                            break;
                                                        //Età
                                                        case 3:
                                                            System.out.print("\nInserisci nuovo età: ");
                                                            //Modifico l'età dell'account
                                                            etaList.set(i, nuovaEta = myModificaDato.nextInt());
                                                            System.out.println("Modifica eseguita!!!\n");
                                                            break;
                                                        //Slogga dall'account
                                                        case 4:
                                                            System.out.println("Sloggo dall'account...");
                                                            //Esco dal ciclo e torno al menù precedente
                                                            modificaInserita = true;
                                                            break;
                                                        //Inserimento in input errato
                                                        default:
                                                            System.out.println("\nInserimento errato!!! Prego reinserire scelta...");
                                                            //Richiedo di inserire in input l'operazione da eseguire
                                                            modificaInserita = false;
                                                            break;
                                                    }
                                                }
                                                //Condizione d'uscita per il menù modifica
                                                while (modificaInserita == false);       
                                            }
                                            //Se la password è sbagliato durante l'inserimento, torno al menù precedente
                                            else
                                            {
                                                System.out.println("Password errata!!! Ritorno indietro");
                                                break;
                                            }
                                        //break caso 1 (Modifica)
                                        break;

                                        //Caso Elimina
                                        case 2:
                                            //Richiedo la password dell'account trovato
                                            System.out.println("Inserisci password account: ");                                           
                                            String passwordAccount2 = myPassword.nextLine();
                                            //Creo un boolean per uscire dal prossimo menù se impostato a true
                                            boolean modificaInserita2 = false;

                                            //Controllo che la password si ugale a quella dell'array passwordList
                                            if (passwordAccount2.equals(passwordList.get(i)))
                                            {
                                                
                                                do
                                                {
                                                    System.out.print("Sicuro di voler eliminare l'account? (s / n): ");
                                                    String eliminaScelta = myScelta.nextLine();

                                                    switch (eliminaScelta) 
                                                    {
                                                        case "S":
                                                            System.out.print("\nEliminazione account...\n");
                                                            nomeList.remove(i);
                                                            cognomeList.remove(i);
                                                            passwordList.remove(i);
                                                            System.out.println("ACCOUNT ELIMINATO...");
                                                            break;
                                                        
                                                        case "s":
                                                            System.out.print("\nEliminazione account...");
                                                            nomeList.remove(i);
                                                            cognomeList.remove(i);
                                                            passwordList.remove(i);
                                                            modificaInserita2 = true;
                                                            break;

                                                        case "N":
                                                            System.out.println("Torno indietro...");
                                                            modificaInserita2 = true;
                                                            break;

                                                        case "n":
                                                            System.out.println("Torno indietro...");
                                                            modificaInserita2 = true;
                                                            break;

                                                        default:
                                                            System.out.println("Inserimento erratto... Prego reinserire scelta");
                                                            modificaInserita2 = false;
                                                            break;
                                                    }
                                                }
                                                while(modificaInserita2 == false);
                                            }

                                            break;

                                        //Torna indietro
                                        case 3:
                                            System.out.println("Torno al menù principale...");
                                            sceltaInserita = true;
                                            break;

                                        //Input sbagliato, chiedo reinserimento
                                        default:
                                            System.out.print("Input sbagliato. Reinserire scelta: ");
                                            sceltaInserita = false;
                                            break;
                                    }
                                }
                                while(sceltaInserita == false);
                            }
                            else
                            {
                                System.out.println("Account non trovato");
                            }
                            //Torno al menu principale una volta uscito dall'if-else
                        }
                        break;
                
                //Se l'utente sbaglia input: 
                default:
                    //Torno al menu della scelta
                    System.out.println("\nScelta non valida.");
                    termina = false;
                    break;
            }
        }
        //Condizione di uscita dal menù principale e dal programma
        while(termina == false);

        myModificaDato.close();
        myNome.close();
        myPassword.close();
        myRicerca.close();
        myScelta.close();
    }
}
