class product
{
    String PCode,PName;
    int price;
    public product()
    {
    }
    public product(String Pid,String Name,int Cost)
    {
        this.PCode=Pid;
        this.PName=Name;
        this.price=Cost;
    }
    public int getprice()
    {
        return price;
    }
    public void display()
    {
        System.out.println("product code="+this.PCode);
        System.out.println("product name"+this.PName);
        System.out.println("product price"+this.price);
    }
}
    public class exp1
    {
        public static void main(String args[])
        {
            product p1=new product("111","toyota",200000);
            p1.display();
            product p2=new product("112","tata",1000000);
            p2.display();
             product p3=new product("113","maruthi",500000);
            p3.display();
            product Lp=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
            System.out.println("lowest price");
            Lp.display();
            product p4=new product();
            p4.PCode="114";
            p4.PName="ford";;
            p4.price=400000;
            p4.display();









        }
    }
