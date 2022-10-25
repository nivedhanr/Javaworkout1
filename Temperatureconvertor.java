import java.util.Scanner;

public class Temperatureconvertor {
    public static void main(String[] arg){
        double c,f;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit:");
        f=s.nextDouble();
        c=(f-32)*5/9;
        System.out.println("Temperature in celsius="+c);
    }
}
