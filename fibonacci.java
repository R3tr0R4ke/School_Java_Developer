import java.util.Scanner;

public class fibonacci {
    
    public static void main (String [] args)
    {
        //Boolean che permette di continuare o terminare il programma in base al suo valore
        boolean continuaProg = false;
        //Scanner per l'inserimento del numero e della scelta nel menù
        Scanner myNumero = new Scanner(System.in);
        Scanner myScelta = new Scanner(System.in);

        do
        {
            //Chiedo di inserire il numero in input
            System.out.print("Inserisci un numero e ti dirò fino a quale numero della serie di fibonacci arriva: ");
            int numero = myNumero.nextInt();
            //Assegno il risultato del metodo caclFibonacci a risultato
            int risultato = calcFibonacci(numero);
            //Mostro il risultato e richiedo se si vuole trovare un altro numero o terminare il programma
            System.out.println("Il numero inserito " + numero + " nella serie di fibonacci equivale a: " + risultato);
            System.out.print("Vuoi trovare un altro numero o terminare il programma?\n1: Continua\n2: Termina\nInserisci scelta: ");
            int scelta = myScelta.nextInt();

            switch (scelta)
            {
                case 1: 
                    //Il programma continua e torno all'inzio del do - while
                    System.out.println("Ritorno al calcolo del numero");
                    continuaProg = false;
                    break;

                case 2:
                    //Il programma termina 
                    System.out.println("Termino il programma!!!");
                    continuaProg = true;
                    break;

                default:
                    //Ritorno al calcolo del numero, il programma continua
                    System.out.println("Inserimento errato, ritorno al calcolo del numero...");
                    break;
            }
        }
        while(continuaProg == false);
        //Chiudo gli scanner
        myNumero.close();
        myScelta.close();
    }
    //Metodo per trovare il numero nella serie di fibonacci in base al numero inserito
    public static int calcFibonacci(int num)
    {
        //Condizione per il numero 0 e 1
        if ( 0 == num || 1 == num)
        {
            //Stampo semplicemente 0 o 1
            return num;
        }
        else
        {
            //Trovo il numero di fibonacci
            return calcFibonacci(num - 1) + calcFibonacci(num - 2);
        }
    }
}
