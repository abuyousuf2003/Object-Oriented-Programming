class Shape{
    double A,B;
    public Shape(double A ,double B)
    {
        this.A=A;
        this.B=B;
    }
    public Shape(double A )
    {
        this.A=A;
        this.B=0.0;
    }
    void displayIt()
    {
        System.out.println("Type Of Shape: ");
    }
}
class Ractangle extends Shape{

public Ractangle(double A ,double B)
{
   super(A,B);
}
@Override
void displayIt()
    {
        System.out.println("Type Of Shape: Ractangle");
    }


}
class Circle extends Shape{
   
    public Circle(double A)
    {
       super(A);
    }
    @Override
void displayIt()
    {
        System.out.println("Type Of Shape: Circle");
    }
}


public class three {
    public static void main(String[]args)
    {
        Circle c= new Circle(5.9);
        Ractangle r=new Ractangle(3.9, 5.0);
        c.displayIt();
        r.displayIt();
    }
}
