public class StringManupulation
{
    public static void main(String[] args) 
    {
        System.out.println("\n \n****creating_of_strings****");
        char arrSample[]={'R','O','S','E'};
        String strSample_1=new String(arrSample);
        System.out.println("\n Created_from_char[]_using_new_string:"+strSample_1);
        byte ascii[]={65,66,67,68,69,70};
        String strSample_2=new String(ascii);
        System.out.println("\n Created from byte[]:"+strSample_2);

        System.out.println("\n****Getting_String_length****");
        System.out.println("\n Length of"+strSample_1+"is"+strSample_1.length());
        System.out.println("\n****String_concatenation****");
        String strSample_3=strSample_1.concat(strSample_2);
        System.out.println("\n Using concat():"+strSample_3);
        String strSample_4=strSample_1+strSample_2;
        System.out.println("\n Using + operator:"+strSample_4);

        System.out.println("\n****String comparison****");
        System.out.println("\n \n######USING COMPARETO######");
        String str_Sample="Rockstar";
        System.out.println("\n Compare 'Rockstar' TO 'ROCKSTAR':"+str_Sample.compareTo("ROCKSTAR"));
        System.out.println("\n compare 'Rockstar' TO 'Rockstar'caseignored:"+str_Sample.compareToIgnoreCase("ROCKSTAR"));
        System.out.println("\n \n ######USING EQUALS######");
        System.out.println("\n 'Rockstar'equals('ROCKSTAR')is:"+str_Sample.equals("Rockstar"));
        System.out.println("\n 'Rockstar'equals('ROCKSTAR')is if case Ignored:"+str_Sample.equalsIgnoreCase("Rockstar"));
        System.out.println("\n \n ######USING INDEXOF######");
        System.out.println("\n index of 'star'in 'Rockstar'is:"+str_Sample.indexOf("t"));
        System.out.println("\n index of 'star'in 'Rockstar'is:"+str_Sample.indexOf("star"));

        System.out.println("\n ****Modifying a string****");
        System.out.println("\n changing case of characters in the string");
        System.out.println("\n All caps 'Rockstar':"+str_Sample.toUpperCase());
        System.out.println("\n All caps 'Rockstar':"+str_Sample.toLowerCase());

        System.out.println("\n \n #####USING REPLACE#####");
        System.out.println("\n \n 'ROCKSTAR'replace'Star'with'et'"+str_Sample.replace("star","et"));
    





        



        
    }
}