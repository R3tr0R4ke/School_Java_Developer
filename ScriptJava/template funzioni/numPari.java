import java.util.Scanner; //Libreria Scanner

public class numPari {
    public static void main(String[] args) 
    {
        //Scanner per il primo valore
        Scanner num = new Scanner(System.in);
        float valorePrimo;

        // Inserimento del primo valore
        System.out.println("Inserisci il primo numero");
        valorePrimo = num.nextFloat();

        int modulo = 2;

        boolean pari = (valorePrimo % modulo) == 0;

        //Se il numero è pari stampo true
        System.out.print("Il " + valorePrimo + " è Pari? ");
        System.out.println(pari);

        /*if (valorePrimo % modulo == 0)
        {
            System.out.println(valorePrimo + " è un numero Pari");
        }
        else
        {
            System.out.println(valorePrimo + " è un numero Dispari");
        }*/

        num.close();
    }
}