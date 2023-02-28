import java.util.Scanner; // import the Scanner class

public class inserimento 
{
    static public void main(String [] args)
    {
        //Scanner per il numero intero e la stringa da inserire
        Scanner myInt = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        
        //Chiedo in input il numero intero
        System.out.print("Inserire numero intero: ");
        int numeroInt = myInt.nextInt();

        //Converto da intero a double
        double numeroDouble = numeroInt;
        System.out.println("Numero intero a double: " + numeroDouble);
        //Converto da intero a float
        float numeroFloat = numeroInt;
        System.out.println("Numero intero a float: " + numeroFloat);

        //Chiedo in input una stringa
        System.out.print("Inserire una stringa: ");
        String myString = stringInput.nextLine();
        
        //Converto da stringa a char
        char stringToChar = myString.charAt(0);
        System.out.println("La stringa a carattere è: " + stringToChar);

        myInt.close();
        stringInput.close();
    }  
}

