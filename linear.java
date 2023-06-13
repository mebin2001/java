import java.util.Scanner;
public class Linear1 {
    public static void main(String args[])
    {
        int n,array[],c,item;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=s1.nextInt();
        array=new int[n];
        System.out.println("Enter the ten elements");
        for(c=0;c<n;c++)
        {
        array[c]=s1.nextInt();
        }
        System.out.println("Enter the value to search:");
        item=s1.nextInt();
        for(c=0;c<n;c++)
        {
            if(array[c]==item){

            System.out.println(item+"is found at position"+c+1);
            break;
            }
            if(c==n){
                System.out.println(item+"is not found at position"+c+1);
            }

        }




    }
    
}
