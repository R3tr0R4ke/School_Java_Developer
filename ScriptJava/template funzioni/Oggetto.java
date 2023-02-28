public class Oggetto 
{
    int x = 5;
    String parola;

    public static void main(String [] args)
    {
        Oggetto myObj1 = new Oggetto();     //Obj1
        Oggetto myObj2 = new Oggetto();     //Obj2

        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        System.out.println(myObj2.parola);
        myObj2.parola = "Ciao";
        System.out.println(myObj2.parola);   
    }
}
