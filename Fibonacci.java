import java.util.Scanner;

public class Fibonacci {
    public static int fRecursion(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return fRecursion(n-2)+fRecursion(n-1);
    }
    public static void main(String[] arg)
    {
        int maxNum;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        maxNum=s.nextInt();
        System.out.println("Fibonacci series of"+maxNum+"numbers:");
        for(int i=0;i< maxNum;i++)
        {
            System.out.println(fRecursion(i)+"");
        }
        s.close();
    }
}

