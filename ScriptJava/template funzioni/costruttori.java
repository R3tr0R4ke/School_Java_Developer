public class costruttori 
{
    int modelYear;
    String modelName;

    public costruttori(int year, String name)
    {
        modelYear = year;
        modelName = name;
    }

    public static void main (String [] args)
    {
        costruttori myCar = new costruttori(1969, "Mustang");

        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
