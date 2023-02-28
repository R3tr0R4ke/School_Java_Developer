public class lungStringa {
    public static void main(String [] args)
    {
        int testFunc = getStringLentgh("Ciao sei un ricchione");
        System.out.println(testFunc);
    }

    static int getStringLentgh(String stringaInserita)
    {   
        int lunghezza = stringaInserita.length();
        System.out.println("La stringa è lunga: " + lunghezza);
        return stringaInserita.length();
    }
}
