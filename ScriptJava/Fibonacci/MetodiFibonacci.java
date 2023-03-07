public class MetodiFibonacci 
{
    // Metodo per trovare il numero nella serie di fibonacci in base al numero inserito
    public static int calcFibonacci(int num) {
        // Condizione per il numero 0 e 1
        if (0 == num || 1 == num) {
            // Stampo semplicemente 0 o 1
            return num;
        } else {
            // Trovo il numero di fibonacci
            return calcFibonacci(num - 1) + calcFibonacci(num - 2);
        }
    }

    public static int serieFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return serieFibonacci(n - 1) + serieFibonacci(n - 2);
        }
    }
}