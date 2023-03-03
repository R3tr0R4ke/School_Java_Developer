package School_Java_Developer.ScriptJava.Venerdi3;

public class MainBlioteca 
{
    public static Biblioteca LibroPrimo = new Biblioteca("Geronimo Stilton", 15, 0);
    static Biblioteca LibroSecondo = new Biblioteca("KaliGuide", 5, 0);
    static Biblioteca LibroTerzo = new Biblioteca("CiccioGamer89", 5, 0);
    static Biblioteca LibroQuarto = new Biblioteca(null, 5, 0);
    static Biblioteca LibroQuinto = new Biblioteca(null, 5, 0);

    public static void main (String [] args)
    {
        
        
        System.out.println(LibroPrimo.getLibro());
        System.out.println(LibroPrimo.numCopie);
        System.out.println(LibroPrimo.copiePrestate);
    }


}
