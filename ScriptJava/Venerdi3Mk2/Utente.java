package School_Java_Developer.ScriptJava.Venerdi3Mk2;

import java.util.ArrayList;
import java.util.Scanner;

public class Utente {

    private ArrayList<String> nomeUtente;
    private ArrayList<String> passwordUtente;

    public static Scanner myInput = new Scanner(System.in);

    public Utente(ArrayList<String> nomeUtente, ArrayList<String> passwordUtente) {
        this.nomeUtente = new ArrayList<String>();
        this.passwordUtente = new ArrayList<String>();
    }

    public void setNomeUtente(String nome) {
        this.nomeUtente.add(nome);
    }

    // Ritorna un nome presente nell'arraList nomeUtente in base all'indice indicato
    public String getNomeUtente(int index) {
        return this.nomeUtente.get(index);
    }

    // Ritorna un arraList di tutti i nomi presenti nell'ArrayList nomeUtente
    public ArrayList<String> getNomiUtente() {
        return nomeUtente;
    }

    // Metodo per inserire il nome nell'arrayList nomeUtente del oggetto UtenteObj
    public static void InserisciNome(Utente utenteObj) {
        System.out.print("\nInserisci nome: ");
        String nomeInserito = myInput.nextLine();

        utenteObj.setNomeUtente(nomeInserito);
    }

    // Restituisce true se il nome da cercare è presente nell'arrayList, false
    // altrimenti
    public boolean cercaNome(String nome) {
        return nomeUtente.contains(nome);
    }

    public static boolean cercaNomeUtente(Utente utente, String nome) {
        ArrayList<String> nomiUtente = utente.getNomiUtente();
        return nomiUtente.contains(nome);
    }

    // -----------SEZIONE PASSWORD------------------

    public void setPasswordUtente(String password) {
        this.passwordUtente.add(password);
    }

    public String getPasswordUtente(int index) {
        return this.passwordUtente.get(index);
    }

    public static void InserisciPassword(Utente utenteObj) {
        System.out.print("Inserisci password: ");
        String passwordInserita = myInput.nextLine();

        utenteObj.setPasswordUtente(passwordInserita);
    }

    public ArrayList<String> getPasswordUtenti() {
        return passwordUtente;
    }

    public static boolean cercaPasswordUtente(Utente utente, String password) {
        ArrayList<String> passwordUtenti = utente.getPasswordUtenti();
        return passwordUtenti.contains(password);
    }
}
