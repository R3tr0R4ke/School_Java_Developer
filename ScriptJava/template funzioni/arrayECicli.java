public class arrayECicli {
    public static void main (String [] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] power = {1200, 500, 750, 1000};

        for (String i : cars)
        {
            for (int j : power)
            {
                System.out.print(i + " ");
                System.out.println(j);
            }
            break;
        }
    }
}
