package School_Java_Developer.ScriptJava.Override.Esempio2;

public class Child extends Parent
{
    @Override
    void show(){
        super.show();
        System.out.println("Child's show()");
    }    
}
