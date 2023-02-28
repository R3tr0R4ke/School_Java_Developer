import java.util.Scanner;

public class es23_02 
{
    public static void main(String [] args)
    {
        metodoPrincipale();
    }

    public static void metodoPrincipale()
    {
        Scanner myScelta = new Scanner(System.in);

        System.out.print("Quale metodo vuoi utilizzare per stampare il numero inserito?\n1: Stringa\n2: Int\n3: Double\n4: Boolean\nInserisci scelta: ");
        int scelta = myScelta.nextInt();

        switch (scelta) 
        {
            case 1:
                Scanner myStr = new Scanner(System.in);

                System.out.print("\nInserisci la stringa che vuoi stampare: ");
                String stringa = myStr.nextLine();

                System.out.print("La stringa inserita è: " + mioMetodoString(stringa));
            break;
        
            case 2:
                Scanner myNumInt = new Scanner(System.in);

                System.out.print("\nInserisci il numero che vuoi stampere: ");
                int numInt = myNumInt.nextInt();

                System.out.print("Il numero inserito in Int è: " + mioMetodoInt(numInt));
            break;

            case 3:
                Scanner myNumDouble = new Scanner(System.in);

                System.out.print("\nInserisci il numero che vuoi stampere: ");
                double numDouble = myNumDouble.nextDouble();

                System.out.print("Il numero inserito in Double è: " + mioMetodoDouble(numDouble));
            break;

            case 4:
                Scanner myBool = new Scanner(System.in);

                System.out.print("\nInserisci il boolean che vuoi stampare\n1: Vero\n2: Falso\nInserisci scelta: ");
                int bool = myBool.nextInt();
                boolean stampaBool;

                switch (bool) 
                {
                    case 1:
                        stampaBool = true;
                        System.out.print("Il boolean è: " + stampaBool);
                    break;

                    case 2:
                        stampaBool = false;
                        System.out.print("Il boolean è: " + stampaBool);
                    break;
                
                    default:
                        System.out.print("\nInserimento errato...\n");
                    break;
                }
            break;

            default:
                System.out.println("\nInserimento errato...\n");
                metodoPrincipale();
            break;
        }
        myScelta.close();
    }

    static int mioMetodoInt(int numInt)
    {
        return numInt;        
    }

    static double mioMetodoDouble(double nome)
    {
        return nome;
    }

    static boolean mioMetodoBoolean(boolean bool)
    {
        return bool;
    }

    static String mioMetodoString(String stringa)
    {
        return stringa;
    }
}
