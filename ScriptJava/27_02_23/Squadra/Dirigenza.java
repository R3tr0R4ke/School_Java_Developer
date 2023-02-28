package Squadra;

import java.util.ArrayList;
import java.util.Scanner;

public class Dirigenza 
{
    public static String Dirigenti; 
    public static String Boss;

    public static void metodoDirigenza()
    {
        Scanner myInputDir = new Scanner(System.in);
        Scanner myInputBoss = new Scanner(System.in);

        int contNomInserDir = 0;

        System.out.println("Inserire il nome DIRIGENTE: ");
        Dirigenti = myInputBoss.nextLine();
        ArrayList<String> dirigentiList = new ArrayList<>();
        dirigentiList.add(Dirigenti);

        System.out.println("Inserire il nome BOSS: ");
        Boss = myInputBoss.nextLine();
        ArrayList<String> bossList = new ArrayList<>();
        bossList.add(Boss);

        contNomInserDir ++;
        
        if (contNomInserDir > 2)
        {
            System.out.println("Nomi inseriti correttamente!!!");
        }
        else
        {
            metodoDirigenza();
        }

        myInputDir.close();
        myInputBoss.close();
    }
}
