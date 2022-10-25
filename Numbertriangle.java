import java.util.Scanner;

public class Numbertriangle {
    public static void main(String[] arg){
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(" ");
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }
    }
}
