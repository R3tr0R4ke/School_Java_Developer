package School_Java_Developer.ScriptJava.Utenti_interfacce;

interface Utente 
{
    final String passwordAdmin = "test123";
    public boolean register (String username, String password);
    public boolean login (String username, String password);
}