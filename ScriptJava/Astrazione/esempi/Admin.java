package RepoGithub.School_Java_Developer.ScriptJava.Astrazione.esempi;

class Admin
{
    private static String password = "test123";
    
    public static String getPassword() 
    {
        return password;
    }

    public static PosizioneLavoro creaPosizioneLavoro(String nome, int durata) 
    {
        return new PosizioneLavoro() 
        {
            @Override
            public String getNomeLavoro() 
            {
                return nome;
            }

            @Override
            public int getDurataLavoro() 
            {
                return durata;
            }
        };
    }       
}
