public class getterSetter 
{
    private static String name;
    
    public getterSetter(String nome)        //Costruttore
    {
        this.name = nome;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String newName) 
    {
        this.name = newName;
    }

    public static void main (String [] args)
    {
        getterSetter nome = new getterSetter("Mirko");

        nome.setName("Pippo");
        
        //nome.name = "Antonio";

        System.out.print(nome.getName());
    }
}
