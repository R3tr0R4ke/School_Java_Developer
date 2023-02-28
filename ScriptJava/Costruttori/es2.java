public class es2 
{
    String fname = "jhon";
    boolean pippo = false;
    static boolean prova = true;
    static int age = 25;
    
    public static void main (String [] args)
    {
        myMethod(age);
    }

    public static void myMethod(int anni)
    {
        es2 myObj1 = new es2();
        es2 myObj2 = new es2();

        if (es2.age == 25)
        {
            myObj1.pippo = true;
            myObj2.pippo = false;

            myObj1.fname = "Antonio";
            myObj2.fname = "Gigetto";

            unlocker(); 
            bloccatore();       //Non stampo niente

            if (es2.prova == false)
            {
                System.out.println(myObj1.pippo);
                System.out.println(myObj2.pippo);

                System.out.println("Nome: " + myObj1.fname);
                System.out.println("Nome: " + myObj2.fname);
            }
            
        }
        else if (es2.age > 25)
        {
            myObj1.pippo = false;
            myObj2.pippo = true;
            
            System.out.println(myObj1.pippo);
            System.out.println(myObj2.pippo);
        }
    }

    public static void unlocker()
    {
        es2.prova = false;
    }

    public static void bloccatore()
    {
        es2.prova = true;
    }
}
