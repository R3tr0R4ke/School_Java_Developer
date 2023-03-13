package TestMetaCorso.esercizioJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Airline 
{
    private static Scanner myScelta = new Scanner(System.in);
    private static Scanner myAereiString = new Scanner(System.in);
    private static Scanner myAereiInt = new Scanner(System.in);

    static Airplane aereo = new Airplane("Pino", 150, 7500);

    //Lista aerei passegeri
    static PassengerPlane aereoPassegeri1 = new PassengerPlane("Giando", 150, 6000, 15);
    static PassengerPlane aereoPassegeri2 = new PassengerPlane("Iotto", 130, 4500, 10);
    static PassengerPlane aereoPassegeri3 = new PassengerPlane("Elena", 125, 5500, 20);
    static PassengerPlane aereoPassegeri4 = new PassengerPlane("Rodolfa", 100, 7250, 10);
    static PassengerPlane aereoPassegeri5 = new PassengerPlane(null, 0, 0, 0);
    
    static ArrayList<PassengerPlane> passengerPlaneList = new ArrayList<>();
    static ArrayList<CargoPlane> cargoPlaneList = new ArrayList<>();

    //Lista aerei Cargo
    static CargoPlane aereoCargo1 = new CargoPlane("Arnold", 20, 7500, 3000);
    static CargoPlane aereoCargo2 = new CargoPlane("Rudolf", 15, 6000, 4500);
    static CargoPlane aereoCargo3 = new CargoPlane("Escobar", 20, 5750, 7500);
    static CargoPlane aereoCargo4 = new CargoPlane("Flixbus", 25, 5500, 4500);
    static CargoPlane aereoCargo5 = new CargoPlane(null, 0, 0, 0);

    public static void aggiungiAereo ()
    {
        System.out.print("\nVuoi aggiungere un aereo Passegeri o cargo?\n1: Passegeri\n2: Cargo\nInserisci scelta: ");
        int sceltaAereo = myScelta.nextInt();

        switch (sceltaAereo) 
        {
            //Passegeri
            case 1:
                inserisciAereoPassegeri();
            break;

            case 2:
                inserisciAereoCargo();
            break;

            default:
                System.out.println("\nInserimento errato...");
                aggiungiAereo();
            break;
        }
    }

    public static void inserisciAereoPassegeri ()
    {
        System.out.print("\nInserisci nome aereo: ");
        String nomeAereoP5 = myAereiString.nextLine();
        aereoPassegeri5.setNomeAereo(nomeAereoP5);

        System.out.print("Inserisci numero posti: ");
        int numPost5 = myAereiInt.nextInt();
        aereoPassegeri5.setNumPosti(numPost5);

        System.out.print("Inserisci capacità carico: ");
        int capacita5 = myAereiInt.nextInt();
        aereoCargo5.setCapacitaAereo(capacita5);

        System.out.print("Inserisci numero servizi: ");
        int numServizi5 = myAereiInt.nextInt();
        aereoPassegeri5.setServiziDispo(numServizi5);

        passengerPlaneList.add(aereoPassegeri5);

        System.out.println("\nAereo passegeri inserito con successo");

        // Esempio di accesso ai dati di un oggetto PassengerPlane all'interno dell'ArrayList
        //System.out.println(passengerPlanes.get(0).getNomeAereo());

        aereoPassegeri5.setNomeAereo(null);
        aereoPassegeri5.setNumPosti(0);
        aereoPassegeri5.setCapacitaAereo(0);
        aereoPassegeri5.setServiziDispo(0);

        System.out.print("\nVuoi inserire un altro aereo? (si / no): ");
        String sceltaAggiunta = myScelta.nextLine();
        if (sceltaAggiunta.equalsIgnoreCase("Si"))
        {
            aggiungiAereo();
        }
        else if (sceltaAggiunta.equalsIgnoreCase("No"))
        {
            Main.MenuSecondario();
        }
    }

    public static void inserisciAereoCargo ()
    {
        System.out.print("\nInserisci nome aereo: ");
        String nomeAereoC5 = myAereiString.nextLine();
        aereoCargo5.setNomeAereo(nomeAereoC5);

        System.out.print("Inserisci numero posti: ");
        int numPost5 = myAereiInt.nextInt();
        aereoCargo5.setNumPosti(numPost5);

        System.out.print("Inserisci capacità carico: ");
        int capacita5 = myAereiInt.nextInt();
        aereoCargo5.setCapacitaAereo(capacita5);

        System.out.print("Inserisci capacità extra: ");
        int capacitaExtra = myAereiInt.nextInt();
        aereoPassegeri5.setServiziDispo(capacitaExtra);

        cargoPlaneList.add(aereoCargo5);

        System.out.println("\nAereo cargo inserito con successo");

        // Esempio di accesso ai dati di un oggetto PassengerPlane all'interno dell'ArrayList
        //System.out.println(passengerPlanes.get(0).getNomeAereo());

        aereoCargo5.setNomeAereo(null);
        aereoCargo5.setNumPosti(0);
        aereoCargo5.setCapacitaAereo(0);
        aereoCargo5.setCaricoExtra(0);

        System.out.print("\nVuoi inserire un altro aereo? (si / no): ");
        String sceltaAggiunta = myAereiString.nextLine();
        if (sceltaAggiunta.equalsIgnoreCase("Si"))
        {
            aggiungiAereo();
        }
        else if (sceltaAggiunta.equalsIgnoreCase("No"))
        {
            Main.MenuSecondario();
        }
    }

    public static void calcoloCapacitaCargo ()
    {
        int capTotCargo;

        int capTotCargo1 = aereoCargo1.getCapacitaAereo() + aereoCargo1.getCaricoExtra();
        int capTotCargo2 = aereoCargo2.getCapacitaAereo() + aereoCargo2.getCaricoExtra();
        int capTotCargo3 = aereoCargo3.getCapacitaAereo() + aereoCargo3.getCaricoExtra();
        int capTotCargo4 = aereoCargo4.getCapacitaAereo() + aereoCargo4.getCaricoExtra();

        int capTotAereiAggiunti = 0;
        for (int i = 0; i < cargoPlaneList.size(); i++)
        {
            int capTemp;
            capTemp = cargoPlaneList.get(i).getCapacitaAereo() + cargoPlaneList.get(i).getCaricoExtra();
            capTotAereiAggiunti = capTotAereiAggiunti + capTemp;
        }

        capTotCargo = capTotCargo1 + capTotCargo2 + capTotCargo3 + capTotCargo4 + capTotAereiAggiunti;

        int capTotPasseg;

        int capTotPass1 = aereoPassegeri1.getCapacitaAereo();
        int capTotPass2 = aereoPassegeri2.getCapacitaAereo();
        int capTotPass3 = aereoPassegeri3.getCapacitaAereo();
        int capTotPass4 = aereoPassegeri4.getCapacitaAereo();

        int capTotAereiAggiuntiPass = 0;
        for (int i = 0; i < passengerPlaneList.size(); i++)
        {
            int capTemp;
            capTemp = passengerPlaneList.get(i).getCapacitaAereo();
            capTotAereiAggiuntiPass = capTotAereiAggiuntiPass + capTemp;
        }

        capTotPasseg = capTotPass1 + capTotPass2 + capTotPass3 + capTotPass4 + capTotAereiAggiuntiPass;

        System.out.println("La capacità totale degli aerei è di: " + capTotCargo + capTotPasseg);
    }

    public static void stampaAereiPosti ()
    {

    }

    public static void stampaAerei ()
    {
        System.out.print("\n");
        System.out.println(Airline.aereoPassegeri1.toStringPassenger());
        System.out.println(Airline.aereoPassegeri2.toStringPassenger());
        System.out.println(Airline.aereoPassegeri3.toStringPassenger());
        System.out.println(Airline.aereoPassegeri4.toStringPassenger());

        for (int i = 0; i < passengerPlaneList.size(); i++)
        {
            System.out.print("Passenger [ Nome: " + passengerPlaneList.get(i).getNomeAereo());
            System.out.print(" | Num posti: " + passengerPlaneList.get(i).getNumPosti());
            System.out.print(" | Capacita carico: " + passengerPlaneList.get(i).getCapacitaAereo());
            System.out.print(" | Num servizi: " + passengerPlaneList.get(i).getServiziDispo());
        }
        System.out.print("\n");
        
        System.out.println(Airline.aereoCargo1.toStringCargo());
        System.out.println(Airline.aereoCargo2.toStringCargo());
        System.out.println(Airline.aereoCargo3.toStringCargo());
        System.out.println(Airline.aereoCargo4.toStringCargo());
        
        for (int i = 0; i < cargoPlaneList.size(); i++)
        {
            System.out.print("Passenger [ Nome: " + cargoPlaneList.get(i).getNomeAereo());
            System.out.print(" | Num posti: " + cargoPlaneList.get(i).getNumPosti());
            System.out.print(" | Capacita carico: " + cargoPlaneList.get(i).getCapacitaAereo());
            System.out.print(" | Capacità Extra: " + cargoPlaneList.get(i).getCaricoExtra());
        }
        System.out.print("\n");
    }
}