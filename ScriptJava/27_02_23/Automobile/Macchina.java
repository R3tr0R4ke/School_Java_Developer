package Automobile;
import java.util.Scanner;

public class Macchina 
{ 
    

public class Freni
{
    public static String nomeFreni;
    public static int PF;               //potenza frenante
    public static int NP;               //numero pastiglie

    public static Scanner myPastiglie = new Scanner(System.in);
    public static Scanner myPoteFrenante = new Scanner(System.in);

    

    public static void settaPotFren ()
    {
        System.out.print("\nInserire quante pastiglie si desidera inserire: ");
        Freni.NP = myPastiglie.nextInt();

        System.out.print("Potenza frenante: " + Freni.NP);
    }

    public static void settaNumPastiglie()
    {
        System.out.print("\nInserire la potenza frenante: ");
        Freni.PF = myPoteFrenante.nextInt();

        System.out.println("Numero pastiglie: " + Freni.PF);
    }

}

public class Motore
{
    public static int cilindrata;
    public static int numPistoni;

    public static Scanner myCilindrata = new Scanner(System.in);
    public static Scanner myNumPistoni = new Scanner(System.in);



    

    public static void settaCilindrata ()
    {

    }

    public static void settaNumPistoni ()
    {

    }
}

    public static void main (Object [] args)
    {
        

        
    

    }

}
