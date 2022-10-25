import java.util.*;

public class Palindrome
{
    public static void main(String[] arg)
    {
       int flag=0;
       System.out.println("Enter a string:");
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       int l=str.length();
       for(int i=0;i<l;i++){
           if(str.charAt(i)!=str.charAt(l-1-i))
               flag++;
       }
       if(flag==0)
           System.out.println("Palindrom");
       else
           System.out.println("Not Palindrom");




    }
}