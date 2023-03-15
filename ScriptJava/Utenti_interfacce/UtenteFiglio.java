package School_Java_Developer.ScriptJava.Utenti_interfacce;

import java.util.ArrayList;

public class UtenteFiglio implements Utente
{
    private String username;
    private String password;
    private boolean adminCheck;

    public UtenteFiglio (String username, String password)
    {
        this.username = username;
        this.password = password;
        this.adminCheck = false;
    }

    //Metodo preso tramite override dalla classe Utente che si occupa della registrazione di un utente
    @Override
    public boolean register(String username, String password) 
    {
        boolean registrato = false;

        if (this.username.equals("admin"))
        {
            System.out.println("\nUtente già esistente!!!");
            return registrato;
        }
        else
        {
            this.username = username;
            this.password = password;
            System.out.println("\nAccount registrato!!!");
            //TODO: PER IL MAIN CHE CHIEDE SE SEI ADMIN O NO
            return registrato = true;
        }
    }

    //Metodo preso tramite override dalla classe Utente che si occupa del login di un utente
    @Override
    public boolean login(String username, String password) 
    {
        boolean accessoRiuscito = false;

        if (this.username.equals(username) && this.password.equals(password))
        {
            System.out.println("\nAccesso eseguito con successo!!!");
            return accessoRiuscito = true;
        }
        else
        {
            System.out.println("Accesso non avvenuto...");
            return accessoRiuscito;
        }
    }
    
    public void isAdmin ()
    {
        if (this.password.equals(passwordAdmin))
        {
            this.adminCheck = true;
            System.out.println("\nCiao " + this.username + ", ora sei admin");
        }
        else
        {
            System.out.print("Password non corretta");
        }
    }

    public void viewUsers (ArrayList<UtenteFiglio> arrayProva)
    {
        System.out.println();
        for (int i = 0; i < arrayProva.size(); i++)
        {
            System.out.println("Nome: " + arrayProva.get(i).getUsername());
        }
        System.out.println();
    }

    public boolean deleteUser (Utente user)
    {
        boolean accessoElimina = false;

        if (!this.adminCheck)
        {
            System.out.println("\nNon sei un admin");
            return accessoElimina;
        }
        if (!this.password.equals(passwordAdmin)) 
        {
            System.out.println("Password admin non corretta");
            return accessoElimina;
        }
        return accessoElimina = true;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    // Getter per username
    public String getUsername() 
    {
        return this.username;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    // Getter per isAdmin
    public boolean getIsAdmin() 
    {
        return this.adminCheck;
    }
}
