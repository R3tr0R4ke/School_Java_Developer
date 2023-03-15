package School_Java_Developer.ScriptJava.Astrazione;

import java.util.ArrayList;

public class ShapeManager 
{
    //ArrayList che conterrà tutte le figure
    private ArrayList<Shape> myShape;

    public ShapeManager (ArrayList<Shape> myShape)
    {
        this.myShape = new ArrayList<>();
    }

    public void addShape(Shape shape)
    {
        //Aggiungo la figura all'ArrayList
        myShape.add(shape);
    }

    //Metodo che ritorna tutte le figure presenti nell'ArrayList
    public ArrayList<Shape> getShapes ()
    {
        return myShape;
    }

    public double getAreatot ()
    {
        double areaTot = 0;
        for (Shape shape : myShape)
        {
            //Calcolo l'area tot prendendo l'area di tutte le figure inserite
            areaTot =  areaTot + shape.getArea();
        }
        return areaTot;
    }

    public double getPerimetroTot ()
    {
        double perimetroTot = 0;
        for (Shape shape : myShape)
        {
            //Calcolo il perimetro tot prendendo i perimetri di tutte le figure inserite
            perimetroTot = perimetroTot + shape.getPerimetro();
        }
        return perimetroTot;
    }
}