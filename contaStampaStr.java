import java.util.Scanner;

public class contaStampaStr {
    
    public static void main (String [] args)
    {
        //Chiedo se voglio avviare la conto in input
        System.out.print("Vuoi avviare la conta? (s / n): ");
        Scanner myRisp = new Scanner(System.in);
        //Inserisco in input la mia risposta
        String risposta = myRisp.nextLine();

        //Se la risposta è si
        if (risposta.equals("S") | risposta.equals("s"))
        {
            //Chiedo di inserire un numero in input
            System.out.print("Inserire un numero: ");
            Scanner myNum = new Scanner(System.in);
            //Inserisco un numero
            int num = myNum.nextInt();

            //La conta di i va da 1 al numero inserito in input
            for (int i = 1; i <= num; i++)
            {
                //Stampo i + 1 dopo ogni iterazione
                System.out.println(i);
            }
            myNum.close();
            myRisp.close();
            System.out.println("Conta terminata!!!");
        } 
        //Altrimenti se la risposta è no
        else if (risposta.equals("N") | risposta.equals("n"))
        {
            //Chiedo se voglio stampare una stringa
            System.out.print("Vuoi stampare un stringa? (s / n): ");
            //Inserisco la mia risposta in input
            String secondaRisposta = myRisp.nextLine();
            //Se la risposta è si
            if (secondaRisposta.equals("S") || secondaRisposta.equals("s"))
            {
                System.out.print("Inserire la stringa da stampare: ");
                Scanner myStr = new Scanner(System.in);
                //Inserisco la stringa in input
                String stampaStringa = myStr.nextLine();

                //stampo un carattere + spazio + carattere fino a esaurimento elementi della stringa
                for (int i = 0; i < stampaStringa.length(); i++) {
                    char c = stampaStringa.charAt(i);
                    System.out.print(c + " ");
                }
                myStr.close();
            }
            //Altrimenti se la risposta è no
            else if (secondaRisposta.equals("n") || secondaRisposta.equals("N"))
            {
                System.out.println("TERMINO IL PROGRAMMA!!!");
            }
        }
    }
}