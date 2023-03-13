package School_Java_Developer.ScriptJava.InnerClass.esercizio1;

public class Utente
    {
        private String nomeUtente;
        private String password;
        private int id;

        //Costruttore
        public Utente (String nomeUtente, String password, int id)
        {
            this.nomeUtente = nomeUtente;
            this.password = password;
            this.id = id;
        }

        public void setNomeUtente (String nome)
        {
            this.nomeUtente = nome;
        }

        public String getNomeUtente ()
        {
            return nomeUtente;
        }

        public void setPassword (String password)
        {
            this.password = password;
        }

        public String getPassword ()
        {
            return password;
        }

        public void setId (int id)
        {
            this.id = id;
        }

        public int getId ()
        {
            return id;
        }
    }