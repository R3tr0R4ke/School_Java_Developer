public class castingRestringente {
    public static void main(String[] args){
        double myDouble = 9.78d;
        int myInt = (int) myDouble;     //casting manuale: double to int

        System.out.println(myDouble);   //output: 9.78
        System.out.println(myInt);      //output 9
    }
}