public class Macchina 
{
    public static void main (String [] args)
    {
        Macchina myCar = new Macchina();    //Creo oggetto Macchina
        myCar.fullThrottle();               //Chiamo il metodo fullThrottle()
        myCar.speed(200, 500);          //Chiamo il metodo speed()
    }    

    public void fullThrottle ()
    {
        System.out.println("La macchina va il più veloce che può!!!");
    }

    public void speed (int x, int y)
    {
        System.out.println("Max speed is: " + x);
        System.out.println("Max speed2 is: " + y);
    }
}
