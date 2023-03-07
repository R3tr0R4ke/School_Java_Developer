import java.util.Scanner;

public class es1 
{
    static int x;
    static boolean y;

    public static void main (String [] args)
    {
        Scanner myNum = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        x = myNum.nextInt();

        System.out.println(es1.x);
        if (x > 50)
        {
            es1.y = true;
            System.out.println(es1.y);
        }
        else
        {
            es1.y = false;
            System.out.println(es1.y);
        }

        myNum.close();
    }
}
