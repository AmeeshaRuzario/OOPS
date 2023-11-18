import java.util.Scanner;

abstract class shapearea
{
    double h=3;
    double b=6;
    abstract void findarea();
}

class triangle extends shapearea
{
     void findarea()
     {
         double area = 0.5 * h* b;
         System.out.println("area of triangle is " + area);
     }
}
 class rectangle extends shapearea
 {
     void findarea()
     {
         double area = h*b;
         System.out.println("area of rectangle is " + area);
     }
 }

 class circle extends shapearea{
    void findarea()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the radius");
        double r = s.nextInt();
        double area = 3.14*r*r;
        System.out.println("area of circle is " + area);

    }
 }

 public class shape {
    public static void main(String[] args) {
        triangle obj1= new triangle();
        rectangle obj2 = new rectangle();
        circle obj3 = new circle();
       obj1.findarea();
       obj2.findarea();
       obj3.findarea();


    }

}
