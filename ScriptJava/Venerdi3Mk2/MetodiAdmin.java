package School_Java_Developer.ScriptJava.Venerdi3Mk2;

import java.util.Scanner;

public class MetodiAdmin {
    private static Scanner mySceltaAdmin = new Scanner(System.in);
    private static Scanner myAggiunta = new Scanner(System.in);

    public static void adminCheck() {
        Scanner myInpAdmin = new Scanner(System.in);

        System.out.print("\nSei un admin? (si / no): ");
        String rispoAdmin = myInpAdmin.nextLine();

        if (rispoAdmin.equalsIgnoreCase("Si")) {

            System.out.print("\nInserisci password admin: ");
            String inserisciPassword = myInpAdmin.nextLine();

            if (inserisciPassword.equals("admin123")) {
                menuAdmin();
            } else {
                System.out.print("PASSWORD ERRATA!!!");
                MetodiLibro.menuUtenteLoggato();
            }
        } else if (rispoAdmin.equalsIgnoreCase("No")) {
            MetodiLibro.menuUtenteLoggato();
        }
        myInpAdmin.close();
    }

    public static void menuAdmin() {
        System.out.print(
                "\nChe operazione vuoi eseguire?\n1: Prendi\n2: Restituisci\n3: Visualizza\n4: Rimuovi\n5: Aggiungi\n6: Slogga\nInserisci scelta: ");
        int sceltaAdmin = mySceltaAdmin.nextInt();

        switch (sceltaAdmin) {
            // Prendi in prestito il libro
            case 1:
                MetodiLibro.sceltaLibro();
                break;
            // Resituisci libro
            case 2:
                MetodiLibro.Restituisci();
                break;
            // Visualizza i libri disponibili
            case 3:
                MetodiLibro.visualizzaLibri();
                menuAdmin();
                break;
            // Rimuovi libro dalla libreria
            case 4:
                rimuoviLibro();
                break;
            // Aggiungi libro alla libreria
            case 5:
                aggiungiLibro4();

                System.out.print("\nVuoi aggiungere un altro libro? (si / no): ");
                String sceltaAggiunta = myAggiunta.nextLine();

                if (sceltaAggiunta.equalsIgnoreCase("Si")) {
                    aggiungiLibro5();
                } else if (sceltaAggiunta.equalsIgnoreCase("No")) {
                    menuAdmin();
                }
                break;
            // Sloggo dall'account
            case 6:
                System.out.println("\nTorno al menu registra/login...");
                MetodiUtente.menuRegLogin();
                break;
            // Inserimento errato in input
            default:
                System.out.println("\nInserimento errato...");
                menuAdmin();
                break;
        }
    }

    public static void aggiungiLibro4() {
        System.out.print("\nInserisci nome libro: ");
        MetodiLibro.LibroQuarto.setNomeLibro();

        System.out.print("Inserisci disponibilità: ");
        MetodiLibro.LibroQuarto.setDisponibilita();
    }

    public static void aggiungiLibro5() {
        System.out.print("\nInserisci nome libro: ");
        MetodiLibro.LibroQuinto.setNomeLibro();

        System.out.print("Inserisci disponibilità: ");
        MetodiLibro.LibroQuinto.setDisponibilita();
    }

    public static void rimuoviLibro() {
        Scanner myRimuovi = new Scanner(System.in);

        System.out.print("\nQuale libro desideri prendere?\n1: " + MetodiLibro.LibroPrimo.getLibro() + "\n2: "
                + MetodiLibro.LibroSecondo.getLibro() + "\n3: " + MetodiLibro.LibroTerzo.getLibro() + "\n4: "
                + MetodiLibro.LibroQuarto.getLibro() + "\n5: " + MetodiLibro.LibroQuinto.getLibro()
                + "\nInserisci scelta: ");
        int rimuoviScelta = myRimuovi.nextInt();

        switch (rimuoviScelta) {
            case 1:
                MetodiLibro.LibroPrimo.rimuoviLibro();
                System.out.println("Libro rimosso...");
                System.out.println(MetodiLibro.LibroPrimo.getLibro());
                break;

            case 2:
                MetodiLibro.LibroSecondo.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            case 3:
                MetodiLibro.LibroTerzo.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            case 4:
                MetodiLibro.LibroQuarto.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            case 5:
                MetodiLibro.LibroQuinto.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            default:
                System.out.print("Input errato...");
                rimuoviLibro();
                break;
        }
        myRimuovi.close();
    }
}