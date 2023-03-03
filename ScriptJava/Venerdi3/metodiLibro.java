package School_Java_Developer.ScriptJava.Venerdi3;

import java.util.Scanner;

public class metodiLibro {

    static Biblioteca LibroPrimo = new Biblioteca("Geronimo Stilton", 15, 0);
    static Biblioteca LibroSecondo = new Biblioteca("KaliGuide", 5, 0);
    static Biblioteca LibroTerzo = new Biblioteca("CiccioGamer89", 5, 0);
    static Biblioteca LibroQuarto = new Biblioteca(null, 0, 0);
    static Biblioteca LibroQuinto = new Biblioteca(null, 0, 0);

    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("BENVENUTO/A NEL PROGRAMMA");
        boolean terminaProg = false;

        do {
            System.out.print(
                    "\nChe operazione vuoi eseguire?\n1: Prendi\n2: Restituisci\n3: Aggiungi\n4: Rimuovi\n5: Termina\nInserisci scelta: ");
            int primaScelta = myInput.nextInt();

            // Prendi un libro in prestito
            if (primaScelta == 1) {
                System.out.print("\nQuale libro desideri prendere?\n1: " + LibroPrimo.getLibro() + "\n2: "
                        + LibroSecondo.getLibro()
                        + "\n3: " + LibroTerzo.getLibro() + "\n4: " + LibroQuarto.getLibro() + "\n5: "
                        + LibroQuinto.getLibro() + "\nInserisci scelta: ");
                int secondaScelta = myInput.nextInt();

                boolean libroScelto = false;

                do {
                    if (secondaScelta == 1) {
                        if (LibroPrimo.numCopie == 0) {
                            System.out.println("Copie Libro finite...");
                        } else {
                            System.out.println("LIBRO PRESO!!!");
                            prestaLibro1();
                        }
                        libroScelto = true;
                    } else if (secondaScelta == 2) {
                        if (LibroSecondo.numCopie == 0) {
                            System.out.println("Copie Libro finite...");
                        } else {
                            System.out.println("LIBRO PRESO!!!");
                            prestaLibro2();
                        }
                        libroScelto = true;
                    } else if (secondaScelta == 3) {
                        if (LibroTerzo.numCopie == 0) {
                            System.out.println("Copie Libro finite...");
                        } else {
                            System.out.println("LIBRO PRESO!!!");
                            prestaLibro3();
                        }
                        libroScelto = true;
                    } else if (secondaScelta == 4) {
                        if (LibroQuarto.numCopie == 0) {
                            System.out.println("Copie Libro finite...");
                        } else {
                            System.out.println("LIBRO PRESO!!!");
                            prestaLibro4();
                        }
                        libroScelto = true;
                    } else if (secondaScelta == 5) {
                        if (LibroQuinto.numCopie == 0) {
                            System.out.println("Copie Libro finite...");
                        } else {
                            System.out.println("LIBRO PRESO!!!");
                            prestaLibro5();
                        }
                        libroScelto = true;
                    } else if (secondaScelta >= 6) {
                        System.out.print("\nInput errato...");
                        libroScelto = false;
                    }

                } while (!libroScelto);
            }
            // Restiuisci libro
            else if (primaScelta == 2) {
                Restituisci();
            }
            // Aggiungi Libro
            else if (primaScelta == 3) {
                // TODO:controllo di un libro già inserito
                aggiungiLibro4();
                Scanner myAggiunta = new Scanner(System.in);

                System.out.print("\nVuoi aggiungere un altro libro? (si / no): ");
                String sceltaAggiunta = myAggiunta.nextLine();

                if (sceltaAggiunta.equalsIgnoreCase("si")) {
                    aggiungiLibro5();
                }
                myAggiunta.close();
            }
            // Rimuovi Libro
            else if (primaScelta == 4) {
                rimuoviLibro();
            }
            // Termino programma
            else if (primaScelta == 5) {
                System.out.println("\nTERMINO IL PROGRAMMA...");
                terminaProg = true;
            }
        } while (!terminaProg);
    }

    public static void rimuoviLibro() {
        Scanner myRimuovi = new Scanner(System.in);

        System.out.print(
                "\nQuale libro desideri prendere?\n1: " + LibroPrimo.getLibro() + "\n2: " + LibroSecondo.getLibro()
                        + "\n3: " + LibroTerzo.getLibro() + "\n4: " + LibroQuarto.getLibro() + "\n5: "
                        + LibroQuinto.getLibro() + "\nInserisci scelta: ");
        int rimuoviScelta = myRimuovi.nextInt();

        switch (rimuoviScelta) {
            case 1:
                LibroPrimo.rimuoviLibro();
                System.out.println("Libro rimosso...");
                System.out.println(LibroPrimo.getLibro());
                break;

            case 2:
                LibroSecondo.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            case 3:
                LibroTerzo.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            case 4:
                LibroQuarto.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            case 5:
                LibroQuinto.rimuoviLibro();
                System.out.println("Libro rimosso...");
                break;

            default:
                System.out.print("Input errato...");
                rimuoviLibro();
                break;
        }
    }

    public static void aggiungiLibro4() {
        System.out.print("\nInserisci nome libro: ");
        LibroQuarto.setNomeLibro();

        System.out.print("Inserisci disponibilità: ");
        LibroQuarto.setDisponibilita();
    }

    public static void aggiungiLibro5() {
        System.out.print("\nInserisci nome libro: ");
        LibroQuinto.setNomeLibro();

        System.out.print("Inserisci disponibilità: ");
        LibroQuinto.setDisponibilita();
    }

    public static void Restituisci() {
        System.out.print(
                "\nQuale libro desideri restiuire?\n1: " + LibroPrimo.getLibro() + "\n2: " + LibroSecondo.getLibro()
                        + "\n3: " + LibroTerzo.getLibro() + "\n4: " + LibroQuarto.getLibro() + "\n5: "
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

    // Decrementa numCopie, incrementa copiePrestate
    public static void prestaLibro1() {
        // Decremento copie primo libro
        LibroPrimo.numCopie--;
        LibroPrimo.copiePrestate++;
    }

    // Decrementa numCopie, incrementa copiePrestate
    public static void prestaLibro2() {
        // Decremento copie primo libro
        LibroPrimo.numCopie--;
        LibroPrimo.copiePrestate++;
    }

    // Decrementa numCopie, incrementa copiePrestate
    public static void prestaLibro3() {
        // Decremento copie primo libro
        LibroPrimo.numCopie--;
        LibroPrimo.copiePrestate++;
    }

    // Decrementa numCopie, incrementa copiePrestate
    public static void prestaLibro4() {
        // Decremento copie primo libro
        LibroPrimo.numCopie--;
        LibroPrimo.copiePrestate++;
    }

    // Decrementa numCopie, incrementa copiePrestate
    public static void prestaLibro5() {
        // Decremento copie primo libro
        LibroPrimo.numCopie--;
        LibroPrimo.copiePrestate++;
    }
}