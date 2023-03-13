package School_Java_Developer.ScriptJava.TryCatch;

public class esempioTryCatch 
{
    public static void main (String [] args)
    {
    
        for (int i = 0; i < 1; i++)
        {
            try
            {
                int [] myNumbers = {1, 2, 3, 4};
                System.out.println(myNumbers[12]);
            }
            catch (Exception e)
            {
                System.out.println("Qualcosa non è andato...");
            }
            finally
            {
                System.out.println("Il try catch è finito");
            }
        } 
    }   
}