package School_Java_Developer.ScriptJava.TryCatch;

public class Wrapper 
{
    public static void main (String [] args)
    {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer myIntero = 100;
        String myString = myIntero.toString();
        System.out.println(myString.length());
    }    
}