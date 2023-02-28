import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class array 
{
    public static void main(String[] args) 
    {
        Scanner anagrafica = new Scanner(System.in);

        String[] array1 = {"nome","cognome","email","età"};
        String[] array2 = {"","","",""};
        
        
        for (int i = 0; i < array1.length; i++) 
        {
            //Inserisco nell'array gli elementi
            System.err.print("Inserire " + array1[i] + ": ");
            array2[i] = anagrafica.nextLine();
        }
        for (String string : array2) 
        {
            //stampo l'array
            System.out.printf(string + " ");
        }
        anagrafica.close();

        //Scanner myArrayInt = new Scanner(System.in);

        int[] arrayInt1 = {1, 2, 3, 4, 5};
        int[] arrayInt2 = new int[arrayInt1.length];

        System.arraycopy(arrayInt1, 0, arrayInt2, 0, arrayInt1.length);

        for (int i = 0; i < arrayInt2.length; i++)
        {
            System.err.print(arrayInt2[i] + " ");
        }
        

        //Stampo il numero 3 in questo array bidimensionale
        /*int[][] myNumbers = {{1, 2, 3, 4},{5,6,7}};
        System.out.println(myNumbers[0][2]);*/

        /*int[][] myNumbers = {{1, 2, 3, 4},{5,6,7}};

        for (int i = 0; i < myNumbers.length; i++)
        {
            for (int j = 0; j < myNumbers[i].length; j++)
            {
                System.out.println(myNumbers[i][j]);
            }
        }
        */

        /*int[][] myNumeri = {{1, 2, 3, 4},{5,6,7}};
        for (int[] riga : myNumeri) 
        {
            for (int elemento : riga) 
            {
                System.out.print(elemento + " ");
            }
            //System.out.println();
        }
        */

        //TODO: stub del metodo generato automaticamente
        Integer arr[] = {1,2,3,4,5,6};
        System.out.println("Array:" + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array after adding element: " + Arrays.toString(arr));
    
    }
}
