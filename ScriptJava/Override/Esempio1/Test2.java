package School_Java_Developer.ScriptJava.Override.Esempio1;

public class Test2 
{
    public static void main(String[] args) 
    {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
