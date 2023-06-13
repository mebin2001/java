import java.util.Scanner;

public class Area
{
    void findArea(float a){
        System.out.println("Area of square="+a*a);
    }
    void findArea(int l,int b){
        System.out.println("area of rectangle="+l*b);
    }
    void findArea(double r){
        System.out.println("area of circle="+r*3.14);
    

    }
    public static void main(string[] args)
    {
        area a1=new Area();
        System.out.println("Enter the side of the square:");
        Scanner s1=new Scanner(system.in);
        Float side=s1.nextFloat();
        a1.findArea(side);

    }
}