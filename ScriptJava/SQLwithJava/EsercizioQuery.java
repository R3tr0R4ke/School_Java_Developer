import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EsercizioQuery 
{
    static Scanner myInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        Connection conn = null;

        try 
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            
            if(conn == null)
            {
                System.out.println("Connessione non stabilita");
            }
            else
            {
                System.out.println("Connessione avvenuta con successo");
            }

            System.out.print("\nInserisci il codice della nazione: ");
            String cod = "%" + myInput.nextLine() + "%";

            System.out.print("\nLa popolazione deve essere superiore a: ");
            int popolazione = myInput.nextInt();

            System.out.print("\nVuoi mostrare nome nazione? ( si / no): ");
            String nome = myInput.nextLine();

            System.out.print("Come vuoi ordinare?\n1: Crescente\n2: Decrescente\nInserisci scelta: ");
            int sceltaOrd = myInput.nextInt();

            String ordinamento;
            if (sceltaOrd == 1)
            {
                ordinamento = "ASC";
            }
            else
            {
                ordinamento = "DESC";
            }
            String query = "SELECT Code, CASE WHEN 0 != ? THEN name ELSE 'nome nascosto' END AS Nome, Popolazione " 
                            + "FROM world.country WHERE Popolazione  >= ? && Code LIKE (?) " 
                            + "ORDER BY Popolazione " + ordinamento;

            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, nome);
            stm.setInt(2, popolazione);
            stm.setString(3, cod);

            ResultSet rs = stm.executeQuery();
            while (rs.next())
            {
                String tableFormat = String.format("Codice Nazione: %s Nome: %s Popolazione: %s", 
                rs.getString(1),
                rs.getString(2),
                rs.getString(3));

                System.out.println(tableFormat);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            
    }
}
