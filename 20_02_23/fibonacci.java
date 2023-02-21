import java.util.Scanner;

public class esFibonacci {
    
    public static void main (String [] args)
    {
        //Boolean che permette di continuare o terminare il programma in base al suo valore
        boolean continuaProg = false;
        //Scanner per l'inserimento del numero e della scelta nel menù
        Scanner myNumero = new Scanner(System.in);
        Scanner myScelta = new Scanner(System.in);

        boolean primaScelta = false;

        do
        {
            do
            {
                System.out.print("\nQuale operazione vuoi eseguire?\n1: Stampo serie di fibonacci\n2: Cerco numero di fibonacci\n3: Termina programma\nInserisci scelta: ");
                int scelta = myScelta.nextInt();

                switch (scelta)
                {
                    case 1:
                        //Chiedo la quantità di numeri da visualizzare
                        System.out.print("Inserisci quanti numeri vuoi stampare: ");
                        int numero = myNumero.nextInt();
                        //Richiamo il metodo fibonacci
                        fibonacci(numero);
                        //Esco dal ciclo
                        primaScelta = true;
                        break;

                    case 2:
                        //Chiedo di inserire il numero in input
                        System.out.print("\nInserisci un numero e ti dirò fino a quale numero della serie di fibonacci arriva: ");
                        int num = myNumero.nextInt();

                        //Assegno il risultato del metodo caclFibonacci a risultato
                        int risultato = calcFibonacci(num);
                        //Mostro il risultato e richiedo se si vuole trovare un altro numero o terminare il programma
                        System.out.println("Il numero inserito " + num + " nella serie di fibonacci equivale a: " + risultato);

                        System.out.print("Vuoi tornare al menù principale o terminare il programma?\n1: Continua\n2: Termina\nInserisci scelta: ");
                        int scelta2 = myScelta.nextInt();
                        
                        switch (scelta2)
                        {
                            case 1: 
                                //Il programma continua e torno all'inzio del do - while
                                System.out.println("Ritorno al calcolo del numero\n");
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
                        break;

                    case 3:
                        System.out.print("Termino il programma...");
                        break;

                    default:
                        //Se l'utente sbaglia l'inserimento ritorno alla richiesta iniziale
                        System.out.println("Input errato, ritorno alla richieste...");
                        break;
                }
            }
            while(primaScelta == false);  
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

    public static void fibonacci(int n)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;
  
        //Itera fino a quando il contatore diventa n
        while (counter < n) 
        {
            //Stampo il numero
            System.out.print(num1 + " ");
            //Cambio i valori alle variabili in modo che ciascuna assuma il valore dell'ultimo
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter ++;
        }
        //Vado a capo
        System.out.println("");
    }
}

