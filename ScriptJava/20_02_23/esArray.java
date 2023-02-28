import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class esArray 
{
    //Scanner e variabile per la selezione delle scelte nei menù
    public static Scanner mySelezione = new Scanner(System.in);
    public static int selezione;

    //Dichiaro e inizializzo gli array 
    public static Integer[] arrayInt = {1,2,3,4,5,6};
    public static String[] arrayStr = {"nome", "cognome", "email", "età"};

    //Scanner e variabili utilizzati per l'aggiunta di un elemento all'array
    public static Scanner myAggiunta = new Scanner(System.in);
    public static Integer aggiuntaInt;
    public static String aggiuntaStr;

    public static void main (String [] args)
    {
        //Richiamo il metodo che inizia il programma
        metSelezione();

        mySelezione.close();
        myAggiunta.close();
    }   
    
    //Metodo per la selezione del menù principale
    public static void metSelezione()
    {
        System.out.print("\nQuale array vuoi visualizzare?\n1: Interi\n2: Stringhe\n3: Termina programma\nInserisci scelta: ");
        //Navigazione nel menù principale
        selezione = mySelezione.nextInt();

        switch (selezione)
        {
            case 1:
                //Stampo l'array di interi
                System.out.println("Array:" + Arrays.toString(arrayInt));
                //Richiamo il metodo per aggiungere l'elemento all'array di interi
                aggiuntaElemento();
                break;

            case 2:
                //Stampo l'array di stringhe
                for (String string : arrayStr) 
                {
                    //stampo l'array
                    System.out.printf(string + " ");
                }
                //Richiamo il metodo per aggiungere l'elemento all'array di interi
                aggiuntaElemento();
                break;

            case 3:
                //Termino semplicemente il programma
                System.out.println("Termino il programma!!!");
                break;

            default:
                System.out.print("Inserimento errato. Reinserire opzione: ");
                //Richiamo il metodo per poter reinserire la mia scelta
                metSelezione();
                break;
        }
    }

    //Metodo per aggiungere un elemento ad un array
    public static void aggiuntaElemento()
    {
        System.out.print("\nVuoi aggiungere un elemento in quale array?\n1: Interi\n2: Stringhe\nScegli a quale array aggiungere: ");
        //Navigo nel secondo menù
        selezione = mySelezione.nextInt();
        
        switch (selezione)
        {
            case 1:
                //Richiamo il metodo per aggiungere un elemento all'array di interi
                aggiungiArrInt();
                //Torno al menù principale
                metSelezione();
                break;

            case 2:
                //Richiamo il metodo per aggiungere un elemento all'array di stringhe
                aggiungiArrStr();
                //Torno al menù principale
                metSelezione();
                break;

            default:
                System.out.print("Inserimento errato. Reinserire scelta: ");
                //Richiedo quale array voglio modificare
                aggiuntaElemento();
                break;
        }
    }

    //Metodo per aggiungere un elemento all'array di interi
    public static void aggiungiArrInt()
    {
        //Creo un ArraList di Interi
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arrayInt));
        System.out.print("Inserisci l'elemento da aggiungere (Intero): ");
        //Inserisco in input l'intero che voglio aggiungere all'array
        arrayList.add(aggiuntaInt = myAggiunta.nextInt());
        arrayInt = arrayList.toArray(arrayInt);
        //Stampo l'array con l'elemento aggiunto
        System.out.println("Array after adding element: " + Arrays.toString(arrayInt));
    }

    //Metodo per aggiungere un elemento all'array di stringhe
    public static void aggiungiArrStr()
    {
        //Creo un ArraList di Stringhe
        ArrayList<String> arrayLista = new ArrayList<String>(Arrays.asList(arrayStr));
        System.out.print("Inserisci l'elemento da aggiungere (Stringa): ");
        //Inserisco in input l'intero che voglio aggiungere all'array
        arrayLista.add(aggiuntaStr = myAggiunta.nextLine());
        arrayStr = arrayLista.toArray(arrayStr);
        //Stampo l'array con l'elemento aggiunto
        System.out.println("Array after adding element: " + Arrays.toString(arrayStr));
    }
}
