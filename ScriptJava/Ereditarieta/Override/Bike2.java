package School_Java_Developer.ScriptJava.Ereditarieta.Override;

public class Bike2 
{
    void run(){System.out.println("La bici sta correndo in sicurezza");} //metodo della classe genitore
    public static void main (String [] args)
    {
        Bike2 obj = new Bike2(); //crea oggetto
        obj.run();
    }
}