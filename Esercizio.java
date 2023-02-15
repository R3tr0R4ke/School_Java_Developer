package Progettini;
import java.util.Scanner;

public class Esercizio {
    public static void main (String [] args)
    {
        //Scanner per il numero da inserire
        Scanner myNum = new Scanner(System.in);
        //Chiedo in input il numero
        System.out.print("Inserisci un numero: ");
        float numero = myNum.nextFloat();

        //Scanner per il numero da inserire
        Scanner myStr = new Scanner(System.in);
        //Chiedo in input la stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = myStr.nextLine();

        //setto il dato boolMio a true
        Scanner myQuest = new Scanner(System.in);
        //Chiedo cosa preferisci in input
        System.out.print("Preferisci gatto o cane? Inserisci la risposta: ");
        String quest = myQuest.nextLine();

        if (quest == "cane" || quest == "Cane")
        {
            System.out.println("Anche a me piacciono i cani!!!");
            Boolean datoBool = true;
            myQuest.close();
        }
        else if (quest == "gatto" || quest == "Gatto")
        {
            System.out.println("Cing Cong, è pronto il piatto!!!");
            Boolean datoBool = true;
            myQuest.close();
        }
        if (!quest.equals("gatto") && !quest.equals("Gatto") && !quest.equals("cane") && !quest.equals("Cane"))
        {
            System.out.println("Hai sbagliato a scrivere, riavvia il programma!!!");
            Boolean datoBool = false;
            myQuest.close(); 
            System.exit(0);
        }

        Scanner myScelta = new Scanner(System.in);
        System.out.print("Inserire lo script da eseguire: (1: Funzioni matematiche, 2: Funzioni Stringa, 3: casting): ");
        int scelta = myScelta.nextInt();

        switch (scelta)
        {
            case 1:
                funzMate(numero);
                myScelta.close();
                myStr.close();
                myNum.close();
                break;

            case 2:
                funzString(stringa);
                break;

            case 3:
                cast(numero);
                break;
        }
    }

    static void funzMate (float numeroFunzione)
    {
        float somma = numeroFunzione + numeroFunzione;
        System.out.println("\nLa somma del numero per se stesso è: " + somma);
        
        float sottrazione = numeroFunzione - numeroFunzione;
        System.out.println("La sottrazione del numero per se stesso è: " + sottrazione);

        float divisione = numeroFunzione / numeroFunzione;
        System.out.println("La divisione del numero per se stesso è: " + divisione);

        float moltiplicazione = numeroFunzione *numeroFunzione;
        System.out.println("La moltiplicazione del numero per se stesso è: " + moltiplicazione);
    }

    static void funzString (String parola)
    {
        String subStr = parola.substring(4);
        System.out.println("Il substring della stringa inserita è: " + subStr);
    }

    static void cast (float num)
    {
        double doubleNum = num;
        System.out.println("Il numero double è: " + doubleNum);
    }
}
