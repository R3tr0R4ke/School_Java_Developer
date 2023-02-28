import java.util.Scanner;

public class es1 
{
    static int x;
    static boolean y;

    public static void main (String [] args)
    {
        es1 myObj1 = new es1();
        es1 myObj2 = new es1();

        Scanner myNum = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        x = myNum.nextInt();

        System.out.println(myObj1.x);
        if (x > 50)
        {
            myObj2.y = true;
            System.out.println(myObj2.y);
        }
        else
        {
            myObj2.y = false;
            System.out.println(myObj2.y);
        }

        myNum.close();
    }
}
