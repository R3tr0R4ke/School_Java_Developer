public class arrotondaNum {
    public static void main(String[] args)
    {
        float d;
        d = (float)1.6;
        System.out.println(d);
        System.out.println(arrotonda(d));
    }

    static int arrotonda(float value)
    {
        return (int)(value + 0.5);
    }
}

