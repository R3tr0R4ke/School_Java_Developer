package School_Java_Developer.ScriptJava.Persone;

public class Main 
{
    public static void main (String [] args)
    {
        Persona primaPersona = new Persona(null);
        Persona secondaPersona = new Persona(null);
        Pirata pirata = new Pirata(null, null);

        System.out.print("Inserisci il nome della prima persona: ");
        primaPersona.setNome();
        System.out.print("Inserisci il nome della seconda persona: ");
        secondaPersona.setNome();
        System.out.print("Inserisci il nome del pirata: ");
        pirata.setNome();
        pirata.setSalutoPirata();

        System.out.println("\n" + primaPersona.getNome() + " saluta dicendo " + primaPersona.getSaluto());
        System.out.println("\n" + secondaPersona.getNome() + " saluta dicendo " + secondaPersona.getSaluto());

        System.out.println("\n" + pirata.getNome() + " saluta dicendo " + pirata.getSalutoPirata());
    } 
}