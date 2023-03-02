public class MainFibonacci {    
    public static void main (String [] args)
    {
        MenuFibonacci myMenu = new MenuFibonacci();
        ConnectionFibonacci connessione = new ConnectionFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root", "root");
        
        connessione.CreaConnessione();

        myMenu.MenuNavigazione();
    }
}