package School_Java_Developer.ScriptJava.Venerdi3Mk2;

import java.util.Scanner;

public class MetodiLibro {
    static Biblioteca LibroPrimo = new Biblioteca("Hakuna Matata", 15, 0);
    static Biblioteca LibroSecondo = new Biblioteca("ragazzi sono", 5, 0);
    static Biblioteca LibroTerzo = new Biblioteca("CiccioGamer89", 5, 0);
    static Biblioteca LibroQuarto = new Biblioteca(null, 0, 0);
    static Biblioteca LibroQuinto = new Biblioteca(null, 0, 0);

    static Scanner myInput = new Scanner(System.in);
    static Scanner myAggiunta = new Scanner(System.in);

    public static void menuUtenteLoggato() {
        System.out.print(
                "\nChe operazione vuoi eseguire?\n1: Prendi\n2: Restituisci\n3: Visualizza\n4: Slogga\nInserisci scelta: ");
        int primaScelta = myInput.nextInt();

        switch (primaScelta) {
            // Prendi in prestito il libro
            case 1:
                sceltaLibro();
                break;
            // Resituisci libro
            case 2:
                Restituisci();
                break;
            // Visualizza i libri disponibili
            case 3:
                visualizzaLibri();
                menuUtenteLoggato();
                break;
            // Sloggo dall'account
            case 4:
                System.out.println("\nTorno al menu registra/login...");
                MetodiUtente.menuRegLogin();
                break;
            // Inserimento errato in input
            default:
                System.out.println("\nInserimento errato...");
                menuUtenteLoggato();
                break;
        }
    }

    public static void visualizzaLibri() {
        System.out.println("\nNome libro: \n" + LibroPrimo.getLibro() + "\n" + LibroSecondo.getLibro() + "\n"
                + LibroTerzo.getLibro() + "\n" + LibroQuarto.getLibro() + "\n" + LibroQuinto.getLibro());
    }

    public static void sceltaLibro() {
        System.out.print("\nQuale libro desideri prendere?\n1: " + LibroPrimo.getLibro() + "\n2: "
                + LibroSecondo.getLibro() + "\n3: " + LibroTerzo.getLibro() + "\n4: " + LibroQuarto.getLibro() + "\n5: "
                + LibroQuinto.getLibro() + "\nInserisci scelta: ");
        int secondaScelta = myInput.nextInt();

        switch (secondaScelta) {
            // Libro 1
            case 1:
                if (LibroPrimo.numCopie == 0) {
                    System.out.println("Copie Libro finite...");
                    menuUtenteLoggato();
                } else {
                    System.out.println("LIBRO PRESO!!!");
                    LibroPrimo.prestaLibro();
                }
                break;
            // Libro 2
            case 2:
                if (LibroSecondo.numCopie == 0) {
                    System.out.println("Copie Libro finite...");
                    menuUtenteLoggato();
                } else {
                    System.out.println("LIBRO PRESO!!!");
                    LibroSecondo.prestaLibro();
                }
                break;
            // Libro 3
            case 3:
                if (LibroTerzo.numCopie == 0) {
                    System.out.println("Copie Libro finite...");
                    menuUtenteLoggato();
                } else {
                    System.out.println("LIBRO PRESO!!!");
                    LibroTerzo.prestaLibro();
                }
                break;
            // Libro 4
            case 4:
                if (LibroQuarto.numCopie == 0) {
                    System.out.println("Copie Libro finite...");
                    menuUtenteLoggato();
                } else {
                    System.out.println("LIBRO PRESO!!!");
                    LibroQuarto.prestaLibro();
                }
                break;
            // Libro 5
            case 5:
                if (LibroQuinto.numCopie == 0) {
                    System.out.println("\nCopie Libro finite...");
                    menuUtenteLoggato();
                } else {
                    System.out.println("LIBRO PRESO!!!");
                    LibroQuinto.prestaLibro();
                }
                break;
            // Inserimento in input errato
            default:
                System.out.println("\nInserimento erratto...");
                break;
        }
    }

    public static void Restituisci() {
        System.out.print("\nQuale libro desideri restiuire?\n1: " + LibroPrimo.getLibro() + "\n2: "
                + LibroSecondo.getLibro() + "\n3: " + LibroTerzo.getLibro() + "\n4: " + LibroQuarto.getLibro() + "\n5: "
                + LibroQuinto.getLibro() + "\nInserisci scelta: ");
        int sceltaRestituisci = myInput.nextInt();

        switch (sceltaRestituisci) {
            // Libro1
            case 1:
                LibroPrimo.numCopie++;
                LibroPrimo.copiePrestate--;
                System.out.println("\nGrazie per aver riportato il libro");
                break;
            // Libro2
            case 2:
                LibroSecondo.numCopie++;
                LibroSecondo.copiePrestate--;
                System.out.println("\nGrazie per aver riportato il libro");
                break;

            case 3:
                LibroTerzo.numCopie++;
                LibroTerzo.copiePrestate--;
                System.out.println("\nGrazie per aver riportato il libro");
                break;

            case 4:
                LibroQuarto.numCopie++;
                LibroQuarto.copiePrestate--;
                System.out.println("\nGrazie per aver riportato il libro");
                break;

            case 5:
                LibroQuinto.numCopie++;
                LibroQuinto.copiePrestate--;
                System.out.println("\nGrazie per aver riportato il libro");
                break;

            default:
                System.out.println("\nInserimento errato...");
                Restituisci();
                break;
        }
    }
}