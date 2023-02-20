import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class esArray 
{
    //Scanner e variabile per la selezione delle scelte nei menù
    public static Scanner mySelezione = new Scanner(System.in);
    public static int selezione;

    public static Integer[] arrayInt = {1,2,3,4,5,6};
    public static String[] arrayStr = {"nome", "cognome", "email", "età"};

    public static void main (String [] args)
    {
        metSelezione();
    }   
    
    public static void metSelezione()
    {
        System.out.print("\nQuale array vuoi visualizzare?\n1: Interi\n2: Stringhe\n3: Termina programma\nInserisci scelta: ");
        selezione = mySelezione.nextInt();

        switch (selezione)
        {
            case 1:
                //Stampo l'array di interi
                System.out.println("Array:" + Arrays.toString(arrayInt));
                aggiuntaElemento();
                break;

            case 2:
                for (String string : arrayStr) 
                {
                    //stampo l'array
                    System.out.printf(string + " ");
                }
                aggiuntaElemento();
                break;

            case 3:
                System.out.println("Termino il programma!!!");
                break;

            default:
                System.out.print("Inserimento errato. Reinserire opzione: ");
                metSelezione();
                break;
        }
    }

    public static void aggiuntaElemento()
    {
        System.out.print("\nVuoi aggiungere un elemento in quale array?\n1: Interi\n2: Stringhe\nScegli a quale array aggiungere: ");
        selezione = mySelezione.nextInt();
        
        switch (selezione)
        {
            case 1:
                ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arrayInt));
                arrayList.add(7);
                arrayInt = arrayList.toArray(arrayInt);
                System.out.println("Array after adding element: " + Arrays.toString(arrayInt));
                metSelezione();
                break;

            case 2:
                ArrayList<String> arrayLista = new ArrayList<String>(Arrays.asList(arrayStr));
                arrayLista.add("Ciccio");
                arrayStr = arrayLista.toArray(arrayStr);
                System.out.println("Array after adding element: " + Arrays.toString(arrayStr));
                metSelezione();
                break;

            default:
                System.out.print("Inserimento errato. Reinserire scelta: ");
                aggiuntaElemento();
                break;
        }
    }
}
