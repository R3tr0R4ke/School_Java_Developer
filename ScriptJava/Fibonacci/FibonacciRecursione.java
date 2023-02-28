import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;

public class FibonacciRecursione {

    public static void main (String [] args)
    {
        //-----------------------------TEST JDBC-----------------------------
        String url = "jdbc:mysql://localhost:3306/world";
        //Driver li prende in automatico DriverManager
        //String driver = "com.mysql.jdbc.Driver";      //nome del driver di MySql ovvero il connector

        //Dichiaro la connessione
        //Connection myConnection = null;    
        //Si potrebbe utilizzare anche questo sotto ma meglio farlo in un try catch 
        //DriverManager.getConnection(url, user:"root", password:"root");

        try
        {
            Connection myConnection = null;
            myConnection = DriverManager.getConnection(url, "root", "root");
        
            if(myConnection == null)
            {
                System.out.println("Connessione non stabilita");
            }
            else
            {
                System.out.println("Connessione avvenuta con successo");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //-----------------------------FINE TEST JDBC-----------------------------
        
        //Scanner per l'inserimento del numero e della scelta nel menù
        Scanner myNumero = new Scanner(System.in);
        Scanner myScelta = new Scanner(System.in);

        boolean primaScelta = false;

        do
        {
            System.out.print("\nQuale operazione vuoi eseguire?\n1: Stampo serie di fibonacci\n2: Cerco numero di fibonacci\n3: Termina programma\nInserisci scelta: ");
            int scelta = myScelta.nextInt();

            switch (scelta)
            {
                case 1:
                    //Chiedo la quantità di numeri da visualizzare
                    System.out.print("\nInserisci quanti numeri vuoi stampare: ");
                    int numero = myNumero.nextInt();

                    for (int i = 0; i <= numero; i++)
                    {
                        //Richiamo il metodo fibonacci
                        int numeroFibonacci = serieFibonacci(i);
                        System.out.print(" " + numeroFibonacci);
                    }
                    System.out.print("\n");
                    //Esco dal ciclo
                    primaScelta = false;
                break;

                case 2:
                    //Chiedo di inserire il numero in input
                    System.out.print("\nInserisci un numero e ti dirò fino a quale numero della serie di fibonacci equivale: ");
                    int num = myNumero.nextInt();

                    //Assegno il risultato del metodo caclFibonacci a risultato
                    int risultato = calcFibonacci(num);
                    //Mostro il risultato e richiedo se si vuole trovare un altro numero o terminare il programma
                    System.out.println("Il numero inserito è " + num + ", nella serie di fibonacci equivale a: " + risultato);

                    System.out.print("\nVuoi tornare al menù principale o terminare il programma?\n1: Continua\n2: Termina\nInserisci scelta: ");
                    int scelta2 = myScelta.nextInt();
                        
                    switch (scelta2)
                    {
                        case 1: 
                            //Il programma continua e torno all'inzio del do - while
                            System.out.println("\nRitorno al calcolo del numero");
                            primaScelta = false;
                        break;

                        case 2:
                            //Il programma termina 
                            System.out.println("\nTermino il programma!!!");
                            primaScelta = true;
                        break;

                        default:
                            //Ritorno al calcolo del numero, il programma continua
                            System.out.println("Inserimento errato, ritorno al calcolo del numero...");
                        break;
                    }

                break;

                case 3:
                    System.out.print("\nTermino il programma...");
                    primaScelta = true;
                    break;

                default:
                    //Se l'utente sbaglia l'inserimento ritorno alla richiesta iniziale
                    System.out.println("Input errato, ritorno alla richieste...");
                break;
            }
        }
        while(primaScelta == false);  
        
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

    /*public static void fibonacci(int n)
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
    }*/

    public static int serieFibonacci(int n)
    {
        if (n < 2)
        {
            return n;
        }  
        else
        {
            return serieFibonacci(n - 1) + serieFibonacci(n - 2);
        }     
    }
}
