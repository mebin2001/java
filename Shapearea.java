import java.util.Scanner;
public class Shapearea
{
    void calculatearea(float a)
    {
        System.out.println("\n Area of the square="+a*a);
    }
    void calculatearea(int l,int b)
    {
        System.out.println("\n Area of the rectangle="+l*b);
    }
    void calculatearea(double r)
    {
        System.out.println("\n Area of the circle="+3.14*r*r);
    }
    public static void main(String args[])
    {
        Shapearea obj=new Shapearea();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n ENTER SIDEOF SQUARE\n");
        float side=sc.nextFloat();
        obj.calculatearea(side);
        System.out.println("\n\n ENTER RADIUS\n");
        double rad=sc.nextDouble();
        obj.calculatearea(rad);
        System.out.println("ENTER SIDE OF RECTANGLES\n");
        int side1=sc.nextInt();
          int side2=sc.nextInt();
        obj.calculatearea(side1,side2);

    }
}