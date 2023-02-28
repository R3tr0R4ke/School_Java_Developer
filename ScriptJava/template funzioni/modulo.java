import java.util.Scanner;

public class modulo {
    static public void main (String [] args)
    {
        //Scanner per il primo valore
        Scanner myNum1 = new Scanner(System.in);
        int num1;

        //Inserisco il primo numero
        System.out.println("Inserire il primo numero: ");
        num1 = myNum1.nextInt();

        //Scanner per il secondo valore
        Scanner myNum2 = new Scanner(System.in);
        int modulo;

        //Inserisco il secondo numero
        System.out.println("Inserire il secondo numero: ");
        modulo = myNum2.nextInt();

        //Stampo il risultato
        System.out.println(num1 + " modulo " + modulo + " è: " + (num1 % modulo));

        myNum1.close();
        myNum2.close();
    }
}
