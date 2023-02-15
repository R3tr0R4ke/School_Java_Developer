package Progettini;
import java.util.Scanner;

public class es2 
{
    public static void main (String [] args)
    {
        //Scanner per il primo numero
        Scanner myNum1 = new Scanner(System.in);
        //Chiedo in input il primo numero
        System.out.print("Inserire il primo numero: ");
        double primoNumero = myNum1.nextDouble();

        //Scanner per il secondo numero
        Scanner myNum2 = new Scanner(System.in);
        //Chiedo in input il secondo numero
        System.out.print("Inserire il secondo numero: ");
        double secondoNumero = myNum2.nextDouble();

        //Scanner per le opzioni da scegliere per la calcolatrice
        Scanner myOption = new Scanner(System.in);
        //Chiedo che operazione voglio eseguire
        System.out.print("Che operazione vuoi eseguire?\n 1 per sommare: \n 2 per sottrare: \n 3 per somma radici quadre: \n 4 per somma radice valori assoluti: ");
        int opzione = myOption.nextInt();

        if (opzione == 1)   //se == 1, faccio la somma dei due numeri
        {
            //Eseguo la somma dei due numeri;
            double sommaNumeri = primoNumero + secondoNumero;
            //Eseguo i controlli sul risultato
            controlli(sommaNumeri);
        }
        else if (opzione == 2)      //se == 2, sottraggo i due numeri
        {
            double sottraiNumeri = primoNumero - secondoNumero;
            //Eseguo il controllo sul risultato
            controlli(sottraiNumeri);
        }
        else if (opzione == 3)      //se == 3, sommo le radici quadre
        {
            double sommaRadici = Math.sqrt((float)primoNumero) + Math.sqrt((float)secondoNumero);
            controlli(sommaRadici);
        }
        else if (opzione == 4)      //se == 4, sottraggo il valore assoluto delle radice quadre dei dui numeri
        {
            //Trovo i valori minimi e massimi tra due numeri
            double maxNum = Math.max(primoNumero, secondoNumero);
            double minNum = Math.min(primoNumero, secondoNumero);
            //Calcolo la sottrazione dei delle radice quadre del valore minimo e massimo
            double sotrRadMaxMin = Math.sqrt(maxNum) - Math.sqrt(minNum);
            //Eseguo controllo sul risultato
            controlli(sotrRadMaxMin);
        }

        myOption.close();
        myNum1.close();
        myNum2.close();
    }

    //Metodo che esegue controlli sul risultato delle operazioni
    static void controlli (double numControllo)
    {
        if (numControllo < 0 || numControllo > 0)   //Se il risultato ha numero negativo o positivo
            {
                //Stampo il valore assoluto del risultato
                System.out.println("L'operazione da come risultato: " + Math.abs(numControllo));
                //Se il numero è intero
                if (numControllo % 1 == 0)  
                {
                    //Stampo che il numero è un intero
                    System.out.println("Il numero calcolato è un intero!!!");
                    //Controllo se è pari
                    if (numControllo % 2 == 0)
                    {
                        //Stampo che è pari
                        System.out.println("Il numero è pari!!!");
                    }
                }
                else    //Se il numero è in virgola mobile
                {
                    //Eseguo il troncamento del numero decimale
                    double numTroncato = Math.floor(numControllo * Math.pow(10, 2) / Math.pow(10, 2));
                    //Mi salvo la parte decimale eliminata
                    double decimaleRimosso = numControllo - numTroncato;
                    //Stampo la parte decimale
                    System.out.println("Il numero in virgola mobile troncato è: " + numTroncato);
                    System.out.println("Troncamento eseguito, il valore decimale rimosso è: " + decimaleRimosso);
                }
            }
    }
}
