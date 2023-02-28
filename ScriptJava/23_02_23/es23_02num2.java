public class es23_02num2 
{
    static int num1 = 5;
    static int num2 = 10;
    
    public static void main(String [] args)
    {
        metodoStatico();
        metodoNonStatico();
    }    

    static void metodoStatico()
    {
        System.out.println("Metodo statico, stampo il numero: " + num1);
    }

    static void metodoNonStatico()
    {
        System.out.println("Metodo statico, stampo il numero: " + num2);
    }
}
