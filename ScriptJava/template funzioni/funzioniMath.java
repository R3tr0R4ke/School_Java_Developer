import java.util.Scanner;

//Funzioni Math in Java

public class funzioniMath 
{
        public static void main(String [] args)
    {
        //Scanner per il primo numero
        Scanner myNum1 = new Scanner(System.in);

        //Chiedo in input il primo numero
        System.out.print("Inserire il primo numero: ");
        float primoNumero = myNum1.nextFloat();

        //Scanner per il secondo numero
        Scanner myNum2 = new Scanner(System.in);

        //Chiedo in input il secondo numero
        System.out.print("Inserire il secondo numero: ");
        float secondoNumero = myNum2.nextFloat();

        //Calcolo il valore massimo tra due numeri
        float maxValore = Math.max(primoNumero, secondoNumero);
        System.out.println("Il valore massimo tra i due numeri inseriti è: " + maxValore);

        //Calcolo il valore minimo tra due numeri
        float minValore = Math.min(primoNumero, secondoNumero);
        System.out.println("Il valore massimo tra i due numeri inseriti è: " + minValore);

        //Calcolo la radice quadrata dei due numeri inseriti
        double radiceNumPrimo = Math.sqrt(primoNumero);
        double radiceNumSecondo = Math.sqrt(secondoNumero);
        System.out.println("La radice del primo numero è: " + radiceNumPrimo);
        System.out.println("La radice del secondo numero è: " + radiceNumSecondo);

        //Calcolo il valore assoluto dei due numeri inseriti
        float valoreAssPrimo = Math.abs(primoNumero);
        float valoreAssSecondo = Math.abs(secondoNumero);
        System.out.println("Il valore assoluto del primo numero è: " + valoreAssPrimo);
        System.out.println("Il valore assoluto del secondo numero è: " + valoreAssSecondo);

        myNum1.close();
        myNum2.close();

        //Genero un numero casuale
        double numCasuale = Math.random();
        System.out.println("Genero un numero random. Il numero uscito è: " + numCasuale);
        
        int randomNum = (int)(Math.random() * 101);    //0 to 100
        System.out.println("Genero un numero random da 0 a 100. Il numero uscito è: " + randomNum);
    }
}
