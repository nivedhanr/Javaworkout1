import java.util.Scanner;

public class Perfectsquare {
    static void psquares(int l,int u){
        for(int i=l;i<=u;i++)
        {
            if(Math.sqrt(i)==(int)Math.sqrt(i))
                System.out.print(i+",");
        }
    }


    public static void main(String[] arg){
        int l,u;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the lower limit number:");
        l=s.nextInt();
        System.out.println("Enter the upper limit number:");
        u=s.nextInt();
        System.out.print("Perfect squares are ");
        psquares(l,u);

    }
}
