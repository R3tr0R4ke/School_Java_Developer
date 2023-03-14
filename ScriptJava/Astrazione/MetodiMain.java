package School_Java_Developer.ScriptJava.Astrazione;

import java.util.Scanner;

public class MetodiMain {
    // Scanner utili per l'inserimento in input da parte dell'utente
    private static Scanner myInt = new Scanner(System.in);
    private static Scanner myDouble = new Scanner(System.in);
    // ArraList che contiene le figure inserite
    private static ShapeManager shapeManagerList = new ShapeManager(null);

    public void MenuPrincipale() {
        System.out.print(
                "\nCosa vuoi fare?\n1: Aggiungi forma\n2: Area totale\n3: Perimetro totale\n4: Termina\nInserisci scelta: ");
        int sceltaPrincipale = myInt.nextInt();

        switch (sceltaPrincipale) {
            // Aggiungi forma
            case 1:
                ScegliForma();
                break;
            // Area totale
            case 2:
                CalcAreaTot();
                break;
            // Perimetro totale
            case 3:
                CalcPerimetroTot();
                break;
            // Termina programma
            case 4:
                System.out.println("\nTermino il programma...");
                break;
            // Inserimento errato
            default:
                System.out.print("Inserimento errato...");
                MenuPrincipale();
                break;
        }
    }

    public void ScegliForma() {
        System.out.print("\nChe forma vuoi inserire?\n1: Cerchio\n2: Rettangolo\nInserisci scelta: ");
        int sceltaForma = myInt.nextInt();

        // Caso Cerchio
        if (sceltaForma == 1) {
            CasoCerchio();
        }
        // Caso Rettangolo
        else if (sceltaForma == 2) {
            CasoRettangolo();
        }
        // Caso inserimento in input errato
        else if (sceltaForma < 1 || sceltaForma > 2) {
            ScegliForma();
        }
    }

    public void CasoCerchio() {
        System.out.print("\nInserisci il raggio: ");
        double raggioInserito = myDouble.nextDouble();

        // Creo un nuovo oggetto con il relativo raggio inserito in input
        Cerchio myCerchio = new Cerchio(raggioInserito);
        // Aggiungo all'arrayList l'oggetto myCerchio con il raggio inserito in input da
        // utente
        shapeManagerList.addShape(myCerchio);

        System.out.println("\nIl cerchio è stato inserito");
        MenuPrincipale();
    }

    public void CasoRettangolo() {

        System.out.print("\nInserisci l'altezza: ");
        double altezzaInserita = myDouble.nextDouble();

        System.out.print("Inserisci la base: ");
        double baseInserita = myDouble.nextDouble();

        // Creo un nuovo oggetto con il relativo raggio inserito in input
        Rettangolo myRettangolo = new Rettangolo(baseInserita, altezzaInserita);
        // Aggiungo all'arrayList l'oggetto myRettangolo con il raggio inserito in input
        // da utente
        shapeManagerList.addShape(myRettangolo);

        System.out.println("\nIl rettangolo è stato inserito");
        MenuPrincipale();
    }

    public void CalcAreaTot() {
        System.out.println("\nL'area totale delle figure presenti è di: " + shapeManagerList.getAreatot());
        MenuPrincipale();
    }

    public void CalcPerimetroTot() {
        System.out.println("\nIl perimetro totale delle figure presenti è di: " + shapeManagerList.getPerimetroTot());
        MenuPrincipale();
    }
}