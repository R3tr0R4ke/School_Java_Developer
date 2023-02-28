public class metodi 
{
    public static void main(String [] args)
    {
        myMethod("Liam");

        System.out.println("int: " + mioMetodoInt(5));

        System.out.println("double: " + mioMetodoDouble(5));

        System.out.println("Boolean: " + mioMetodoBoolean(true));

        System.out.println("Float: " + mioMetodoFloat(5));

        System.out.println("Stringa: " + mioMetodoString("CIAO"));

    }

    static void myMethod(String fname)
    {
        System.out.println(fname + "Refnes\n");
    }

    static int mioMetodoInt(int x)
    {
        return x;
    }

    static double mioMetodoDouble(double nome)
    {
        return nome;
    }

    static boolean mioMetodoBoolean(boolean bool)
    {
        return bool;
    }

    static float mioMetodoFloat(float numFloat)
    {
        return numFloat;
    }

    static String mioMetodoString(String stringa)
    {
        return stringa;
    }
}
