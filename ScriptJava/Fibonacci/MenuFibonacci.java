import java.util.Scanner;

public class MenuFibonacci {

    public void MenuNavigazione() {

        // Scanner per l'inserimento del numero e della scelta nel menù
        Scanner myNumero = new Scanner(System.in);
        Scanner myScelta = new Scanner(System.in);

        boolean primaScelta = false;

        do {
            System.out.print("\nQuale operazione vuoi eseguire?\n1: Stampo serie di fibonacci\n2: Cerco numero di fibonacci\n3: Termina programma\nInserisci scelta: ");
            int scelta = myScelta.nextInt();

            switch (scelta) {
                case 1:
                    // Chiedo la quantità di numeri da visualizzare
                    System.out.print("\nInserisci quanti numeri vuoi stampare: ");
                    int numero = myNumero.nextInt();

                    for (int i = 0; i <= numero; i++) {
                        // Richiamo il metodo fibonacci
                        int numeroFibonacci = serieFibonacci(i);
                        System.out.print(" " + numeroFibonacci);
                    }
                    System.out.print("\n");
                    // Esco dal ciclo
                    primaScelta = false;
                    break;

                case 2:
                    // Chiedo di inserire il numero in input
                    System.out.print(
                            "\nInserisci un numero e ti dirò fino a quale numero della serie di fibonacci equivale: ");
                    int num = myNumero.nextInt();

                    // Assegno il risultato del metodo caclFibonacci a risultato
                    int risultato = calcFibonacci(num);
                    // Mostro il risultato e richiedo se si vuole trovare un altro numero o
                    // terminare il programma
                    System.out.println(
                            "Il numero inserito è " + num + ", nella serie di fibonacci equivale a: " + risultato);

                    System.out.print(
                            "\nVuoi tornare al menù principale o terminare il programma?\n1: Continua\n2: Termina\nInserisci scelta: ");
                    int scelta2 = myScelta.nextInt();

                    switch (scelta2) {
                        case 1:
                            // Il programma continua e torno all'inzio del do - while
                            System.out.println("\nRitorno al calcolo del numero");
                            primaScelta = false;
                            break;

                        case 2:
                            // Il programma termina
                            System.out.println("\nTermino il programma!!!");
                            primaScelta = true;
                            break;

                        default:
                            // Ritorno al calcolo del numero, il programma continua
                            System.out.println("Inserimento errato, ritorno al calcolo del numero...");
                            break;
                    }

                    break;

                case 3:
                    System.out.print("\nTermino il programma...");
                    primaScelta = true;
                    break;

                default:
                    // Se l'utente sbaglia l'inserimento ritorno alla richiesta iniziale
                    System.out.println("Input errato, ritorno alla richieste...");
                    break;
            }
        } while (primaScelta == false);

        // Chiudo gli scanner
        myNumero.close();
        myScelta.close();
    }

    // Metodo per trovare il numero nella serie di fibonacci in base al numero
    // inserito
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
