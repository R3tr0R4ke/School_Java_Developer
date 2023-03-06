package School_Java_Developer.ScriptJava.Ereditarieta;

class Car extends Vehicle 
{
    private String modelName = "Fiat";
    
    public static void main (String [] args)
    {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
